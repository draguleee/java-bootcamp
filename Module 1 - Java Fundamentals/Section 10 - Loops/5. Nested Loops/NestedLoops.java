/**
 * Nested Loops: 
 * - Loop inside of another loop
 * - Has an outer loop and an inner loop:
 *   * Outer loop: the big loop
 *   * Inner loop: the smaller loop inside
 * - Each iteration of the outer loop runs the inner loop to completion
 * 
 * Applications of Nested Loops: useful when working with 2D arrays
 */


public class NestedLoops {
    public static void main(String[] args) {
        
        // Nested loop
        for(int i=0 ; i<3 ; i++) {      
            System.out.println("Run: " + i);            
            for(int j=0 ; j<3 ; j++) {
                System.out.println(j);
            }
        }
    }
}