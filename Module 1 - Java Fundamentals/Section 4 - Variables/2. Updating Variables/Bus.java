/*
 * Operators:
 * 
 * 1. The += operator: updates by adding the value on the right
 * 
 * 2. The -= operator: updates by subtracting the value on the right
 */

public class Bus {
    public static void main(String[] args) {
        
        // Buss starts off with 0 passengrs
        int passengers = 0;

        // Nine passengers go up at the first station
        passengers += 9;
        System.out.println(passengers);

        // Five passengers drop off at the second station
        passengers -= 5;
        System.out.println(passengers);

        // Four passengers drop off at the last station
        passengers -= 4;
        System.out.println(passengers);
    }
}
