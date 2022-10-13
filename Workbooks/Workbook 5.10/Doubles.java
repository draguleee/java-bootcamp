// Workbook 5.10

public class Doubles {
    public static void main(String[] args) {

        // Call the rollDice() function twice
        int dice1 = rollDice();
        int dice2 = rollDice();

        // Print the dice values
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");

        // Loop that keeps running while the two dice are not equal
        while(dice1 != dice2) {
            dice1 = rollDice();
            dice2 = rollDice();
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2 + "\n");
        }
        System.out.println("You rolled doubles!");
        
    }

    /**
     * Function name: rollDice - rolls a dice between 1 and 6
     * @return
     */
    public static int rollDice() {
        double random = (Math.random()*6)+1;
        int number = (int)random;
        return number;
    }
}
