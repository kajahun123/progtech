package org.example.Items.Foods.Cooking.FoodMaker;

import org.example.Items.Item;
import org.example.Items.Foods.Cooking.ICooking;
import org.example.Items.Foods.Cooking.Factory.CookingFactory;
import org.example.Items.Foods.IFood;
import org.example.Items.Tools.Tool;
import org.example.Shop.ChefStorage;
import org.example.Shop.Storage.FoodStorage;

import  java.util.ArrayList;
import java.util.List;

public abstract class FoodCooker extends Item implements Tool {

    protected FoodCooker(String itemName, int storageSlot){
        super(itemName, storageSlot);
    }

    public void requiredToolToMakeItems(String itemToMake){
        cookFood(itemToMake) ;
    }

    public void cookFood(String foodToCook){
        ICooking foodToAdd = new CookingFactory().createCookedFood(foodToCook);
        if (storageContainsIngredients(foodToAdd)){
            foodToAdd.printBeingProcessTemplate();
            addFoodToStorage(foodToAdd);
            removeIngredientsFromStorage(foodToAdd);
        }
        else{
            System.out.println("Hiányzó hozzávalók");
        }
    }

    boolean storageContainsIngredients(ICooking foodToCook){
        int containedIngredientsNumber = 0;
        List<IFood> foodPossessed = ChefStorage.getInstance().getFoodStorage().getFoodStored();
        List<Integer> usedIngredientsIndex = new ArrayList<Integer>();
        for (int i = 0; i <foodToCook.getIngredients().size(); i++){
            for(int j = 0; j < foodPossessed.size(); j++){
                if(foodToCook.getIngredients().get(i).getItemName().equals(foodPossessed.get(j).getItemName()) && !usedIngredientsIndex.contains(j)){
                    usedIngredientsIndex.add(j);
                    j = foodPossessed.size();
                    containedIngredientsNumber++;
                }
            }
        }
        return containedIngredientsNumber == foodToCook.getIngredients().size();
    }

    void addFoodToStorage(IFood foodToAdd){
        if(FoodStorage.getInstance().countFreeSlotsLeft() - foodToAdd.getStorageSlot() >=0){
            ChefStorage.getInstance().getFoodStorage().addFood(foodToAdd);
            System.out.println(foodToAdd.getItemName() + "bekerült a raktárba");
        }
        else{
            System.out.println("Nincs szabad hely");
        }
    }

    void removeIngredientsFromStorage(ICooking cookFood){
        List<IFood> foodPossessed = ChefStorage.getInstance().getFoodStorage().getFoodStored();
        for(int i = 0; i < cookFood.getIngredients().size(); i++){
            for(int j = 0; j < foodPossessed.size(); j++){
                if(cookFood.getIngredients().get(i).getItemName().equals(foodPossessed.get(j).getItemName())){
                    foodPossessed.remove(j);
                    j = foodPossessed.size();
                }
            }
        }
    }
}
