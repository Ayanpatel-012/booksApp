package com.dailyrounds.booksapp.activities

import android.R
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.InputFilter
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.dailyrounds.booksapp.Database.MyDatabase
import com.dailyrounds.booksapp.databinding.ActivityRegisterBinding
import com.dailyrounds.booksapp.models.BookList
import com.dailyrounds.booksapp.utils.ReadJSONFromAssets
import com.dailyrounds.booksapp.viewmodels.HomeViewmodel
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class RegisterActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        updateUI()
        binding= ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initTextWatchersAndListener()

    }

    private fun updateUI() {
        if(getSharedPreferences("MySharedPrefs",Context.MODE_PRIVATE).getBoolean("isLoggedIn",false)){
            startActivity(Intent(this,HomeActivity::class.java))
            finish()
        }

    }






    private fun initTextWatchersAndListener() {
        val avoidSpaceFilter = InputFilter { source, _, _, _, _, _ ->
            val sourceText = source.toString()
            if (" " !in sourceText) return@InputFilter null // keep original
            sourceText.replace(" ", "")
        }

        binding.etPassword.apply { filters += avoidSpaceFilter }
        binding.etPassword.addTextChangedListener(
            onTextChanged = {text,_,_,_ ->
                validatePassword(text.toString())
            }
        )
        binding.btnRegister.setOnClickListener{
            if(validateName(binding.etName.text.toString().trim()) && validatePassword(binding.etPassword.text.toString().trim())){
                getSharedPreferences("MySharedPrefs",Context.MODE_PRIVATE).edit().putBoolean("isLoggedIn",true).commit()
                startActivity(Intent(this,HomeActivity::class.java))
                finish()
            }
        }

    }
    private fun validateName(username:String):Boolean{
        if(username.isNullOrEmpty()){
            binding.tvNameError.text="Please enter username"
            binding.tvNameError.visibility=View.VISIBLE
            return false
        }
        binding.tvNameError.text=""
        binding.tvNameError.visibility=View.GONE

        return true

    }
    private fun validatePassword(text: String?):Boolean{
        val password=text.toString()
        var  isAtLeast8=false
        var hasUppercase=false
        var hasNumber=false
        var hasSymbol=false

        if(password.isNullOrEmpty()) {
            binding.tvPasswordError.text="Please enter a password"
            binding.tvPasswordError.visibility=View.VISIBLE
            return false
        }
        else{
            binding.tvPasswordError.text=""
            binding.tvPasswordError.visibility=View.GONE
        }

        if (password.length >= 8) {
            isAtLeast8 = true;
            binding.frameOne.setCardBackgroundColor(ContextCompat.getColor(this,R.color.holo_green_dark))
        } else {
            isAtLeast8 = false;
            binding.frameOne.setCardBackgroundColor(ContextCompat.getColor(this,R.color.darker_gray))
        }
        if (password.matches(Regex("(.*[A-Z].*)"))) {
            hasUppercase = true;
            binding.frameTwo.setCardBackgroundColor(ContextCompat.getColor(this,R.color.holo_green_dark))
        } else {
            hasUppercase = false;
            binding.frameTwo.setCardBackgroundColor(ContextCompat.getColor(this,R.color.darker_gray))
        }
        if (password.matches(Regex("(.*[0-9].*)"))) {
            hasNumber = true
            binding.frameThree.setCardBackgroundColor(ContextCompat.getColor(this,R.color.holo_green_dark))
        } else {
            hasNumber = false
            binding.frameThree.setCardBackgroundColor(ContextCompat.getColor(this,R.color.darker_gray))
        }
        if (password.matches(Regex("(.*[!@#$%^&*()].*)"))) {
            hasSymbol = true
            binding.frameFour.setCardBackgroundColor(ContextCompat.getColor(this,R.color.holo_green_dark))
        } else {
            hasSymbol = false;
            binding.frameFour.setCardBackgroundColor(ContextCompat.getColor(this,R.color.darker_gray))
        }
        return isAtLeast8 && hasNumber && hasSymbol && hasUppercase

    }

    private fun clear() {
        binding.apply {
            frameOne.setCardBackgroundColor(ContextCompat.getColor(this@RegisterActivity,R.color.darker_gray))
            frameTwo.setCardBackgroundColor(ContextCompat.getColor(this@RegisterActivity,R.color.darker_gray))
            frameThree.setCardBackgroundColor(ContextCompat.getColor(this@RegisterActivity,R.color.darker_gray))
            frameFour.setCardBackgroundColor(ContextCompat.getColor(this@RegisterActivity,R.color.darker_gray))
            etPassword.text.clear()
            tvPasswordError.visibility=View.GONE
            tvPasswordError.text=""
        }
    }


}
