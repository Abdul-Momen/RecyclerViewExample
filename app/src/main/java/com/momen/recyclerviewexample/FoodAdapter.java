package com.momen.recyclerviewexample;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyViewHolder> {
      List<FoodModel> mylist;
      Context context;

    public FoodAdapter(List<FoodModel> mylist, Context context) {
        this.mylist = mylist;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate layout
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

            //set datta in view
             final FoodModel foodModel=mylist.get(position);
             holder.imageView.setImageDrawable(context.getResources().getDrawable(foodModel.getFoodImage()));
             holder.foodName.setText(foodModel.getFoodName());
             holder.foodlike.setText(foodModel.getFoodlike());


             //pass data intent
             holder.linearLayout.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent intent=new Intent(context,DetailsActivity.class);

                     intent.putExtra("image",foodModel.getFoodImage());
                     intent.putExtra("name",foodModel.getFoodName());
                     intent.putExtra("like",foodModel.getFoodlike());

                     context.startActivity(intent);
                 }
             });



    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        //My view
        ImageView imageView;
        TextView foodName,foodlike;
        LinearLayout linearLayout;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //find sampalLayout view
            imageView=itemView.findViewById(R.id.image_item_id);
            foodName=itemView.findViewById(R.id.tv_item_name_id);
            foodlike=itemView.findViewById(R.id.tv_item_like_id);


            linearLayout=itemView.findViewById(R.id.linearlayout_id);


        }
    }
}