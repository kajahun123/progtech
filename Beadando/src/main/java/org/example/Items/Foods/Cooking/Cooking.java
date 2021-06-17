package org.example.Items.Foods.Cooking;

import org.example.Items.Foods.Cooking.Ingredients.Ingredient;
import org.example.Items.Foods.Food;

import java.util.List;

public abstract class Cooking extends  Food implements ICooking{
    protected List<Ingredient> ingredients;

    protected Cooking(String itemName, int storageSlot, int rating, List<Ingredient> ingredients){
        super(itemName,storageSlot,rating);
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients(){
        return ingredients;
    }

    public void printBeingProcessTemplate(){
        addIngredients();
        FoodReadyText();
    }

    protected abstract void addIngredients();
    void FoodReadyText(){
        System.out.println("A pizza megsült!");
    }

}
