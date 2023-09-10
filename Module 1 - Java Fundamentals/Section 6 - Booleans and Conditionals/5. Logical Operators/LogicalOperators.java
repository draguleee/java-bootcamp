/**
 * Logical Operators
 * - && (AND) : returns TRUE only if both comparisons are true.
 * - || (OR) : returns TRUE if either of the comparisons is true
 * - ! (NOT) : reverses the value of a boolean expression
 */

public class LogicalOperators {
    public static void main(String[] args) {

        /**********************AND OPERATOR**********************/

        // Example 1
        boolean hasDrivingLicense = true;
        boolean hasInsurance = true;
        if(hasDrivingLicense && hasInsurance) {
            System.out.println("\nYou can legally drive.");
        } else {
            System.out.println("\nYou cannot legally drive.");
        }

        // Example 2
        int age = 25;
        double income = 45000;
        if(age >= 21 && income >= 40000) {
            System.out.println("\nYou are eligible for a loan.");
        } else {
            System.out.println("\nYou are not eligible for a loan.");
        }

        // Example 3
        String inputUsername = "JohnDoe";
        String inputPassword = "password123";
        String correctUsername = "JohnDoe";
        String correctPassword = "password123";
        if(inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.println("\nAcces granted!");
        } else {
            System.out.println("\nInvalid username or password.");
        }


        /**********************OR OPERATOR**********************/

        // Example 1
        boolean hasGoodPerformance = true;
        boolean isLongTermEmployee = false;
        if(hasGoodPerformance || isLongTermEmployee) {
            System.out.println("\nThe user is eligible for a promotion.");
        } else {
            System.out.println("\nThe user is not eligible for a promotion.");
        }

        // Example 2
        int userAge = 17;
        boolean isParentPresent = true;
        if(userAge >= 18 || isParentPresent) {
            System.out.println("\nYou can enter the venue.");
        } else {
            System.out.println("\nYou cannot enter the venue.");
        }

        // Example 3
        int memberAge = 16;
        boolean hasMembership = false;
        if(memberAge >= 18 || hasMembership) {
            System.out.println("\nThe user can access the service.");
        } else {
            System.out.println("\nThe user cannot access the service.");
        }


        /**********************NOT OPERATOR**********************/

        // Example 1
        String option = "cash";
        boolean cashOrCredit = option.equals("cash") || option.equals("credit");
        boolean notCashOrCredit = !cashOrCredit;
        if(notCashOrCredit) {
            System.out.println("\nPlease choose another payment option.");
        } else {
            System.out.println("\nSold. Pleasure doing business with you!");

        }

        // Example 2
        char letter = 'A';
        boolean isVowel = (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U');
        boolean isNotVowel = !isVowel;
        if(isNotVowel) {
            System.out.println("\nThe letter " + letter + " is not a vowel.");
        } else {
            System.out.println("\nThe letter " + letter + " is a vowel.");

        }

        // Exemplul 3
        String move = "stay";
        boolean isHitOrStay = move.equals("hit") || move.equals("stay");
        boolean isNotHitOrStay = !isHitOrStay;
        if(isNotHitOrStay) {
            System.out.println("\nPlease choose a valid move");
        } else {
            System.out.println("\nYou win 10 bucks!");
        }
    }
}
