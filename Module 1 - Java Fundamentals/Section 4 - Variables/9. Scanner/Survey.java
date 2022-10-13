import java.util.Scanner;

// Scanner

public class Survey {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner in = new Scanner(System.in);
        System.out.println("\nwelcome! Thank you for taking the survey.");

        // Number of questions
        int counter = 0;

        // Request name
        System.out.println("\nWhat's your name?");
        String name = in.nextLine();
        counter++;

        // Request amount of money spent on coffee
        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = in.nextDouble();
        counter++;

        // Request amount of money spent on fast food
        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = in.nextDouble();
        counter++;

        // Request amount of times the user bought coffee
        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = in.nextInt();
        counter++;

        // Request amount of times the user bought fast food
        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = in.nextInt();
        counter++;

        // Print all the input data
        System.out.println("\nThank you " + name + " for answering all " + counter + " questions!");
        System.out.println(" - Your name: " + name);
        System.out.println(" - Money spent on coffee: $" + coffeePrice);
        System.out.println(" - Money spent on fast food: $" + foodPrice);
        System.out.println(" - Coffees bought per week: " + coffeeAmount);
        System.out.println(" - Fast foods bought per week: " + foodAmount);
        System.out.println("\nYour fast food expenses are " + (foodPrice/coffeePrice) + " times your coffee expenses.");
        System.out.println("Weekly, you spend $" + (coffeeAmount*coffeePrice) + " on coffee.");
        System.out.println("Weekly, you spend $" + (foodAmount*foodPrice) + " on food.") ;

        // Close the Scanner
        in.close();
    }
}