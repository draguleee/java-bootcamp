/**
 * Workbook 4.3 - Weather
 */

public class Weather {
    public static void main(String[] args) {

        // Temperatures for noon, evening and midnight in Fahrenheit
        double noon = 77;          
        double evening = 61;       
        double midnight = 55;     

        // Print the temperatures
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
        
    }

    /**
     * fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)  
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    /**
     * printTemperatures – prints both temperature values. 
     * @param fahrenheit (double)
     * @return none
     * Inside the function: 
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> . 
     */
    public static void printTemperatures(double fahrenheit) {
        System.out.println("\nFahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));
    }
}