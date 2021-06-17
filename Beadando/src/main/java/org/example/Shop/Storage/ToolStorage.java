package org.example.Shop.Storage;

import org.example.Items.Tools.Tool;

import java.util.List;
import java.util.ArrayList;

public class ToolStorage extends Storage{
    static final ToolStorage instance = new ToolStorage(100);
    public static ToolStorage getInstance(){
        return instance;
    }

    List<Tool> toolsStored;

    protected ToolStorage(int storageSlots){
        super(storageSlots);
        toolsStored = new ArrayList<Tool>();
    }

    public List<Tool> getToolsStored(){
        return toolsStored;
    }

    public void setToolsStored(List<Tool> toolsStored){
        this.toolsStored = toolsStored;
    }

    public void addTool(Tool toolToAdd){
        if (this.countFreeSlotsLeft() - toolToAdd.getStorageSlot() >= 0){
            this.toolsStored.add(toolToAdd);
        }
        else{
            System.out.println("Nincs elég hely a raktárban");
        }
    }

    public void removeTool(Tool toolToRemove){
        this.toolsStored.remove(toolToRemove);
    }
    public int countFreeSlotsLeft(){
        int remainingSlots = this.storageSlots;
        for (Tool tool : this.toolsStored){
            remainingSlots = remainingSlots - tool.getStorageSlot();
        }
        return remainingSlots;
    }
}
