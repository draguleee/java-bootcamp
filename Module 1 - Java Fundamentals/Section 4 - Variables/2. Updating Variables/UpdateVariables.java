// Updating Variables

public class UpdateVariables {
    public static void main(String[] args) {
        
        // Passengers variable
        int passengers = 0;

        // Update the passengers variable after the first station
        passengers = passengers + 9;
        System.out.println("Number of passengers: " + passengers);

        // Update the passengers variable after the second station
        passengers = passengers - 5;
        System.out.println("New number of passengers: " + passengers);

        // Update the passengers variable after the third station
        passengers = passengers - 4;
        System.out.println("Number of passengers after the last station: " + passengers);
    }
}