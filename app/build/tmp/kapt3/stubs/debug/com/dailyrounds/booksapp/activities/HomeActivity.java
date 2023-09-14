package com.dailyrounds.booksapp.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0002J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/dailyrounds/booksapp/activities/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/dailyrounds/booksapp/adaptors/EventClickListener;", "()V", "adaptor", "Lcom/dailyrounds/booksapp/adaptors/Adaptor;", "binding", "Lcom/dailyrounds/booksapp/databinding/ActivityHomeBinding;", "bookList", "Ljava/util/ArrayList;", "Lcom/dailyrounds/booksapp/models/Book;", "viewmodel", "Lcom/dailyrounds/booksapp/viewmodels/HomeViewmodel;", "getBooks", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFavClicked", "id", "", "newValue", "", "setupListeners", "setupObservers", "setupRv", "setupViewmodel", "sortBy", "enum", "Lcom/dailyrounds/booksapp/enums/Sort;", "app_debug"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity implements com.dailyrounds.booksapp.adaptors.EventClickListener {
    private com.dailyrounds.booksapp.viewmodels.HomeViewmodel viewmodel;
    private com.dailyrounds.booksapp.databinding.ActivityHomeBinding binding;
    private java.util.ArrayList<com.dailyrounds.booksapp.models.Book> bookList;
    private com.dailyrounds.booksapp.adaptors.Adaptor adaptor;
    
    public HomeActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViewmodel() {
    }
    
    private final void setupListeners() {
    }
    
    private final void getBooks() {
    }
    
    private final void setupRv() {
    }
    
    private final void setupObservers() {
    }
    
    @java.lang.Override()
    public void onFavClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean newValue) {
    }
    
    private final void sortBy(com.dailyrounds.booksapp.enums.Sort p0_1559168) {
    }
}