package com.dailyrounds.booksapp.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.dailyrounds.booksapp.Daos.BooksDao
import com.dailyrounds.booksapp.Entities.bookEntity


@Database(entities = [bookEntity::class], version = 1, exportSchema = false)
abstract class MyDatabase : RoomDatabase() {

    abstract fun BooksDao():BooksDao
    companion object {
        @Volatile
        private var INSTANCE: MyDatabase? = null
        fun getDatabase(context: Context): MyDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyDatabase::class.java,
                    "books_app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}