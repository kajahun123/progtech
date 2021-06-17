package org.example.Items;

public abstract class Item implements IItem {
    static int ID = 0;
    String itemName;
    int itemID;
    int storageSlot;

    protected Item(String itemName, int storageSlot) {
        ID++;
        this.itemID = ID;
        this.itemName = itemName;
        this.storageSlot = storageSlot;
    }
    public int getItemID() {
        return itemID;
    }

    public String getItemName(){
        return  itemName;
    }

    public void setItemName(String itemName){
        if (itemName.length() > 0){
            this.itemName = itemName;
        }
        else{
            throw new RuntimeException("A név nem lehet üres!");
        }
    }
    public int getStorageSlot() {
        return storageSlot;
    }

    public void setStorageSlot(int storageSlot){
        if (storageSlot > 0){
            this.storageSlot = storageSlot;
        }
        else{
            throw new RuntimeException("Az item helye nem lehet 0");
        }
    }
}

