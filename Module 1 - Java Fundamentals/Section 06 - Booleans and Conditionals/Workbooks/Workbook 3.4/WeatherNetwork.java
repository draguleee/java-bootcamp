import java.util.Scanner;

/**
 * Workbook 3.4 - Weather Network
 */

public class WeatherNetwork {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Variable for temperature (Celsius)
        System.out.print("Temperature (Celsius): ");
        int temp = in.nextInt();  

        // Variable for forecast String (does not start with a value)
        String forecast = "";

        // Compare the temp variable against different values
        if(temp <= -1) {
           forecast = "The forecast is FREEZING! Stay home.";
        } else if(temp <= 10) {
            forecast = "The forecast is CHILLY. Wear a coat!";
        } else {
            forecast = "It's WARM. Go outside!";
        }
        System.out.println(forecast);

        // Close the Scanner
        in.close();

    }
}
