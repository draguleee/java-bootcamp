/**
 * Looping Arrays:
 * Arrays and loops are like siblings! :D
 */

public class ArrayLoopExamples {
    public static void main(String[] args) {
        
        // Example 1: Print the elements of an integer array using a for loop
        System.out.println("\nPrint the elements of an integer array: ");
        int[] numbers = {22, 24, 26, 29, 30};
        System.out.print("Traditional for loop: ");
        for (int i=0 ; i<numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\nForeach loop: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Example 2: Print the elements of a string array using a for loop
        System.out.println("\n\nPrint the elements of a string array: ");
        String[] strArray = {"apple", "banana", "cherry"};
        System.out.print("Traditional for loop: ");
        for (int i=0 ; i<strArray.length ; i++) {
            System.out.print(strArray[i] + " ");  
        }
        System.out.print("\nForeach loop: ");
        for (String string : strArray) {
            System.out.print(string + " ");
        }

        // Example 3: Print every second element of an integer array
        System.out.println("\n\nPrint every second element: ");
        int[] grades = {95, 80, 85, 70, 90, 60, 88, 78};
        for (int i=0 ; i<grades.length ; i+=2) {
            System.out.print(grades[i] + " ");
        }

        // Example 4: Double the elements of an integer array
        System.out.println("\n\nDouble the elements of an integer array: ");
        int[] values = {3, 5, 7, 9, 11};
        for (int i=0 ; i<values.length ; i++) {
            values[i] = values[i] * 2;
            System.out.print(values[i] + " ");
        }

        // Example 5: Capitalize the elements of a string array
        System.out.println("\n\nCapitalize the elements of a string array: ");
        String[] colors = {"red", "green", "blue"};
        for (int i=0 ; i<colors.length ; i++) {
            colors[i] = colors[i].toUpperCase();
            System.out.print(colors[i] + " ");
        }

        // Example 6: Find the index of a specific value in an integer array
        System.out.println("\n\nFind the index of a specific value: ");
        int[] data = {4, 7, 4, 1, 4, 9, 4};
        int targetValue = 4;
        for (int i=0 ; i<data.length ; i++) {
            if (data[i] == 4) {
                System.out.print(i + " ");
            }
        }
    }
}
