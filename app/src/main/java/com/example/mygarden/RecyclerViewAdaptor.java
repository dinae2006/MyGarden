package com.example.mygarden;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptor extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<Item> itemList;
    private MainActivity mainActivity;

    public RecyclerViewAdaptor(List<Item> itemList, MainActivity mainActivity) {
        this.itemList = itemList;
        this.mainActivity = mainActivity;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        ItemHolder itemHolder=new ItemHolder(view);
        return itemHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemHolder itemHolder=(ItemHolder) holder;
        itemHolder.description.setText(itemList.get(position).getDescribe());
        itemHolder.plantName.setText(itemList.get(position).getPlantName());
        itemHolder.storeName.setText(itemList.get(position).getStoreName());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    class ItemHolder extends RecyclerView.ViewHolder{
        ImageView plantImage;
        TextView description;
        TextView plantName;
        TextView storeName;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            plantImage=itemView.findViewById(R.id.PlantImage);
            plantName=itemView.findViewById(R.id.plantNameTV);
            description=itemView.findViewById(R.id.describeTV);
            storeName=itemView.findViewById(R.id.storeNameTV);
        }
    }
}
