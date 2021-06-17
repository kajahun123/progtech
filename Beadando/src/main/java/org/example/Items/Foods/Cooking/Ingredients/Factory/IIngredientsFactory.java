package org.example.Items.Foods.Cooking.Ingredients.Factory;
import org.example.Items.Foods.Cooking.Ingredients.Ingredient;
public interface IIngredientsFactory {
    public Ingredient createIngredient(String ingredientName);
}
