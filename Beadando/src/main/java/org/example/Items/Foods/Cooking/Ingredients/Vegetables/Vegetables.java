package org.example.Items.Foods.Cooking.Ingredients.Vegetables;

import org.example.Items.Foods.Cooking.Ingredients.Ingredient;
public abstract class Vegetables extends Ingredient{
    protected Vegetables(String itemName, int storageSlot, int rating){
        super(itemName,storageSlot, rating);
    }
}