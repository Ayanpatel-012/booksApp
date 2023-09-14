package com.dailyrounds.booksapp.activities

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.dailyrounds.booksapp.Database.MyDatabase
import com.dailyrounds.booksapp.viewmodels.HomeViewmodel
import com.dailyrounds.booksapp.adaptors.Adaptor
import com.dailyrounds.booksapp.adaptors.EventClickListener
import com.dailyrounds.booksapp.databinding.ActivityHomeBinding
import com.dailyrounds.booksapp.enums.Sort
import com.dailyrounds.booksapp.models.Book
import com.dailyrounds.booksapp.models.BookList
import com.dailyrounds.booksapp.utils.ReadJSONFromAssets
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity(),EventClickListener {
    private lateinit var viewmodel: HomeViewmodel
    private lateinit var binding:ActivityHomeBinding
    private var bookList= ArrayList<Book>()
    private var adaptor:Adaptor?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setupViewmodel()
        setContentView(binding.root)
        setActionBar(null)
        setupObservers()
        setupRv()
        setupListeners()



    }

    private fun setupViewmodel() {
        viewmodel= ViewModelProvider(this)[HomeViewmodel::class.java]
        val db= MyDatabase.getDatabase(this)
        viewmodel.initDb(db)
        getBooks()
    }

    private fun setupListeners() {
    binding.sortHits.setOnClickListener {
       sortBy(Sort.HITS)
    }
        binding.sortTitle.setOnClickListener {
            sortBy(Sort.TITLE)
        }
        binding.sortFavs.setOnClickListener {
            sortBy(Sort.FAVS)
        }

    }
    private fun getBooks(){
        try {
                if( !getSharedPreferences("MySharedPrefs",Context.MODE_PRIVATE).contains("Intialized")){
                    val jsonString= ReadJSONFromAssets(this,"booksData.json")
                    val data= Gson().fromJson(jsonString, BookList::class.java)
                    lifecycleScope.launch(Dispatchers.IO){
                        viewmodel.saveBooks(data as BookList)
                        viewmodel.getBooks()
                        getSharedPreferences("MySharedPrefs",Context.MODE_PRIVATE).edit().putBoolean("Intialized",true).commit()
                    }
                }
            else {
                viewmodel.getBooks()
            }



        }
        catch (e:Exception){
        }

    }

    private fun setupRv() {
        adaptor=Adaptor(bookList,this)
        binding.rv.let {
            it.adapter=adaptor
            it.layoutManager=LinearLayoutManager(this)
        }
        viewmodel.getBooks()
    }

    private fun setupObservers() {
        viewmodel.booksLiveData.observe(this){
            bookList.clear()
            bookList.addAll(it)
            adaptor?.notifyDataSetChanged()
        }
    }



    override fun onFavClicked(id: String, newValue: Boolean) {
        viewmodel.updateBook(id,newValue)
    }

    private fun sortBy(enum: Sort) {
        when(enum){
            Sort.HITS->{
                bookList.sortBy { book->book.hits }
            }
            Sort.FAVS->{
                val favs=bookList.filter { book -> book.fav }
                val notFavs=bookList.filterNot{ book -> book.fav }
                bookList.clear()
                bookList.addAll(favs)
                bookList.addAll(notFavs)

            }
            Sort.TITLE->{
                bookList.sortBy { book->book.title }
            }

        }
        adaptor?.notifyDataSetChanged()
    }

}