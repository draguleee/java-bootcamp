// Workbook 4.3

public class Weather {

    // Main method
    public static void main(String[] args) {
        double noon = 77;          // Temperature at noon in fahrenheit.
        double evening = 61;       // Temperature during the evening in fahrenheit
        double midnight = 55;      // Temperature at midnight in fahrenheit

        // Print the temperatures
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
        
    } 

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)
     * 
     * Inside the function:
     * 1. returns the temperature in celsius. C = (F - 32) * 5/9. 
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    /**
     * Function name: printTemperatures – prints both temperature values. 
     * @param fahrenheit (double)
     * 
     * Inside the function: 
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> . 
     */
    public static void printTemperatures(double fahrenheit) {
        System.out.println("F = " + fahrenheit);
        System.out.println("C = " + fahrenheitToCelsius(fahrenheit) + "\n");
    }

}