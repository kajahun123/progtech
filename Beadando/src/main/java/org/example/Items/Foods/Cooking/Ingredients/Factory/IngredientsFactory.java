package org.example.Items.Foods.Cooking.Ingredients.Factory;

import org.example.Items.Foods.Cooking.Ingredients.Ingredient;
import org.example.Items.Foods.Cooking.Ingredients.Others.Liszt;
import org.example.Items.Foods.Cooking.Ingredients.Others.Sajt;
import org.example.Items.Foods.Cooking.Ingredients.Meats.Szalami;
import org.example.Items.Foods.Cooking.Ingredients.Vegetables.Gomba;
import org.example.Items.Foods.Cooking.Ingredients.Vegetables.Kukorica;

public class IngredientsFactory implements IIngredientsFactory {
    static final IIngredientsFactory Instance = new IngredientsFactory();
    public static IIngredientsFactory getInstance(){
        return Instance;
    }

    public Ingredient createIngredient(String ingredientName){
        Ingredient createIngdredient;

        if (ingredientName == "szalami"){
            createIngdredient = new Szalami("Szalámi",1,1);
        }
        else if (ingredientName == "liszt"){
            createIngdredient = new Liszt("Liszt",1,1);
        }
        else if (ingredientName == "sajt"){
            createIngdredient = new Sajt("Sajt",1,1);
        }
        else if (ingredientName == "gomba"){
            createIngdredient = new Gomba("Gomba",1,1);
        }
        else if (ingredientName == "kukorica"){
            createIngdredient = new Kukorica("Kukorica",1,1);
        }
        else {
            throw new RuntimeException("Nincs ilyen hozzávaló!");
        }
        return  createIngdredient;
    }

}
