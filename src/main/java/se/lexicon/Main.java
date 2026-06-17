package se.lexicon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){

            IO.println("==================================" + "\n" +
                    "      LEXICON CONVERTER APP" + "\n" +
                    "==================================" + "\n" +
                    "1. Currency Converter" + "\n" +
                    "2. Temperature Converter" + "\n" +
                    "3. Length Converter" + "\n" +
                    "4. Weight Converter" + "\n" +
                    "5. Time Converter" + "\n" +
                    "6. Speed Converter" + "\n" +
                    "7. Data Storage Converter" + "\n" +
                    "8. BMI Calculator" + "\n" +
                    "9. Fuel Consumption Converter" + "\n" +
                    "10. Grade Converter" + "\n" +
                    "11. Exit" + "\n" +
                    "==================================" + "\n" +
                    "Choose an option: "
            );

            int choice = scanner.nextInt();
            IO.println();

            switch (choice) {

                case 1:
                    ConverterApp.currencyConverter(scanner);
                    break;

                case 2:
                    ConverterApp.temperatureConverter(scanner);
                    break;

                /*case 3:
                    ConverterApp.lengthConverter(scanner);
                    break;

                case 4:
                    ConverterApp.weightConverter(scanner);
                    break;

                case 5:
                    ConverterApp.timeConverter(scanner);
                    break;

                case 6:
                    ConverterApp.speedConverter(scanner);
                    break;

                case 7:
                    ConverterApp.dataStorageConverter(scanner);
                    break;

                case 8:
                    ConverterApp.bmiCalculator(scanner);
                    break;

                case 9:
                    ConverterApp.fuelConsumptionConverter(scanner);
                    break;

                case 10:
                    ConverterApp.gradeConverter(scanner);
                    break;*/

                case 11:
                    IO.println("Goodbye!");
                    running = false;
                    continue;

                default:
                    IO.println("Invalid option.");
                    break;
            }

            IO.print("\nContinue? (yes/no): ");
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase("yes")) {
                IO.println("Goodbye!");
                running = false;
            }

            IO.println();
        }
        scanner.close();
    }
}
