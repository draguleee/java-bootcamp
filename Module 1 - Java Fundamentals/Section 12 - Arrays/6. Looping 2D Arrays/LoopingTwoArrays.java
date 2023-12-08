/**
 * Looping 2D Arrays
 * 
 * Nested loop:
 * for(int i=0 ; i<grades.length ; i++) {           // Outer loop - runs throug ever row (i)
 *    for(int j=0 ; i<grades[i].length ; j++){      // Inner loop - runs through every item in the row
 *        // ...
 *    }
 * }
 */

public class LoopingTwoArrays {
    public static void main(String[] args) {
    
        // 2D arrays containing grades (integer values)
        int[][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };

        // Print the grades on every row (for the sake of exercise)

        /* *

        // Print the grades on the first row of the 2D array
        for (int i = 0; i < grades[0].length; i++) {
            System.out.print(grades[0][i] + " ");       // [0][0] [0][1] [0][2] [0][3]
        }

        // Print the grades on the second row of the 2D array
        System.out.println();
        for (int i = 0; i < grades[1].length; i++) {
            System.out.print(grades[1][i] + " ");       // [1][0] [1][1] [1][2] [1][3]
        }

        // Print the grades on the third row of the 2D array
        System.out.println();
        for (int i = 0; i < grades[2].length; i++) {
            System.out.print(grades[2][i] + " ");       // [2][0] [2][1] [2][2] [2][3]
        }

        */

        // Print the grades
        for (int i = 0; i < grades.length; i++) {
            switch (i) {
                case 0: System.out.print("\tHarry: "); break;
                case 1: System.out.print("\tRon: "); break;
                case 2: System.out.print("\tHermione: "); break;
            }
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}