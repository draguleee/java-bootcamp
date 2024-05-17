package model;

import java.util.ArrayList;

/**
 * Lab class
 */

public class Lab {

    // Instance variables (private)
    private ArrayList<LabEquipment> labEquipments;

    // Constructor for Lab class
    public Lab() {
        this.labEquipments = new ArrayList<LabEquipment>();
    }

    // Getter for lab equipment ArrayList
    public LabEquipment getLabEquipment(int index) {
        return this.labEquipments.get(index).clone();
    }

    // Setter for lab equipment ArrayList
    public void setLabEquipment(int index, LabEquipment labEquipment) {
        this.labEquipments.set(index, labEquipment.clone());
    }

    /**
     * addEquipment() - adds a deep copy of the object to the labEquipment ArrayList
     */
    public void addLabEquipment(LabEquipment labEquipment) {
        this.labEquipments.add(labEquipment.clone());
    }


    
}
