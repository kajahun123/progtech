package org.example.Items.Foods.Cooking.Pizzas;
import org.example.Items.Foods.Cooking.Cooking;
import org.example.Items.Foods.Cooking.Ingredients.Ingredient;

import java.util.List;

public abstract class Foods extends Cooking {
    protected Foods(String itemName, int storageSlot, int rating, List<Ingredient> ingredients){
        super(itemName,storageSlot,rating,ingredients);
    }
}
