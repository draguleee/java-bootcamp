import java.util.Arrays;

/**
 * Workbook 6.11 - Weather
 */

public class Weather {
    public static void main(String[] args) {
        
        // Array of type double with celsius variablea
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusToFahrenheit(celsius);

        // Print the array's contents
        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");

    }

    /**
     * celsiusToFahrenheit - converts the temperature from Celsius to Fahrenheit.
     * @param celsius (double[])
     * @return fahrenheit (double[])
     */
    public static double[] celsiusToFahrenheit(double[] celsius) {
        double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);
        for (int i = 0; i < fahrenheit.length; i++) {
            fahrenheit[i] = (celsius[i]/5 * 9) + 32;
        }
        return fahrenheit;
    }

    /**
     * printTemperatures - prints the temperatures in Celsius and Fahrenheit
     * @param temp
     * @param tempType
     */
    public static void printTemperatures(double[] temp, String tempType) {
        System.out.print(tempType + ": ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }

}
