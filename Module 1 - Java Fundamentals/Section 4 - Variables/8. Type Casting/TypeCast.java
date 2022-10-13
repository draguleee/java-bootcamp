// Type Casting

public class TypeCast {
    public static void main(String[] args) {
        
        // Casting double to int
        double salary = 5833.333333;
        int roundedSalary = (int)salary;
        System.out.println("\nAndre's montly salary is $" + salary);
        System.out.println("Andre's monthly rounded salary is $" + roundedSalary);
    
        // Casting int to double
        int integerVariable = 14;
        double doubleVariable = (double)integerVariable;
        System.out.println("\nInteger variable: " + integerVariable);
        System.out.println("Double variable: " + doubleVariable);

        // Casting int to long
        int smallBox = 10000;
        long largeBox = (long)smallBox;
        System.out.println("\nSmall box: " + smallBox);
        System.out.println("Large box: " + largeBox);

        // Casting long to int
        long tooMuch = 50000;
        int justFine = (int)tooMuch;
        System.out.println("\nLong: Too Much! " + tooMuch);
        System.out.println("Just fine! " + justFine + "\n");

    }

}