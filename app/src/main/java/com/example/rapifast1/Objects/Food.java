package com.example.rapifast1.Objects;

public class Food {

    int imgFood;
    String foodName;
    String foodDesc;
    String preco;

    public Food(int imgFood, String foodName, String foodDesc, String preco) {
        this.imgFood = imgFood;
        this.foodName = foodName;
        this.foodDesc = foodDesc;
        this.preco = preco;
    }

    public int getImgFood() {
        return imgFood;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public String getPreco() {
        return preco;
    }
}
