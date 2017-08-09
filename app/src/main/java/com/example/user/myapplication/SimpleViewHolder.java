package com.example.user.myapplication;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by user on 8/9/2017.
 */

public class SimpleViewHolder extends RecyclerView.ViewHolder{

    TextView mTextView;

    public SimpleViewHolder(View itemView) {
        super(itemView);
        mTextView=(TextView)itemView.findViewById(R.id.list_simple_string);
    }
}
