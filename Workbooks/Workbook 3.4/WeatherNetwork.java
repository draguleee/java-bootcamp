import java.util.Scanner;

// Workbook 3.4

public class WeatherNetwork {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Forecast variable
        String forecast = "";

        // Celsius temperature variable
        System.out.println("\nHow many degrees Celsius are today?");
        int temp = in.nextInt();

        // Check the forecast
        if(temp >= -15 && temp < 0) {
            forecast = "The forecast is FREEZING! Stay home!";
        }
        else if(temp >= 0 && temp <= 10) {
            forecast = "The forecast is CHILLY. Wear a coat!";
        }
        else if(temp > 10) {
            forecast = "The forecast is WARM. Go outside!";
        }
        else {
            forecast = "Bruh... Yo ass finna be a popsicle.";
        }

        // Print the forecast
        System.out.println(forecast);

        // Close the Scanner
        in.close();

    }
    
}
