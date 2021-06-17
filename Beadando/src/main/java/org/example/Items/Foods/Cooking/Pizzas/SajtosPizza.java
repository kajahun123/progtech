package org.example.Items.Foods.Cooking.Pizzas;
import org.example.Items.Foods.Cooking.Ingredients.Ingredient;

import java.util.List;

public class SajtosPizza extends  Foods {
    public SajtosPizza(String itemName, int storageSlot, int rating, List<Ingredient> ingredients){
        super(itemName,storageSlot,rating,ingredients);
    }

    protected void addIngredients(){
        System.out.println("Hozzávalók hozzáadva: Liszt, Sajt");
    }
}
