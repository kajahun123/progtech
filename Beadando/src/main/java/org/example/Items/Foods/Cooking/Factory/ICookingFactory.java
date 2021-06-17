package org.example.Items.Foods.Cooking.Factory;

import org.example.Items.Foods.Cooking.ICooking;
public interface ICookingFactory {
    public ICooking createCookedFood(String foodName);
}
