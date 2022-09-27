package com.sainsburys.lightninglunchbackend.models;

public class ProductPrice {
    private float price;
    private boolean mealDeal;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isMealDeal() {
        return mealDeal;
    }

    public void setMealDeal(boolean mealDeal) {
        this.mealDeal = mealDeal;
    }


}
