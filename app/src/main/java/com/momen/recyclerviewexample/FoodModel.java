package com.momen.recyclerviewexample;

import android.widget.ImageView;
import android.widget.TextView;

public class FoodModel {

    int foodImage;
    String foodName,foodlike;

    public FoodModel() {
    }

    public FoodModel(int foodImage, String foodName, String foodlike) {
        this.foodImage = foodImage;
        this.foodName = foodName;
        this.foodlike = foodlike;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodlike() {
        return foodlike;
    }

    public void setFoodlike(String foodlike) {
        this.foodlike = foodlike;
    }
}
