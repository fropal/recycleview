package com.example.recycleview;

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

public class my_adapter extends RecyclerView.Adapter<my_adapter.ViewHolder>{

    List<modelmakananfaforit> listData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public my_adapter(List<modelmakananfaforit> listData, Context context){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public my_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull my_adapter.ViewHolder holder, int position) {
        final modelmakananfaforit model = this.listData.get(position);
        holder.tvMakananFavorite.setText(model.getIsi());
        //glide
        Glide.with(holder.itemView.getContext())
                .load(model.getImgid())
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.img);
        holder.tvdeskripsi.setText(model.getDeskripsi());
    }


    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tvMakananFavorite;
        ImageView img;
        TextView tvdeskripsi;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMakananFavorite = itemView.findViewById(R.id.tvMakananFav);
            img = itemView.findViewById(R.id.img);
            tvdeskripsi = itemView.findViewById(R.id.tvDeskripsi);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mClickListener != null) mClickListener.onItemClick(v, getAdapterPosition());
        }
    }
    modelmakananfaforit getItem(int id) { return listData.get(id); }

    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}