package org.example.Shop;

import org.example.Shop.Storage.FoodStorage;
import org.example.Shop.Storage.ToolStorage;


public class ChefStorage {
    static final ChefStorage singletion = new ChefStorage(
            ToolStorage.getInstance(),
            FoodStorage.getInstance()

    );

    public static ChefStorage getInstance(){
        return  singletion;
    }

    ToolStorage toolStorage;
    FoodStorage foodStorage;

    public ChefStorage(ToolStorage toolStorage, FoodStorage foodStorage){
        this.foodStorage = foodStorage;
        this.toolStorage = toolStorage;
    }

    public ToolStorage getToolStorage(){
        return toolStorage;
    }

    public void setToolStorage(ToolStorage toolStorage){
        this.toolStorage = toolStorage;
    }

    public FoodStorage getFoodStorage(){
        return foodStorage;
    }

    public void setFoodStorage(FoodStorage foodStorage){
        this.foodStorage = foodStorage;
    }
}
