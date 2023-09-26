/**
 * Logical Operators: used to make conditionals a little more complex
 * && (AND): returns true only if both conditions are true
 * || (OR): returns true if at least one condition is true
 * ! (NOT): reverses the value of a boolean expression
 */

public class LogicalOperators {
    public static void main(String[] args) {


        /**********************AND OPERATOR**********************/

        // Example 1 - Can the user legally drive?
        boolean hasDrivingLicense = false;
        boolean hasInsurance = true;
        if(hasDrivingLicense && hasInsurance) {
            System.out.println("\nYou can legally drive");
        } else {
            System.out.println("\nYou cannot legally drive.");
        }

        // Example 2 - Is the user eligible for a loan?
        int age = 25;
        double income = 45000;
        if(age >= 21 && income >= 40000) {
            System.out.println("\nYou are eligible for a loan.");
        } else {
            System.out.println("\nYou are not eligible for a loan.");
        } 

        // Example 3 - Are the user's credentials correct?
        String inputUsername = "JohnDoe";
        String inputPassword = "password123";
        String correctUsername = "JohnDoe";
        String correctPassword = "password123";
        if(inputPassword.equals(correctPassword) && inputUsername.equals(correctUsername)) {
            System.out.println("\nAccess granted!");
        } else {
            System.out.println("\nInvalid username or password!");
        }


        /**********************OR OPERATOR**********************/

        // Example 1 - Can the employee be promoted?
        boolean hasGoodPerformance = true;
        boolean isLongTermEmployee = false;
        if(hasGoodPerformance || isLongTermEmployee) {
            System.out.println("\nThe employee is eligible for a promotion.");
        } else {
            System.out.println("\nThe employee is not eligible for a promotion.");
        }

        // Example 2 - Can you enter the venue?
        int userAge = 17;
        boolean isParentPresent = true;
        if(userAge >= 18 || isParentPresent) {
            System.out.println("\nYou can enter the venue.");
        } else {
            System.out.println("\nYou cannot enter the venue.");
        }

        // Example 3 - Can you use our services?

        int memberAge = 16;
        boolean hasMembership = false;
        if(memberAge >= 18 || hasMembership) {
            System.out.println("\nYou can acces our service.");
        } else {
            System.out.println("\nYou cannot access our service.");
        }


        /**********************NOT OPERATOR**********************/

        // Example 1 - Check the payment option
        String option = "cash";
        boolean cashOrCredit = option.equals("cash") || option.equals("credit");
        boolean notCashOrCredit = !cashOrCredit;
        if(notCashOrCredit) {
            System.out.println("\nPlease choose another payment option.");
        } else {
            System.out.println("\nSold. Pleasure doing business with you!");
        }

        // Example 2 - Check if the letter is a vowel
        char letter = 'A';
        boolean isVowel = (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U');
        boolean notVowel = !isVowel;
        if(notVowel) {
            System.out.println("\nThe letter is not a vowel.");
        } else {
            System.out.println("\nThe letter is a vowel.");
        } 

        // Example 3 - Poker!
        String move = "stay";
        boolean isHitOrStay = move.equals("hit") || move.equals("stay");
        boolean isNotHitOrStay = !isHitOrStay;
        if(isNotHitOrStay) {
            System.out.println("\nPlease choose a valid move!");
        } else {
            System.out.println("\nYou win 10 bucks!");
        }
    }
}
