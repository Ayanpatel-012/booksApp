package com.dailyrounds.booksapp.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "books_table")
class bookEntity (
    @PrimaryKey(autoGenerate = false)
    val id: String,
    @ColumnInfo(name = "alias")
    val alias: String,
    @ColumnInfo(name = "hits")
    var hits: Int,
    @ColumnInfo(name = "image")
    var image: String,
    @ColumnInfo(name = "lastChapterDate")
    var lastChapterDate:Int,
    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "fav")
    var fav:Boolean
)