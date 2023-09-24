/**
 * Workbook 5.4 - 99 bottles of beer on the wall.
 * 
 * A song as old as time itself.
 */

public class Beer {
    public static void main(String[] args) {
        for (int i=99 ; i>=1 ; i--) {
            sing(i);
        }
    }

    /**
     * sing - sings the "99 bottles of beer on the wall".
     * @param i (int)
     * 
     * Inside the function:
     * 1. print:
     * <i> bottles of beer on the wall, <i> bottles of beer!
     * Take one down, pass it around, <i-1> bottles of beer on the wall!
     * 
     */
    public static void sing(int i) {
        System.out.println("\n" + i + " bottles of beer on the wall, " + i + " bottles of beer!");
        System.out.println("Take one down, pass it around, " + (i+1) + " bottles of beer on the wall!");
    }

}
