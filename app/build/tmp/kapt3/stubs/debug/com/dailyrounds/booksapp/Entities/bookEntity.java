package com.dailyrounds.booksapp.Entities;

import java.lang.System;

@androidx.room.Entity(tableName = "books_table")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u001a\u00a8\u0006\u001f"}, d2 = {"Lcom/dailyrounds/booksapp/Entities/bookEntity;", "", "id", "", "alias", "hits", "", "image", "lastChapterDate", "title", "fav", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Z)V", "getAlias", "()Ljava/lang/String;", "getFav", "()Z", "setFav", "(Z)V", "getHits", "()I", "setHits", "(I)V", "getId", "getImage", "setImage", "(Ljava/lang/String;)V", "getLastChapterDate", "setLastChapterDate", "getTitle", "setTitle", "app_debug"})
public final class bookEntity {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey(autoGenerate = false)
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "alias")
    private final java.lang.String alias = null;
    @androidx.room.ColumnInfo(name = "hits")
    private int hits;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "image")
    private java.lang.String image;
    @androidx.room.ColumnInfo(name = "lastChapterDate")
    private int lastChapterDate;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private java.lang.String title;
    @androidx.room.ColumnInfo(name = "fav")
    private boolean fav;
    
    public bookEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String alias, int hits, @org.jetbrains.annotations.NotNull()
    java.lang.String image, int lastChapterDate, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean fav) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlias() {
        return null;
    }
    
    public final int getHits() {
        return 0;
    }
    
    public final void setHits(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getLastChapterDate() {
        return 0;
    }
    
    public final void setLastChapterDate(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getFav() {
        return false;
    }
    
    public final void setFav(boolean p0) {
    }
}