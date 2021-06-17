package org.example.Items;

public interface IItem {
    int getItemID();
    String getItemName();
    void setItemName(String itemName);
    int getStorageSlot();
    void setStorageSlot(int storageSlot);
}
