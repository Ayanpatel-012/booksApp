package com.dailyrounds.booksapp.Daos;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.dailyrounds.booksapp.Entities.bookEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BooksDao_Impl implements BooksDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<bookEntity> __insertionAdapterOfbookEntity;

  private final SharedSQLiteStatement __preparedStmtOfUpdate;

  public BooksDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfbookEntity = new EntityInsertionAdapter<bookEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `books_table` (`id`,`alias`,`hits`,`image`,`lastChapterDate`,`title`,`fav`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, bookEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getAlias() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAlias());
        }
        stmt.bindLong(3, value.getHits());
        if (value.getImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImage());
        }
        stmt.bindLong(5, value.getLastChapterDate());
        if (value.getTitle() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTitle());
        }
        final int _tmp = value.getFav() ? 1 : 0;
        stmt.bindLong(7, _tmp);
      }
    };
    this.__preparedStmtOfUpdate = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE books_table SET fav = ? WHERE id= ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final bookEntity book, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfbookEntity.insert(book);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final String id, final boolean newValue,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdate.acquire();
        int _argIndex = 1;
        final int _tmp = newValue ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdate.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getBooks(final Continuation<? super List<bookEntity>> continuation) {
    final String _sql = "SELECT * FROM books_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<bookEntity>>() {
      @Override
      public List<bookEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAlias = CursorUtil.getColumnIndexOrThrow(_cursor, "alias");
          final int _cursorIndexOfHits = CursorUtil.getColumnIndexOrThrow(_cursor, "hits");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfLastChapterDate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastChapterDate");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfFav = CursorUtil.getColumnIndexOrThrow(_cursor, "fav");
          final List<bookEntity> _result = new ArrayList<bookEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final bookEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpAlias;
            if (_cursor.isNull(_cursorIndexOfAlias)) {
              _tmpAlias = null;
            } else {
              _tmpAlias = _cursor.getString(_cursorIndexOfAlias);
            }
            final int _tmpHits;
            _tmpHits = _cursor.getInt(_cursorIndexOfHits);
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final int _tmpLastChapterDate;
            _tmpLastChapterDate = _cursor.getInt(_cursorIndexOfLastChapterDate);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final boolean _tmpFav;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfFav);
            _tmpFav = _tmp != 0;
            _item = new bookEntity(_tmpId,_tmpAlias,_tmpHits,_tmpImage,_tmpLastChapterDate,_tmpTitle,_tmpFav);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
