/*
 * Workbook 2.2 - My Biography
 * 
 * In this workbook, you will fill in a biography of yourself.
 */

public class Biography {
    public static void main(String[] args) {
        
        // Task 1: create variables
        String name = "Andre";
        int age = 24;
        String country = "Romania";
        String sport = "BMX";
        int hours = 4;
        String game = "Valorant";
        String subject = "Mathematics";
        char grade = 'A';
        
        // Task 2: replace every placeholder with a variable
        System.out.println("My name is " + name + ". I'm " + age + " years old, and I'm from " + country + ".");
        System.out.println("My favourite sport is " + sport + ". I play for " + hours + " hours a day");
        System.out.println("When I'm tired, I like to play " + game + ".");
        System.out.println("In school, my favourite subject was " + subject + ", I scored a " + grade + ".");

    }

}
