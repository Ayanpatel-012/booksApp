package com.dailyrounds.booksapp.Repositories

import com.dailyrounds.booksapp.Daos.BooksDao
import com.dailyrounds.booksapp.Entities.bookEntity
import com.dailyrounds.booksapp.models.Book

class BooksRepo(private val bookDao:BooksDao,) {
suspend fun insertBooks(booksList:ArrayList<Book>)
{
    try{
        booksList.forEach{
            val bookEntity=bookEntity(
                id = it.id, hits = it.hits, alias = it.alias,
                image = it.image, lastChapterDate = it.lastChapterDate,
                title = it.title, fav = it.fav
            )
            bookDao.insert(bookEntity)
        }
    }
    catch(e:Exception){
    throw e
    }
}
    suspend fun updateBook(id:String,newValue:Boolean){
        try {
            bookDao.update(id,newValue)
        }
        catch (e:Exception){
            throw e
        }
    }
    suspend fun getBooksList(): ArrayList<Book> {
        var bookListFromDB=ArrayList<Book>()
        try {
            val data=bookDao.getBooks()
            data.forEach{
                bookListFromDB.add(
                    Book(
                        id = it.id, hits = it.hits, alias = it.alias,
                        image = it.image, lastChapterDate = it.lastChapterDate,
                        title = it.title, fav = it.fav
                )
                )
            }
        }
        catch (e:Exception){throw e}
        return bookListFromDB
    }
}