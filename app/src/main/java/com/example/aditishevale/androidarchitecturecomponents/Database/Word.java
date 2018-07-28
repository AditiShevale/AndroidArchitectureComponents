package com.example.aditishevale.androidarchitecturecomponents.Database;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {

   @PrimaryKey(autoGenerate = true)
   private  int id;

  @ColumnInfo(name = "word")
   private String word;

    /*Constructor of class Word*/

    public Word(String word) {
        this.word = word;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
