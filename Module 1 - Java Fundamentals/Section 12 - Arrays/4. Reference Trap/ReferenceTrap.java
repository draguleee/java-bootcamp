import java.util.Arrays;

/**
 * Reference Trap
 * 
 * Arrays:
 * - A variable cannot store an array
 * - It store a reference that points to an array
 * 
 * The reference trap:
 * - Definition: reference trap .
 * - The cause: happens when many variables share a reference to one array.
 * - The solution: do not set array variables equal to each other, instead make a new array.
 * - Conclusion: the state of a variable should not change because you updated another!
 */

public class ReferenceTrap {
    public static void main(String[] args) {
        
        // Example 1 - arrays of type int
        int[] numbers1 = {1,2,3};   
        /*
         * int[] numbers2 = numbers1;      // the reference is copied, NOT the array!
         * numbers2[1] = 5;                // changes will be reflected in both arrays
         * int[] numbers2 = new int[numbers1.length];
         * for (int i = 0; i < numbers1.length; i++) {
         *     numbers2[i] = numbers1[i];
         * }
        */   
        int[] numbers2 = Arrays.copyOf(numbers1, numbers1.length); 
        numbers2[1] = 5;
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));

        // Example 2 - arrays of type String
        String[] staffLastYear = {"Rosie", "Andre", "Oana"};
        /*
         * String[] staffThisYear = staffLastYear;      // the reference is copied, NOT the array!
         * staffThisYear[1] = "Mihai";                  // changes will be reflected in both arrays
         * String[] staffThisYear = new String[staffLastYear.length];
         * for (int i = 0; i < staffLastYear.length; i++) {
         *     staffThisYear[i] = staffLastYear[i];
         * }
         */
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] = "Mihai";
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}