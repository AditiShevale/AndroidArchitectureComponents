package com.example.aditishevale.androidarchitecturecomponents;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.example.aditishevale.androidarchitecturecomponents.Database.Word;
import com.example.aditishevale.androidarchitecturecomponents.Database.WordDao;
import com.example.aditishevale.androidarchitecturecomponents.Database.WordRoomDatabase;

import java.util.List;

public class WordRespository {

    private WordDao mWordDao;

    private LiveData<List<Word>> mAllWords;

    public WordRespository(Application application) {
        WordRoomDatabase db = WordRoomDatabase.getDatabase(application);
        mWordDao = db.wordDao();
        mAllWords = mWordDao.getAllWords();
    }

    public LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    //--------calling the insert async task-----------------

    public void insert(Word word) {
        new insertAsyncTask(mWordDao).execute(word);
    }


    private class insertAsyncTask extends AsyncTask<Word,Void,Void> {

        private WordDao mAsyncTaskDao;

        public insertAsyncTask(WordDao mWordDao) {
            mAsyncTaskDao = mWordDao;
        }



        @Override
        protected Void doInBackground(Word... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
