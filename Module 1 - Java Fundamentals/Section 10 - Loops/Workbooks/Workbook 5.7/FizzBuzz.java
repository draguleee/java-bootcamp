/**
 * Workbook 5.7 - Fizz Buzz!
 * 
 * Your program has to print numbers from 0 to 18.
 * - If a number is a multiple o three, mark it: Fizz.
 * - If a number is a multiple of five, mark it: Buzz.
 * - If a number is multiple or three AND five, mark it: FizzBuzz.
 * 
 * Hints:
 * - A number is a multiple of X if number % X results in a remainder of 0.
 * - There are three conditions for Fixx, Buzz and FizzBuzz. Be careful
 * about their order! If something is FixxBuzz, it also satisfies the
 * conditions for Fizz and Buzz.
 */

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i=0 ; i<=18 ; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + "  - FizzBuzz.");
            } else if (i % 3 == 0) {
                System.out.println(i + " - Fizz.");
            } else if (i % 5 == 0) {
                System.out.println(i + " - Buzz.");
            }
        }
    }
}
