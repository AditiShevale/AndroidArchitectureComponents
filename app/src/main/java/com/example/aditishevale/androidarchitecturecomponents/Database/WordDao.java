package com.example.aditishevale.androidarchitecturecomponents.Database;


import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;
@Dao
public interface WordDao {

    @Insert
    void insert(Word word);

    @Update
    void update(Word word);


    @Query("DELETE FROM word_table WHERE id=:id")
    void delete(int id);

    @Delete
    void deleteFromObj(Word word);


    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();

}
