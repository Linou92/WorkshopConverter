package se.lexicon;

import java.util.Scanner;

public class ConverterApp {

    private static final double SEK_TO_USD_RATE = 10.87;
    private static final double SEK_TO_EUR_RATE = 11.32;


    static void currencyConverter(Scanner scanner) {

        IO.println("--- Currency Converter ---" + "\n" +
                   "Convert:" + "\n" +
                   "  1. SEK to USD" + "\n" +
                   "  2. USD to SEK" + "\n" +
                   "Your choice: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            IO.println("Enter amount in SEK: ");
            double sek = scanner.nextDouble();
            double usd = sek / SEK_TO_USD_RATE;
            System.out.printf("Result: %.2f SEK = %.2f USD%n", sek, usd);
        }
        else if (choice == 2) {
            IO.println("Enter amount in SEK: ");
            double sek = scanner.nextDouble();
            double eur = sek / SEK_TO_EUR_RATE;
            System.out.printf("Result: %.2f SEK = %.2f EUR%n", sek, eur);
        }
        else {
            IO.println("Invalid choice.");
        }
    }

    static void temperatureConverter(Scanner scanner) {

        IO.println("--- Temperature Converter ---" + "\n" +
                "Convert:" + "\n" +
                "  1. Celsius to Fahrenheit" + "\n" +
                "  2. Fahrenheit to Celsius" + "\n" +
                "Your choice: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            IO.println("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsius * 9.0 / 5.0 + 32;
            System.out.printf("Result: %.2f C = %.2f F%n", celsius, fahrenheit);
        }
        else if (choice == 2) {
            IO.println("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5.0 / 9.0;
            System.out.printf("Result: %.2f F = %.2f C%n", fahrenheit, celsius);
        }
        else {
            IO.println("Invalid choice.");
        }
    }
}
