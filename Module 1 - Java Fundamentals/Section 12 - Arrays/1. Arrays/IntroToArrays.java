/**
 * Arrays:
 * - Can be used to store multiple values at the same time. 
 * - Sometimes values can be closely related, and creating one variable
 * after another can be very messy; that's why arrays come in handy!
 * - It's a good time to use an array if the variable creation is 
 * redundant (ex. var1, var2, var3...)
 * 
 * Defining an array:
 * int[] integers = {1, 2, 3};
 * - Place square brackets next to the type
 * - Store as many values of that type in accolades
 */

public class IntroToArrays {
    public static void main(String[] args) {

        // Store an array of String values
        // The variable does NOT store the array directly!
        // The variable stores an reference that points to the array!
        String[] kingdoms = {"Mercia", "Wessex", "Northumbria", "East Anglia"};

        // Print the element at each index
        System.out.println(kingdoms[0]);
        System.out.println(kingdoms[1]);
        System.out.println(kingdoms[2]);
        System.out.println(kingdoms[3]);
        // System.out.println(kingdoms[4]);     // IndexOutOfBoundsException!!!
    
        // Print the array
        for(int i=0 ; i<kingdoms.length ; i++) {
            System.out.print(kingdoms[i] + " ");
        }
        // System.out.println(kingdoms);        // This only prints a hashcode representation of the array's reference!!!
    
    }   
}