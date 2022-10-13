// Strings

public class Bus {
    public static void main(String[] args) {
        
        // String variable
        String sentence = "Number of passengers: ";

        // Passengers variable
        int passengers = 0;

        // Update the passengers value after the first station
        passengers += 9;
        System.out.println(sentence + passengers);

        // Update the passengers value after the second station
        passengers -= 5;
        System.out.println(sentence + passengers);

        // Update the passengers value after the third station
        passengers -= 4;
        System.out.println(sentence + passengers);

        // End of shift
        sentence = "End of shift.";
        System.out.println(sentence);
    }
}