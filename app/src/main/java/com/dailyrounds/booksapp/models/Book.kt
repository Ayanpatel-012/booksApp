package com.dailyrounds.booksapp.models

data class Book(
    var alias: String,
    var hits: Int,
    var id: String,
    var image: String,
    var lastChapterDate: Int,
    var title: String,
    var fav:Boolean
)