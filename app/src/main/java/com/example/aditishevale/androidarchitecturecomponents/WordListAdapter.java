package com.example.aditishevale.androidarchitecturecomponents;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.aditishevale.androidarchitecturecomponents.Database.Word;

import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter
        .MyViewHolder> {
//    private final RecyclerViewClickListener mListener;
    private LayoutInflater mInflater;
    private List<Word> mWords;


    // Cached copy of words

    public interface RecyclerViewClickListener{
        void onClick(Word word);
    }




    WordListAdapter(Context context ){
        mInflater = LayoutInflater.from(context);
//        mListener = clickListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.custom_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Word current = mWords.get(position);
        holder.wordItemView.setText(current.getWord());
        //setting the tag to retrive it in the delete
        holder.itemView.setTag(current.getId());

    }

    @Override
    public int getItemCount() {
        if (mWords != null)
            return mWords.size();
        else return 0;
    }

    void setWords(List<Word> words) {
        mWords = words;
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView wordItemView;

        public MyViewHolder(View itemView) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.txt_custom);
        }

        @Override
        public void onClick(View v) {
            int adapterPosition = getAdapterPosition();
            Word word= mWords.get(adapterPosition);
//            mListener.onClick(word);

        }
    }



}
