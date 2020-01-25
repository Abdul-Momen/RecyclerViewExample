package com.momen.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView food_name,food_like;


    //get data
    int image;
    String name,like;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //find id in activity
        imageView = findViewById(R.id.iv_details_image_id);
        food_name=findViewById(R.id.tv_details_name_id);
        food_like=findViewById(R.id.tv_details_like_id);


      //get data in activity
      image=getIntent().getIntExtra("image",0);
      name=getIntent().getStringExtra("name");
      like=getIntent().getStringExtra("like");


      //set data in View
      imageView.setImageResource(image);
      food_name.setText(name);
      food_like.setText(like);



    }
}
