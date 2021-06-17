package org.example.Shop.Storage;

public class Storage  implements IStorage{
    int storageSlots;
    protected Storage(int storageSlots){
        this.storageSlots = storageSlots;
    }
    public int getStorageSlot(){
        return storageSlots;
    }

    public void setStorageSlot(int storageSlot){
        this.storageSlots = storageSlot;
    }
}
