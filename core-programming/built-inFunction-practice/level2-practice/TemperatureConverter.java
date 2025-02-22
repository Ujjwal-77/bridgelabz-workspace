import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Convert to (C/F): ");
        char choice = scanner.next().toUpperCase().charAt(0);
        
        scanner.close();
        
        if (choice == 'C') {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
        } else if (choice == 'F') {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
        } else {
            System.out.println("Invalid choice! Please enter 'C' or 'F'.");
        }
    }

    private static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    private static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
