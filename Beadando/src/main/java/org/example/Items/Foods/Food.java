package org.example.Items.Foods;
import org.example.Items.Item;

public abstract class Food extends Item implements IFood{
    int rating;
    protected Food(String foodName, int storageSlot, int rating){
        super(foodName,storageSlot);
        this.rating = rating;
    }

    public int getRating(){
        return rating;
    }

    public void setRating(int rating){
        if (rating > 0){
            this.rating = rating;
        }
        else{
            throw new RuntimeException("Az értékelés nem lehet 0!");
        }
    }
}
