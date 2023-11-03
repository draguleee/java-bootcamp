/**
 * Workbook 5.4 - 99 bottles of beer on the wall
 * A song as old as time itself.
 */

public class Beer {
    public static void main(String[] args) {
        for(int i=99 ; i>=1 ; i--) {
            sing(i);
        }
    }

    /**
     * sing - sings the song "99 bottles of beer on the wall"
     * @param i (int)
     * @return none
     */
    public static void sing(int i) {
        System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
        System.out.println("Take one down, pass it around, " + (i-1) + " bottles of beer on the wall!\n");
    }

}
