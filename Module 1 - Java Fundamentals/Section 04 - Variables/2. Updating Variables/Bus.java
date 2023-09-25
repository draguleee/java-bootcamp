/**
 * Updating Variables:
 * += operator: updates by adding the value on the right
 * -= operator: updates by subtracting the value on the right
 * *= operator: updates by multiplying the value on the right
 * /= operator: updates by dividing the value on the rightg
 */

public class Bus {
    public static void main(String[] args) {
        
        // Create variable passengers of type int
        int passengers = 0;

        // Pick up 9 passengers from the first station
        passengers += 9;
        System.out.println(passengers);

        // Drop off 5 passengers at the second station
        passengers -= 5;
        System.out.println(passengers);

        // Drop off 4 passengers at he third station
        passengers -= 4;
        System.out.println(passengers);
    }
    
}