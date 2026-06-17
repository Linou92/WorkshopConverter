package se.lexicon;

import static se.lexicon.InputValidator.readMenuChoice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /*private static int readMenuChoice(String prompt, int min, int max) {
        while (true) {
            int choice = ConverterApp.readInt(prompt);
            if (choice >= min && choice <= max) {
                return choice;
            }
            IO.println("❌ Invalid choice. Please enter a number between " + min + " and " + max + ".");
        }
    }*/

    /*private static void printMenu() {
        IO.println("""
                        ==================================
                              LEXICON CONVERTER APP
                        ==================================
                        1. Currency Converter
                        2. Temperature Converter
                        3. Length Converter
                        4. Weight Converter
                        5. Time Converter
                        6. Speed Converter
                        7. Data Storage Converter
                        8. BMI Calculator
                        9. Fuel Consumption Converter
                        10. Grade Converter
                        11. Exit
                        ==================================
                       """);
    }*/

    static void main() {

        boolean running = true;

        while (running){

            ConsoleUI.printMenu();
            int choice = InputValidator.readMenuChoice("Choose an option: ",1, 11);

            switch (choice) {

                case 1 -> ConsoleUI.currencyConverter();
                case 2 -> ConsoleUI.temperatureConverter();
                case 3 -> ConsoleUI.lengthConverter();
                case 4 -> ConsoleUI.weightConverter();
                case 5 -> ConsoleUI.timeConverter();
                case 6 -> ConsoleUI.speedConverter();
                case 7 -> ConsoleUI.dataStorageConverter();
                case 8 -> ConsoleUI.bmiCalculator();
                case 9 -> ConsoleUI.fuelConsumptionConverter();
                case 10 -> ConsoleUI.gradeConverter();
                case 11 -> {
                    IO.println("Goodbye!");
                    running = false;
                }
                default -> IO.println("Invalid option.");
            }

            if (running) {
                String answer = IO.readln("\nContinue? (yes/no): ");

                if (!answer.equalsIgnoreCase("yes")) {
                    IO.println("Goodbye!");
                    running = false;
                }
            }
            IO.println();
        }
    }
}
