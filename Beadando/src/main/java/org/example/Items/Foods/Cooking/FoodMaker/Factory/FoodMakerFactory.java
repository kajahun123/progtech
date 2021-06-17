package org.example.Items.Foods.Cooking.FoodMaker.Factory;

import org.example.Items.Foods.Cooking.FoodMaker.Oven;
import org.example.Items.Tools.Tool;

public class FoodMakerFactory implements IFoodMakerFactory {
    static final IFoodMakerFactory instance = new FoodMakerFactory();

    public static IFoodMakerFactory getInstance(){
        return instance;
    }

    public Tool createFoodMaker(String foodMaker){
        Tool createdFoodMaker;

        if("oven".equals(foodMaker)){
            createdFoodMaker = new Oven("oven",1);
        }
        else{
            throw new RuntimeException("Nincs ilyen eszköz");
        }
        return createdFoodMaker;
    }
}
