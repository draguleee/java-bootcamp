/*
 * The process:
 * 
 * 1. Create a folder called after the section this code is under.
 * 
 * 2. Launch the folder from Visual Studio Code (drag & drop).
 * 
 * 3. Create a Java file:
 *    - Use the CamelCase format
 *    - The file needs to end with the .java extension
 *    - In the folder, press New file and name your file: HelloWorld.java
 * 
 * 4. Create a Java class inside the Java file:
 *    - All of the code is written inside the Java class
 *    - A class has two parts: the "class" keyword followed by the class name "HelloJava"
 *    - The class name must match the file name that it's in
 * 
 * 5. The class needs a main() method:
 *    - main() is the entry point of the application
 * 
 * 6. Turn on AutoSave:
 *    - File -> AutoSave
 */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}

/*
 * The code:
 * 
 * System.out.println():
 * - println(): a method that prints a message to the console.
 * - in parantheses, print the message that needs to be printed.
 * - ; : end of statement
 */

/*
 * The execution:
 * - When the code is executed: Java looks for main() (entry point)
 * - Once the entry point is found, the code inside will run
 * - The code reaches the end because there is no code left in parantheses
 */