package com.example.aditishevale.androidarchitecturecomponents;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aditishevale.androidarchitecturecomponents.Database.Word;

import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter
        .MyViewHolder> {

    private LayoutInflater mInflater;
    private List<Word> mWords;
    // Cached copy of words


    WordListAdapter(Context context){
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.custom_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }



}
