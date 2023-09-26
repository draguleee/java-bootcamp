/**
 * Workbook 3.4 - Weather Network
 */

public class WeatherNetwork {
    public static void main(String[] args) {

        // Variable for the temperature in Celsius
        int temp = -12;  

        // Variable for the forecast (empty String for now)
        String forecast = "";

        // Update the forecast based on the temperature
        if(temp <= -1) {
            forecast = "\nThe forecast is FREEZING! Stay home!";
        } else if(temp <= 10) {
            forecast = "\nThe forecast is CHILLY. Wear a coat!";
        } else {
            forecast = "\nThe forecast is WARM. Go outside!";
        }
        System.out.println(forecast);
    }
}
