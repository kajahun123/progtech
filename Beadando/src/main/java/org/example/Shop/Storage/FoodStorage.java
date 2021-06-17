package org.example.Shop.Storage;

import org.example.Items.Foods.Food;
import org.example.Items.Foods.IFood;
import org.example.Items.Tools.Tool;

import java.util.ArrayList;
import java.util.List;

public class FoodStorage extends Storage{
    static final FoodStorage instance = new FoodStorage(100);

    public static FoodStorage getInstance(){
        return instance;
    }

    List<IFood> foodStored;

    protected FoodStorage(int storageSlots){
        super(storageSlots);
        foodStored = new ArrayList<IFood>();
    }
    public void setFoodStored(List<IFood> foodStored){
        this.foodStored = foodStored;
    }

    public List<IFood> getFoodStored(){
        return foodStored;
    }

    public void addFood(IFood foodToAdd){
        if(this.countFreeSlotsLeft() - foodToAdd.getStorageSlot() >=0){
            this.foodStored.add(foodToAdd);
        }
        else{
            System.out.println("Nincs elég hely a raktárban!");
        }
    }

    public void removeFood(IFood foodToRemove){
        this.foodStored.remove(foodToRemove);
    }


    public int countFreeSlotsLeft(){
        int remainingSlots = this.storageSlots;
        for (IFood food : this.foodStored){
            remainingSlots = remainingSlots - food.getStorageSlot();
        }
        return remainingSlots;
    }
}
