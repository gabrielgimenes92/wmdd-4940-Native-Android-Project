package com.example.nativeandroidproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Comic> mData;
    View v;

    public RecyclerViewAdapter(Context mContext, List<Comic> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        v = LayoutInflater.from(mContext).inflate(R.layout.item_comic,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Comic comic = mData.get(position);
        holder.setmTitle(comic.getTitle());
        holder.setImageView(comic.getUrl());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mTitle;
        ImageView mUrl;
        View v;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            v = itemView;
        }

        public void setmTitle(String title){
            mTitle = v.findViewById(R.id.comicTitle);
            mTitle.setText(title);
        }

        public void setImageView(String url) {
            mUrl = v.findViewById(R.id.comicImage);
            Glide.with(mContext).load(url).into(mUrl);
        }

    }
}
