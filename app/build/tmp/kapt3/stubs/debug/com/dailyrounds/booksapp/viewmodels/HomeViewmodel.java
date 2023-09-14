package com.dailyrounds.booksapp.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rJ\u0019\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\'\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/dailyrounds/booksapp/viewmodels/HomeViewmodel;", "Landroidx/lifecycle/ViewModel;", "()V", "_booksLiveData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/dailyrounds/booksapp/models/Book;", "booksLiveData", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getBooksLiveData", "()Landroidx/lifecycle/LiveData;", "database", "Lcom/dailyrounds/booksapp/Database/MyDatabase;", "repository", "Lcom/dailyrounds/booksapp/Repositories/BooksRepo;", "getBooks", "", "initDb", "db", "saveBooks", "booksList", "Lcom/dailyrounds/booksapp/models/BookList;", "(Lcom/dailyrounds/booksapp/models/BookList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBook", "id", "", "newValue", "", "app_debug"})
public final class HomeViewmodel extends androidx.lifecycle.ViewModel {
    private com.dailyrounds.booksapp.Repositories.BooksRepo repository;
    private com.dailyrounds.booksapp.Database.MyDatabase database;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.dailyrounds.booksapp.models.Book>> _booksLiveData;
    
    public HomeViewmodel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.dailyrounds.booksapp.models.Book>> getBooksLiveData() {
        return null;
    }
    
    public final void initDb(@org.jetbrains.annotations.NotNull()
    com.dailyrounds.booksapp.Database.MyDatabase db) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveBooks(@org.jetbrains.annotations.NotNull()
    com.dailyrounds.booksapp.models.BookList booksList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void getBooks() {
    }
    
    public final void updateBook(@org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean newValue) {
    }
}