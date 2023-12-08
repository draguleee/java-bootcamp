/**
 * Workbook 6.14 - Random Numbers
 */

public class RandomNumbers {
    public static void main(String[] args) {
        
        // 2D array with 3 rows and 10 columns
        int[][] array = new int[100][10];

        // Use a nested loop to populate the array with random numbers
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumber();
            }
        }

        // Print the 2D array
        print2DArray(array);

    }

    /**
     * randomNumber - returns a random number between 0 and 99.
     * @return
     */
    public static int randomNumber() {
        return (int)(Math.random()*100);
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
