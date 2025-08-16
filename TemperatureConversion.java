import java.util.Scanner;

public class TemperatureConversion {
    // Converts Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Converts Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Converts Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Converts Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    // Converts Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Converts Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double input, result;

        System.out.println("Temperature Conversion Program");
        System.out.println("Choose conversion option:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6): ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                input = sc.nextDouble();
                result = celsiusToFahrenheit(input);
                System.out.printf("%.2f °C = %.2f °F\n", input, result);
                break;
            case 2:
                System.out.print("Enter temperature in Celsius: ");
                input = sc.nextDouble();
                result = celsiusToKelvin(input);
                System.out.printf("%.2f °C = %.2f K\n", input, result);
                break;
            case 3:
                System.out.print("Enter temperature in Fahrenheit: ");
                input = sc.nextDouble();
                result = fahrenheitToCelsius(input);
                System.out.printf("%.2f °F = %.2f °C\n", input, result);
                break;
            case 4:
                System.out.print("Enter temperature in Fahrenheit: ");
                input = sc.nextDouble();
                result = fahrenheitToKelvin(input);
                System.out.printf("%.2f °F = %.2f K\n", input, result);
                break;
            case 5:
                System.out.print("Enter temperature in Kelvin: ");
                input = sc.nextDouble();
                result = kelvinToCelsius(input);
                System.out.printf("%.2f K = %.2f °C\n", input, result);
                break;
            case 6:
                System.out.print("Enter temperature in Kelvin: ");
                input = sc.nextDouble();
                result = kelvinToFahrenheit(input);
                System.out.printf("%.2f K = %.2f °F\n", input, result);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
