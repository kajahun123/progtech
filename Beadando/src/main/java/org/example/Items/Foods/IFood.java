package org.example.Items.Foods;
import org.example.Items.IItem;

public interface IFood extends IItem{
    int getRating();
    void setRating(int rating);
}
