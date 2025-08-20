//This is a simple celsius to fahrenheit converter
import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){

         //Ask user for temperature in Celsius degrees
         System.out.print("Please enter celsius degrees to convert to Fahrenheit: ");
         float celsius = scanner.nextFloat();
         
         float fahrenheit = (celsius * 9/5) + 32.0f;

         System.out.println("The celsius degrees in fahrenheit is  " + fahrenheit + " degrees");
        }         
    }
}
