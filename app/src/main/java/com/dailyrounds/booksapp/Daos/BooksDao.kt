package com.dailyrounds.booksapp.Daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.dailyrounds.booksapp.Entities.bookEntity
import com.dailyrounds.booksapp.models.Book

@Dao
interface BooksDao {
    @Insert
     suspend fun insert(book: bookEntity)
    @Query("UPDATE books_table SET fav = :newValue WHERE id= :id")
     suspend fun update(id:String,newValue:Boolean)
     @Query("SELECT * FROM books_table")
     suspend fun getBooks():List<bookEntity>

}