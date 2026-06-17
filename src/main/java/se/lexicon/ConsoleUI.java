package se.lexicon;

public class ConsoleUI {

    // print the menu
    static void printMenu() {
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

    // currency result
    public static void currencyConverter() {

        IO.println("""
            --- Currency Converter ---
            1. SEK to USD
            2. SEK to EUR
            """);

        int choice =
                InputValidator.readMenuChoice(
                        "Your choice: ",
                        1,
                        2);

        double sek =
                InputValidator.readPositiveDouble(
                        "Enter amount in SEK: ", "Amount");

        switch (choice) {

            case 1 ->
                    System.out.printf(
                            "Result: %.2f USD%n",
                            ConverterApp.sekToUsd(sek));

            case 2 ->
                    System.out.printf(
                            "Result: %.2f EUR%n",
                            ConverterApp.sekToEur(sek));
        }
    }

    // temperature result
    static void temperatureConverter() {

        IO.println("""
                --- Temperature Converter ---
                Convert:
                1. Celsius to Fahrenheit
                2. Fahrenheit to Celsius
                """);

        int choice = InputValidator.readInt("Your choice: ");

        switch (choice) {
            case 1 -> {
                double c =
                        InputValidator.readDoubleInRange(
                                "Enter temperature in Celsius: ",
                                ConverterApp.ABSOLUTE_ZERO_C,
                                Double.MAX_VALUE,
                                "Invalid value. Temperature cannot be below absolute zero (-273.15 C)."
                        );
                System.out.printf("Result: %.2f C = %.2f F%n",
                        c,
                        ConverterApp.celsiusToFahrenheit(c));
            }
            case 2 -> {
                double f =
                        InputValidator.readDoubleInRange(
                                "Enter temperature in Fahrenheit: ",
                                 ConverterApp.ABSOLUTE_ZERO_F,
                                Double.MAX_VALUE,
                                "Invalid value. Temperature cannot be below absolute zero (-459.67 F)."
                        );                System.out.printf("Result: %.2f F = %.2f C%n",
                        f,
                        ConverterApp.fahrenheitToCelsius(f));
            }
            default -> IO.println("Invalid choice.");
        }
    }

    // length result
    static void lengthConverter() {

        IO.println("""
                --- Length Converter ---
                Convert:
                1. Centimeters to Meters
                2. Meters to Kilometers
                """);

        int choice = InputValidator.readInt("Your choice: ");

        switch (choice) {
            case 1 -> {
                double cm = InputValidator.readPositiveDouble("Enter length in cm: ", "Length");
                System.out.printf("Result: %.2f cm = %.2f m%n",
                        cm,
                        ConverterApp.centimetersToMeters(cm));
            }
            case 2 -> {
                double m = InputValidator.readPositiveDouble("Enter length in m: ",  "Length");
                System.out.printf("Result: %.2f m = %.2f km%n",
                        m,
                        ConverterApp.metersToKilometers(m));
            }
            default -> IO.println("Invalid choice.");
        }
    }

    // weight result
    static void weightConverter() {

        IO.println("""
                --- Weight Converter ---
                Convert:
                1. Kilograms to Grams
                2. Kilograms to Pounds
                """);

        int choice = InputValidator.readInt("Your choice: ");
        double kg = InputValidator.readPositiveDouble("Enter weight in kg: ", "Weight");

        switch (choice) {
            case 1 ->
                    System.out.printf("Result: %.2f kg = %.2f g%n",
                            kg,
                            ConverterApp.kilogramsToGrams(kg));
            case 2 ->
                    System.out.printf("Result: %.2f kg = %.2f lb%n",
                            kg,
                            ConverterApp.kilogramsToPounds(kg));
            default -> IO.println("Invalid choice.");
        }
    }

    // time result
    static void timeConverter() {

        IO.println("""
                --- Time Converter ---
                Convert:
                1. Hours to Minutes
                2. Minutes to Seconds
                """);

        int choice = InputValidator.readInt("Your choice: ");

        switch (choice) {
            case 1 -> {
                double h = InputValidator.readPositiveDouble("Enter time in hours: ", "Time");
                System.out.printf("Result: %.2f h = %.2f min%n",
                        h,
                        ConverterApp.hoursToMinutes(h));
            }
            case 2 -> {
                double min = InputValidator.readPositiveDouble("Enter time in min: ", "Time");
                System.out.printf("Result: %.2f min = %.2f sec%n",
                        min,
                        ConverterApp.minutesToSeconds(min));
            }
            default -> IO.println("Invalid choice.");
        }
    }

    // speed result
    static void speedConverter() {

        IO.println("""
                --- Speed Converter ---
                Convert:
                1. km/h to m/s
                2. m/s to km/h
                """);

        int choice = InputValidator.readInt("Your choice: ");

        switch (choice) {
            case 1 -> {
                double kmh = InputValidator.readPositiveDouble("Enter speed in km/h: ", "Speed");
                System.out.printf("Result: %.2f km/h = %.2f m/s%n",
                        kmh,
                        ConverterApp.kmhToMs(kmh));
            }
            case 2 -> {
                double ms = InputValidator.readPositiveDouble("Enter speed in m/s: ", "Speed");
                System.out.printf("Result: %.2f m/s = %.2f km/h%n",
                        ms,
                        ConverterApp.msToKmh(ms));
            }
            default -> IO.println("Invalid choice.");
        }
    }

    // data result
    static void dataStorageConverter() {

        IO.println("""
                --- Data Storage Converter ---
                Convert:
                1. Kilobytes to Megabytes
                2. Megabytes to Gigabytes
                """);

        int choice = InputValidator.readInt("Your choice: ");

        switch (choice) {
            case 1 -> {
                double kb = InputValidator.readPositiveDouble("Enter storage in KB: ", "Storage");
                System.out.printf("Result: %.2f KB = %.2f MB%n",
                        kb,
                        ConverterApp.kbToMb(kb));
            }
            case 2 -> {
                double mb = InputValidator.readPositiveDouble("Enter storage in MB: ", "Storage");
                System.out.printf("Result: %.2f MB = %.2f GB%n",
                        mb,
                        ConverterApp.mbToGb(mb));
            }
            default -> IO.println("Invalid choice.");
        }
    }

    // BMI result
    private static String bmiCategory (double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        }
        if (bmi < 25) {
            return "Normal weight";
        }
        if (bmi < 30) {
            return "Overweight";
        }
        return "Obese";
    }

    static void bmiCalculator() {

        IO.println("""
                --- BMI Calculator --- 
                """);

        double weight = InputValidator.readPositiveDouble("Enter weight in kg: ", "Weight");
        double height = InputValidator.readPositiveDouble("Enter height in meters: ", "Height");
        double bmi = ConverterApp.calculateBmi(height, weight);

        IO.println(String.format(
                "BMI: %.2f -> %s",
                bmi,
                bmiCategory(bmi)));
    }

    // fuel result
    static void fuelConsumptionConverter() {

        IO.println("""
                --- Fuel Consumption Converter ---
                Convert:
                1. L/100km to km/L
                2. km/L to L/100km
                """);

        int choice = InputValidator.readInt("Your choice: ");

        switch (choice) {
            case 1 -> {
                double L_KM = InputValidator.readPositiveDouble("Enter fuel in L/100km: ", "Fuel");
                System.out.printf("Result: %.2f L/100km = %.2f Km/L%n",
                        L_KM,
                        ConverterApp.litresPer100KnToKmPerLitre(L_KM));
            }
            case 2 -> {
                double KM_L = InputValidator.readPositiveDouble("Enter fuel in km/L: ", "Fuel");
                System.out.printf("Result: %.2f km/L = %.2f L/100km%n",
                        KM_L,
                        ConverterApp.kmPerLitreToLitresPer100Km(KM_L));
            }
            default -> IO.println("Invalid choice.");
        }
    }

    // grade result
    private static String gradeResult (double score) {
        long roundedScore = Math.round(score);
        if (roundedScore > 100 || roundedScore < 0) {
            return "Invalid score";
        }
        if (roundedScore >= 90) {
            return "Grade A - Excellent";
        }
        if (roundedScore >= 80) {
            return "Grade B - Good";
        }
        if (roundedScore >= 70) {
            return "Grade C - Pass";
        }
        if (roundedScore >= 60) {
            return "Grade D - Below average";
        }
        return "Grade F - Fail";
    }

    static void gradeConverter() {

        IO.println("""
                --- Grade Converter ---
                """);

        double score = InputValidator.readPositiveDouble("Enter your score: ", "Score");

        IO.println(String.format(
                "Your grade: %s",
                gradeResult(score)));
    }
}
