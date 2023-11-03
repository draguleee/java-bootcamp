/**
 * Nested Loops: 
 * - A loop inside another loop
 * - Has an inner loop and an outer loop
 * - When the outer loop breaks, another run of the first loop starts
 * 
 * Applications of nested loops:
 * - Useful when working with 2D arrays
 */
public class NestedLoops {
    public static void main(String[] args) {
        for (int i=0 ; i<3 ; i++) {                     // Inner loop
            System.out.println("\nRun #" + i + ":");
            for (int j=0 ; j<3 ; j++) {                 // Outer loop
                System.out.println(j + ". Hello!");
            }
        }
    }
}