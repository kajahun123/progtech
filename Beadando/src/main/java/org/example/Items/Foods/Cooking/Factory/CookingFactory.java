package org.example.Items.Foods.Cooking.Factory;

import org.example.Items.Foods.Cooking.ICooking;
import org.example.Items.Foods.Cooking.Ingredients.Ingredient;
import org.example.Items.Foods.Cooking.Ingredients.RecipeBuilder.Recipies.SajtosPizzaRecipeBuilder;
import org.example.Items.Foods.Cooking.Ingredients.RecipeBuilder.Recipies.GombasKukoricasPizzaRecipeBuilder;
import org.example.Items.Foods.Cooking.Pizzas.SajtosPizza;
import org.example.Items.Foods.Cooking.Pizzas.GombasKukoricasPizza;

import java.util.List;
public class CookingFactory implements ICookingFactory{
    static final ICookingFactory instance = new CookingFactory();
    public static ICookingFactory getInstance(){
        return instance;
    }

    public ICooking createCookedFood(String foodName){
        ICooking createFood;

        List<Ingredient> ingredientList;

        if(foodName == "gombasKukoricasPizza"){
            ingredientList = new GombasKukoricasPizzaRecipeBuilder().getRecipe();

            createFood = new GombasKukoricasPizza(
                    "gombasKukoricasPizza",
                    1,
                    90,
                    ingredientList
            );
        }
        else if(foodName == "sajtosPizza"){
            ingredientList = new SajtosPizzaRecipeBuilder().getRecipe();

            createFood = new SajtosPizza(
                    "sajtosPizza",
                    1,
                    75,
                    ingredientList
            );
        }
        else{
            throw new RuntimeException("Nincs ilyen étel!");
        }
        return createFood;
    }
}
