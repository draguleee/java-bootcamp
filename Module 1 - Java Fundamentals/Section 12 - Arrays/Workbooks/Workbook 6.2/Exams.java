/**
 * Workbook 6.2 - Exams (Revisited)
 */

public class Exams {
    public static void main(String[] args) {
        
        // Another wave of students need to write their exams
        System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");
        
        // Create a new array of five students
        String[] students = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};

        // Print a message for each student (using a traditional for loop)
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ", you will take seat " + i + ".");
        }
    }
}
