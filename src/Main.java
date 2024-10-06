import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the temperature converter");
        Scanner scanner = new Scanner(System.in);

        // Variables for temperatures
        double celsius;
        double fahrenheit;

        // Prompt user to enter temperature in Celsius
        System.out.print("Enter the temperature in degrees Celsius: ");
        celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        fahrenheit = (celsius * 9/5) + 32;

        // Format and display the result with two decimal places
        System.out.printf("%.2f degrees Celsius are equivalents to %.2f degrees Fahrenheit.%n", celsius, fahrenheit);

        // Convert Fahrenheit to Celsius
        System.out.print("Enter the temperature in degrees Fahrenheit:");
        fahrenheit = scanner.nextDouble();

        celsius = (fahrenheit - 32) * 5/9;

        // Format and display the result with two decimal places
        System.out.printf("%.2f degrees Fahrenheit are equivalents to %.2f degrees Celsius.%n", fahrenheit, celsius);
    }
}