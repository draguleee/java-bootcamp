import model.*;

/**
 * Main class
 */

public class Main {
    public static void main(String[] args) {


        /*************************** PART 1 ***************************/

        // Create a Microscope object
        // Microscope microscope = new Microscope("Nikon", "E200", 2021, 1000);
        
        // Print the microscope details
        // System.out.println("Microscope Details:");
        // System.out.println("Manufacturer: " + microscope.getManufacturer());
        // System.out.println("Model: " + microscope.getModel());
        // System.out.println("Year: " + microscope.getYear());
        // System.out.println("Magnification: " + microscope.getMagnification());
        // System.out.println("Maintenance: " + microscope.performMaintenance());

        // Space between 
        // System.out.println();

        // Create a Centrifuge object
        // Centrifuge centrifuge = new Centrifuge("Eppendorf", "5424R", 2020, 15000);
        
        // Print the centrifuge details
        // System.out.println("Centrifuge Details:");
        // System.out.println("Manufacturer: " + centrifuge.getManufacturer());
        // System.out.println("Model: " + centrifuge.getModel());
        // System.out.println("Year: " + centrifuge.getYear());
        // System.out.println("Max RPM: " + centrifuge.getMaxRpm());
        // System.out.println("Maintenance: " + centrifuge.performMaintenance());


        /*************************** PART 2 ***************************/

        // Create a Microscope object and a Centrifuge object
        Microscope microscope1 = new Microscope("Nikon", "E200", 2021, 1000);
        Centrifuge centrifuge1 = new Centrifuge("Eppendorf", "5424R", 2020, 15000);

        // Test the copy constructors
        Microscope microscopeCopy = new Microscope(microscope1);
        Centrifuge centrifugeCopy = new Centrifuge(centrifuge1);

        // Print the original and the copied microscopes
        System.out.println("Original Microscope: " + microscope1.getManufacturer() + " " + microscope1.getModel());
        System.out.println("Copied Microscope: " + microscopeCopy.getManufacturer() + " " + microscopeCopy.getModel());
        
        // Print the original and the copied centrifuges
        System.out.println("Original Centrifuge: " + centrifuge1.getManufacturer() + " " + centrifuge1.getModel());
        System.out.println("Copied Centrifuge: " + centrifugeCopy.getManufacturer() + " " + centrifugeCopy.getModel());

        // Create a Lab object
        Lab lab = new Lab();

        // Test the addLabEquipment method
        lab.addLabEquipment(microscope1);
        lab.addLabEquipment(centrifuge1);

        // Test the getLabEquipment method
        LabEquipment retrievedLabEquipment = lab.getLabEquipment(0);
        System.out.println("Retrieved Lab Equipment: " + retrievedLabEquipment.getManufacturer() + " " + retrievedLabEquipment.getModel());

        // Test the setLabEquipment method
        Microscope microscope2 = new Microscope("Olympus", "CX23", 2021, 400);
        lab.setLabEquipment(0, microscope2);

        // Verify that the lab equipment was updated
        retrievedLabEquipment = lab.getLabEquipment(0);
        System.out.println("Updated Lab Equipment: " + retrievedLabEquipment.getManufacturer() + " " + retrievedLabEquipment.getModel());

        
    }
}