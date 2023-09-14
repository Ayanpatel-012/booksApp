package com.dailyrounds.booksapp.viewmodels

import android.app.Application
import android.content.res.AssetManager
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Database
import com.dailyrounds.booksapp.Database.MyDatabase
import com.dailyrounds.booksapp.Entities.bookEntity
import com.dailyrounds.booksapp.Repositories.BooksRepo
import com.dailyrounds.booksapp.models.Book
import com.dailyrounds.booksapp.models.BookList
import com.dailyrounds.booksapp.utils.ReadJSONFromAssets
import com.google.gson.Gson
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class HomeViewmodel:ViewModel() {
    private lateinit var  repository:BooksRepo
    private lateinit var database: MyDatabase
    val booksLiveData:LiveData<ArrayList<Book>>
        get() {
          return  _booksLiveData
        }
    private var _booksLiveData=MutableLiveData<ArrayList<Book>>()
    fun initDb(db:MyDatabase){
        this.database=db
        repository=BooksRepo(db.BooksDao())
    }
  suspend  fun saveBooks(booksList:BookList){
          repository.insertBooks(booksList)

  }
      fun getBooks(){
          viewModelScope.launch {
              _booksLiveData.value= repository.getBooksList()
          }


    }
     fun updateBook(id:String,newValue:Boolean){
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateBook(id,newValue)
        }
    }
}