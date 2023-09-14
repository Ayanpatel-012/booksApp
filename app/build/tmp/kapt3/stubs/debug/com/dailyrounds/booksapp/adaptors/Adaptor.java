package com.dailyrounds.booksapp.adaptors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/dailyrounds/booksapp/adaptors/Adaptor;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dailyrounds/booksapp/adaptors/Adaptor$BookViewHolder;", "bookList", "Ljava/util/ArrayList;", "Lcom/dailyrounds/booksapp/models/Book;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/dailyrounds/booksapp/adaptors/EventClickListener;", "(Ljava/util/ArrayList;Lcom/dailyrounds/booksapp/adaptors/EventClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BookViewHolder", "app_debug"})
public final class Adaptor extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dailyrounds.booksapp.adaptors.Adaptor.BookViewHolder> {
    private final java.util.ArrayList<com.dailyrounds.booksapp.models.Book> bookList = null;
    private final com.dailyrounds.booksapp.adaptors.EventClickListener listener = null;
    
    public Adaptor(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.dailyrounds.booksapp.models.Book> bookList, @org.jetbrains.annotations.NotNull()
    com.dailyrounds.booksapp.adaptors.EventClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dailyrounds.booksapp.adaptors.Adaptor.BookViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dailyrounds.booksapp.adaptors.Adaptor.BookViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/dailyrounds/booksapp/adaptors/Adaptor$BookViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/dailyrounds/booksapp/adaptors/Adaptor;Landroid/view/View;)V", "bookImg", "Landroid/widget/ImageView;", "getBookImg", "()Landroid/widget/ImageView;", "favImg", "getFavImg", "hitsCnt", "Landroid/widget/TextView;", "getHitsCnt", "()Landroid/widget/TextView;", "subTitle", "getSubTitle", "title", "getTitle", "app_debug"})
    public final class BookViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView title = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView hitsCnt = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView subTitle = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView bookImg = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView favImg = null;
        
        public BookViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getHitsCnt() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSubTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getBookImg() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getFavImg() {
            return null;
        }
    }
}