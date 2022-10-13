// Updating Variables

public class UpdateVariablesEnhanced {
    public static void main(String[] args) {
        
        // Passengers variable
        int passengers = 0;

        // Update the passengers variable after the first station
        passengers += 9;
        System.out.println("Number of passengers: " + passengers);

        // Update the passengers variable after the second station
        passengers -= 5;
        System.out.println("New number of passengers: " + passengers);

        // Update the passengers variable after the third station
        passengers -= 4;
        System.out.println("Number of passengers after the last station: " + passengers);
    }
}
