// While Loops

public class WhileLoops {
    public static void main(String[] args) {
        
        // Variables
        double choice = 0.01;
        double guess = 0.99;

        // While Loop
        while(guess > choice) {
            guess = Math.random();
            System.out.println(guess);
        }
    }
}