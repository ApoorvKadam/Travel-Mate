package io.github.project_travel_mate.roompersistence;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EmptyResultSetException;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.RxRoom;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import io.reactivex.Flowable;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import objects.ChecklistItem;

public class ChecklistItemDAO_Impl implements ChecklistItemDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfChecklistItem;

  private final SharedSQLiteStatement __preparedStmtOfUpdateIsDone;

  private final SharedSQLiteStatement __preparedStmtOfUpdateUndone;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCompletedTasks;

  public ChecklistItemDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChecklistItem = new EntityInsertionAdapter<ChecklistItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `events_new`(`id`,`name`,`isDone`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ChecklistItem value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getIsDone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getIsDone());
        }
      }
    };
    this.__preparedStmtOfUpdateIsDone = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE events_new SET isDone = 1 WHERE id IS ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateUndone = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE events_new SET isDone = 0 WHERE id IS ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCompletedTasks = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM events_new WHERE isDone = 1";
        return _query;
      }
    };
  }

  @Override
  public void insertItems(ChecklistItem items) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfChecklistItem.insert(items);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateIsDone(int id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateIsDone.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, id);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateIsDone.release(_stmt);
    }
  }

  @Override
  public void updateUndone(int id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateUndone.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, id);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateUndone.release(_stmt);
    }
  }

  @Override
  public void deleteCompletedTasks() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCompletedTasks.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteCompletedTasks.release(_stmt);
    }
  }

  @Override
  public Flowable<List<ChecklistItem>> getSortedItems() {
    final String _sql = "SELECT * FROM events_new ORDER BY isDone";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, new String[]{"events_new"}, new Callable<List<ChecklistItem>>() {
      public List<ChecklistItem> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfMId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfMName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfMIsDone = _cursor.getColumnIndexOrThrow("isDone");
          final List<ChecklistItem> _result = new ArrayList<ChecklistItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ChecklistItem _item;
            final String _tmpMName;
            _tmpMName = _cursor.getString(_cursorIndexOfMName);
            final String _tmpMIsDone;
            _tmpMIsDone = _cursor.getString(_cursorIndexOfMIsDone);
            _item = new ChecklistItem(_tmpMName,_tmpMIsDone);
            final int _tmpMId;
            _tmpMId = _cursor.getInt(_cursorIndexOfMId);
            _item.setId(_tmpMId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Single<List<ChecklistItem>> getCompletedItems() {
    final String _sql = "SELECT * FROM events_new WHERE isDone = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Single.fromCallable(new Callable<List<ChecklistItem>>() {
      public List<ChecklistItem> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfMId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfMName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfMIsDone = _cursor.getColumnIndexOrThrow("isDone");
          final java.util.List<objects.ChecklistItem> _result = new java.util.ArrayList<objects.ChecklistItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final objects.ChecklistItem _item;
            final java.lang.String _tmpMName;
            _tmpMName = _cursor.getString(_cursorIndexOfMName);
            final java.lang.String _tmpMIsDone;
            _tmpMIsDone = _cursor.getString(_cursorIndexOfMIsDone);
            _item = new objects.ChecklistItem(_tmpMName,_tmpMIsDone);
            final int _tmpMId;
            _tmpMId = _cursor.getInt(_cursorIndexOfMId);
            _item.setId(_tmpMId);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    });
  }
}
