package org.example.Items.Foods.Cooking.FoodMaker.Factory;

import org.example.Items.Tools.Tool;

public interface IFoodMakerFactory {
    public Tool createFoodMaker(String foodMakerName);
}
