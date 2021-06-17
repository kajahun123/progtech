package org.example.Items.Foods.Cooking.Ingredients;
import org.example.Items.Foods.Food;

public abstract class Ingredient extends Food {
    protected Ingredient(String itemName, int storageSlot, int rating){
        super(itemName,storageSlot, rating);
    }
}
