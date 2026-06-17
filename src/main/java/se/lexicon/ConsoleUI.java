package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class ConsoleUI {

    static final List<MenuItem> MENU_ITEMS =
            List.of(
                    new MenuItem("Currency Converter",
                            List.of(
                                    new MenuItem(
                                            "SEK to USD",
                                            () -> {
                                                double sek = InputValidator.readPositiveDouble("Enter amount in SEK: ", "Amount");
                                                IO.println(String.format("Result: %.2f SEK = %.2f USD%n", sek, ConverterApp.sekToUsd(sek)));
                                            }
                                    ),
                                    new MenuItem(
                                            "SEK to EUR",
                                            () -> {
                                                double sek = InputValidator.readPositiveDouble("Enter amount in SEK: ", "Amount");
                                                IO.println(String.format("Result: %.2f SEK = %.2f EUR%n", sek, ConverterApp.sekToEur(sek)));
                                            }
                                    )
                            )),
                    new MenuItem("Temperature Converter",
                            List.of(
                                    new MenuItem(
                                            "Celsius to Fahrenheit",
                                            () -> {
                                                double celsius = InputValidator.readDoubleInRange(
                                                        "Enter temperature in Celsius: ",
                                                        ConverterApp.ABSOLUTE_ZERO_C,
                                                        Double.MAX_VALUE,
                                                        "Invalid value. Temperature cannot be below absolute zero (-273.15 C)."
                                                );
                                                IO.println(String.format("Result: %.2f C = %.2f F%n", celsius, ConverterApp.celsiusToFahrenheit(celsius)));
                                            }
                                    ),
                                    new MenuItem(
                                            "Fahrenheit to Celsius",
                                            () -> {
                                                double fahrenheit = InputValidator.readDoubleInRange(
                                                        "Enter temperature in Fahrenheit: ",
                                                        ConverterApp.ABSOLUTE_ZERO_F,
                                                        Double.MAX_VALUE,
                                                        "Invalid value. Temperature cannot be below absolute zero (-459.67 F)."
                                                );
                                                IO.println(String.format("Result: %.2f F = %.2f C%n", fahrenheit, ConverterApp.fahrenheitToCelsius(fahrenheit)));
                                            }
                                    )
                            )),
                    new MenuItem("Length Converter",
                            List.of(
                                    new MenuItem(
                                            "Centimeters to Meters",
                                            () -> {
                                                double cm = InputValidator.readPositiveDouble("Enter length in cm: ", "Length");
                                                IO.println(String.format("Result: %.2f cm = %.2f m%n",
                                                        cm,
                                                        ConverterApp.centimetersToMeters(cm)));
                                            }
                                    ),
                                    new MenuItem(
                                            "Meters to Kilometers",
                                            () -> {
                                                double m = InputValidator.readPositiveDouble("Enter length in m: ", "Length");
                                                IO.println(String.format("Result: %.2f m = %.2f km%n",
                                                        m,
                                                        ConverterApp.metersToKilometers(m)));
                                            }
                                    )
                            )),
                    new MenuItem("Weight Converter",
                            List.of(
                                    new MenuItem(
                                            "Kilograms to Grams",
                                            () -> {
                                                double kg = InputValidator.readPositiveDouble("Enter weight in kg: ", "Weight");
                                                IO.println(String.format("Result: %.2f kg = %.2f g%n",
                                                        kg,
                                                        ConverterApp.kilogramsToGrams(kg)));
                                            }
                                    ),
                                    new MenuItem(
                                            "Kilograms to Pounds",
                                            () -> {
                                                double kg = InputValidator.readPositiveDouble("Enter weight in kg: ", "Weight");
                                                IO.println(String.format("Result: %.2f kg = %.2f lb%n",
                                                        kg,
                                                        ConverterApp.kilogramsToPounds(kg)));
                                            }
                                    )
                            )),
                    new MenuItem("Time Converter",
                            List.of(
                                    new MenuItem(
                                            "Hours to Minutes",
                                            () -> {
                                                double h = InputValidator.readPositiveDouble("Enter time in hours: ", "Time");
                                                IO.println(String.format("Result: %.2f h = %.2f min%n",
                                                        h,
                                                        ConverterApp.hoursToMinutes(h)));
                                            }
                                    ),
                                    new MenuItem(
                                            "Minutes to Seconds",
                                            () -> {
                                                double min = InputValidator.readPositiveDouble("Enter time in min: ", "Time");
                                                IO.println(String.format("Result: %.2f min = %.2f sec%n",
                                                        min,
                                                        ConverterApp.minutesToSeconds(min)));
                                            }
                                    )
                            )),
                    new MenuItem("Speed Converter",
                            List.of(
                                    new MenuItem(
                                            "km/h to m/s",
                                            () -> {
                                                double kmh = InputValidator.readPositiveDouble("Enter speed in km/h: ", "Speed");
                                                IO.println(String.format("Result: %.2f km/h = %.2f m/s%n",
                                                        kmh,
                                                        ConverterApp.kmhToMs(kmh)));
                                            }
                                    ),
                                    new MenuItem(
                                            "m/s to km/h",
                                            () -> {
                                                double ms = InputValidator.readPositiveDouble("Enter speed in m/s: ", "Speed");
                                                IO.println(String.format("Result: %.2f m/s = %.2f km/h%n",
                                                        ms,
                                                        ConverterApp.msToKmh(ms)));
                                            }
                                    )
                            )),
                    new MenuItem("Data Storage Converter",
                            List.of(
                                    new MenuItem(
                                            "Kilobytes to Megabytes",
                                            () -> {
                                                double kb = InputValidator.readPositiveDouble("Enter storage in KB: ", "Storage");
                                                IO.println(String.format("Result: %.2f KB = %.2f MB%n",
                                                        kb,
                                                        ConverterApp.kbToMb(kb)));
                                            }
                                    ),
                                    new MenuItem(
                                            "Megabytes to Gigabytes",
                                            () -> {
                                                double mb = InputValidator.readPositiveDouble("Enter storage in MB: ", "Storage");
                                                IO.println(String.format("Result: %.2f MB = %.2f GB%n",
                                                        mb,
                                                        ConverterApp.mbToGb(mb)));
                                            }
                                    )
                            )),
                    new MenuItem("BMI Calculator",
                                        () -> {
                                            double weight = InputValidator.readPositiveDouble("Enter weight in kg: ", "Weight");
                                            double height = InputValidator.readPositiveDouble("Enter height in meters: ", "Height");
                                            double bmi = ConverterApp.calculateBmi(height, weight);
                                            IO.println(String.format("BMI: %.2f -> %s",
                                                        bmi,
                                                        ConverterApp.bmiCategory(bmi)));
                                            }
                                    ),
                    new MenuItem("Fuel Consumption Converter",
                            List.of(
                                    new MenuItem(
                                            "L/100km to km/L",
                                            () -> {
                                                double L_KM = InputValidator.readPositiveDouble("Enter fuel in L/100km: ", "Fuel");
                                                IO.println(String.format("Result: %.2f L/100km = %.2f Km/L%n",
                                                        L_KM,
                                                        ConverterApp.litresPer100KnToKmPerLitre(L_KM)));
                                            }
                                    ),
                                    new MenuItem(
                                            "km/L to L/100km",
                                            () -> {
                                                double KM_L = InputValidator.readPositiveDouble("Enter fuel in km/L: ", "Fuel");
                                                IO.println(String.format("Result: %.2f km/L = %.2f L/100km%n",
                                                        KM_L,
                                                        ConverterApp.kmPerLitreToLitresPer100Km(KM_L)));
                                            }
                                    )
                            )),
                    new MenuItem("Grade Converter",
                                        () -> {
                                           double score = InputValidator.readPositiveDouble("Enter your score: ", "Score");
                                           IO.println(String.format("Your grade: %s",
                                                          ConverterApp.gradeResult(score)));
                                        }
                                    )
            );

    // print the menu
    static void printMenu(List<MenuItem> menu) {

        IO.println("""
                 ==================================
                       LEXICON CONVERTER APP
                 ==================================
                """);
        for (int i = 0; i < menu.size(); i++) {
            IO.println((i + 1) + ". " + menu.get(i).getName());
        }

        // AUTO-GENERATED EXIT OPTION
        IO.println((menu.size() + 1) + ". Exit");

        IO.println("""
                 ==================================
                """);
    }

    static void runMenu(List<MenuItem> menu) {
        printMenu(menu);
        int choice = InputValidator.readMenuChoice("Choose an option: ", 1, menu.size()+1);

        // EXIT CASE (always last option)
        if (choice == menu.size() + 1) {
            IO.println("Goodbye!");
            System.exit(0);
        }

        MenuItem selected = menu.get(choice - 1);

        if (selected.hasChildren()) {
            IO.println("\n--- " + selected.getName() + " ---");
            IO.println("Convert:");

            for (int i = 0; i < selected.getChildren().size(); i++) {
                IO.println((i + 1) + ". " + selected.getChildren().get(i).getName());
            }
            int subChoice =
                    InputValidator.readMenuChoice(
                            "Your choice: ",
                            1,
                            selected.getChildren().size()+1);

            MenuItem actionItem = selected.getChildren().get(subChoice - 1);

            actionItem.execute();
        } else selected.execute();
    }
}

