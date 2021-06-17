package org.example.Items.Foods.Cooking;

import org.example.Items.Foods.Cooking.Ingredients.Ingredient;
import org.example.Items.Foods.IFood;

import java.util.List;
public interface ICooking extends IFood{
    List<Ingredient> getIngredients();
    void printBeingProcessTemplate();
}
