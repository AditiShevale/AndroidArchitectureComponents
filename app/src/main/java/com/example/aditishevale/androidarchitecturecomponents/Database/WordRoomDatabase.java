package com.example.aditishevale.androidarchitecturecomponents.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
@Database(entities = {Word.class}, version = 2)
public abstract class WordRoomDatabase extends RoomDatabase {

    public abstract WordDao wordDao();

}
