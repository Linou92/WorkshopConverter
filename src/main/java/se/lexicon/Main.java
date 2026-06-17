package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static void printMenu() {
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
    }

    static void main() {

        boolean running = true;

        while (running){

            printMenu();
            int choice = Integer.parseInt(IO.readln("Choose an option: "));

            switch (choice) {

                case 1 -> ConverterApp.currencyConverter();
                case 2 -> ConverterApp.temperatureConverter();
                case 3 -> ConverterApp.lengthConverter();
                case 4 -> ConverterApp.weightConverter();
                case 5 -> ConverterApp.timeConverter();
                case 6 -> ConverterApp.speedConverter();
                case 7 -> ConverterApp.dataStorageConverter();
                case 8 -> ConverterApp.bmiCalculator();
                case 9 -> ConverterApp.fuelConsumptionConverter();
                case 10 -> ConverterApp.gradeConverter();
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
