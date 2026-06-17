package se.lexicon;

public class ConverterApp {

    // currency
    private static final double SEK_TO_USD_RATE = 10.87;
    private static final double SEK_TO_EUR_RATE = 11.32;

    // temperature
    private static final double FAHRENHEIT_OFFSET = 32;

    // length
    private static final double CM_TO_M = 100.0;
    private static final double M_TO_KM = 1000.0;

    // weight
    private static final double KG_TO_G = 1000.0;
    private static final double KG_TO_LB = 2.20462;

    // time
    private static final double TIME_CONSTANT = 60.0;

    // speed
    private static final double KMH_TO_MS_FACTOR = 3.6;

    // storage
    private static final double STORAGE_FACTOR = 1024.0;

    // fuel
    private static final double FUEL_CONSTANT = 100.0;


    // Helper methods
    private static double readDouble(String prompt) {
        return Double.parseDouble(IO.readln(prompt));
    }

    private static int readInt(String prompt) {
        return Integer.parseInt(IO.readln(prompt));
    }

    // currency functions
    static double sekToUsd(double sek) {
        return sek / SEK_TO_USD_RATE;
    }

    static double sekToEur(double sek) {
        return sek / SEK_TO_EUR_RATE;
    }

    static void currencyConverter() {

        IO.println("""
                --- Currency Converter ---
                Convert:
                1. SEK to USD
                2. SEK to EUR 
                """);

        int choice = readInt("Your choice: ");
        double sek = readDouble("Enter amount in SEK: ");

        switch (choice) {
            case 1 -> System.out.printf("Result: %.2f SEK = %.2f USD%n",
                        sek,
                        sekToUsd(sek));
            case 2 -> System.out.printf(
                        "Result: %.2f SEK = %.2f EUR%n",
                        sek,
                        sekToEur(sek));
            default -> IO.println("Invalid choice.");
        }
    }

    // temperature functions
    private static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + FAHRENHEIT_OFFSET;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_OFFSET) * 5.0 / 9.0;
    }

    static void temperatureConverter() {

        IO.println("""
                --- Temperature Converter ---
                Convert:
                1. Celsius to Fahrenheit
                2. Fahrenheit to Celsius
                """);

        int choice = readInt("Your choice: ");

        switch (choice) {
            case 1 -> {
                double c = readDouble("Enter temperature in Celsius: ");
                System.out.printf("Result: %.2f C = %.2f F%n",
                        c,
                        celsiusToFahrenheit(c));
            }
            case 2 -> {
                double f = readDouble("Enter temperature in Fahrenheit: ");
                System.out.printf("Result: %.2f F = %.2f C%n",
                        f,
                        fahrenheitToCelsius(f));
            }
            default -> IO.println("Invalid choice.");
        }
    }

    // length functions
    private static double centimetersToMeters(double cm) {
        return cm / CM_TO_M;
    }

    private static double metersToKilometers(double meters) {
        return meters / M_TO_KM;
    }

    static void lengthConverter() {

        IO.println("""
                --- Length Converter ---
                Convert:
                1. Centimeters to Meters
                2. Meters to Kilometers
                """);

        int choice = readInt("Your choice: ");

        switch (choice) {
            case 1 -> {
                double cm = readDouble("Enter length in cm: ");
                System.out.printf("Result: %.2f cm = %.2f m%n",
                        cm,
                        centimetersToMeters(cm));
            }
            case 2 -> {
                double m = readDouble("Enter length in m: ");
                System.out.printf("Result: %.2f m = %.2f km%n",
                        m,
                        metersToKilometers(m));
            }
            default -> IO.println("Invalid choice.");
        }
    }

    // weight functions
    private static double kilogramsToGrams(double kg) {
        return kg * KG_TO_G;
    }

    private static double kilogramsToPounds(double kg) {
        return kg * KG_TO_LB;
    }

    static void weightConverter() {

        IO.println("""
                --- Weight Converter ---
                Convert:
                1. Kilograms to Grams
                2. Kilograms to Pounds
                """);

        int choice = readInt("Your choice: ");
        double kg = readDouble("Enter weight in kg: ");

        switch (choice) {
            case 1 ->
                System.out.printf("Result: %.2f kg = %.2f g%n",
                        kg,
                        kilogramsToGrams(kg));
            case 2 ->
                System.out.printf("Result: %.2f kg = %.2f lb%n",
                        kg,
                        kilogramsToPounds(kg));
            default -> IO.println("Invalid choice.");
        }
    }

    // time functions
    private static double hoursToMinutes(double hours) {
        return hours * TIME_CONSTANT;
    }

    private static double minutesToSeconds(double minutes) {
        return minutes * TIME_CONSTANT;
    }

    static void timeConverter() {

        IO.println("""
                --- Time Converter ---
                Convert:
                1. Hours to Minutes
                2. Minutes to Seconds
                """);

        int choice = readInt("Your choice: ");

        switch (choice) {
            case 1 -> {
                double h = readDouble("Enter time in hours: ");
                System.out.printf("Result: %.2f h = %.2f min%n",
                        h,
                        hoursToMinutes(h));
            }
            case 2 -> {
                double min = readDouble("Enter time in min: ");
                System.out.printf("Result: %.2f min = %.2f sec%n",
                        min,
                        minutesToSeconds(min));
            }
            default -> IO.println("Invalid choice.");
        }
    }

    // speed functions
    private static double kmhToMs (double kmh) {
        return kmh / KMH_TO_MS_FACTOR;
    }

    private static double msToKmh (double ms) {
        return ms * KMH_TO_MS_FACTOR;
    }

    static void speedConverter() {

        IO.println("""
                --- Speed Converter ---
                Convert:
                1. km/h to m/s
                2. m/s to km/h
                """);

        int choice = readInt("Your choice: ");

        switch (choice) {
            case 1 -> {
                double kmh = readDouble("Enter speed in km/h: ");
                System.out.printf("Result: %.2f km/h = %.2f m/s%n",
                        kmh,
                        kmhToMs(kmh));
            }
            case 2 -> {
            double ms = readDouble("Enter speed in m/s: ");
            System.out.printf("Result: %.2f m/s = %.2f km/h%n",
                    ms,
                    msToKmh(ms));
            }
            default -> IO.println("Invalid choice.");
        }
    }

    // data storage functions
    private static double kbToMb (double kb) {
        return kb / STORAGE_FACTOR;
    }

    private static double mbToGb (double mb) {
        return mb / STORAGE_FACTOR;
    }

    static void dataStorageConverter() {

        IO.println("""
                --- Data Storage Converter ---
                Convert:
                1. Kilobytes to Megabytes
                2. Megabytes to Gigabytes
                """);

        int choice = readInt("Your choice: ");

        switch (choice) {
            case 1 -> {
                double kb = readDouble("Enter storage in KB: ");
                System.out.printf("Result: %.2f KB = %.2f MB%n",
                        kb,
                        kbToMb(kb));
            }
            case 2 -> {
                double mb = readDouble("Enter storage in MB: ");
                System.out.printf("Result: %.2f MB = %.2f GB%n",
                        mb,
                        mbToGb(mb));
            }
            default -> IO.println("Invalid choice.");
        }
    }

    // BMI functions
    private static double calculateBmi (double height, double weight) {
        return weight / Math.pow(height, 2);
    }

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

        double weight = readDouble("Enter weight in kg: ");
        double height = readDouble("Enter height in meters: ");
        double bmi = calculateBmi(height, weight);

        IO.println(String.format(
                "BMI: %.2f -> %s",
                bmi,
                bmiCategory(bmi)));
    }

    // fuel consumption functions
    private static double litresPer100KnToKmPerLitre (double litresPer100Km) {
        return FUEL_CONSTANT / litresPer100Km;
    }

    private static double kmPerLitreToLitresPer100Km (double kmPerLitre) {
        return FUEL_CONSTANT / kmPerLitre;
    }

    static void fuelConsumptionConverter() {

        IO.println("""
                --- Fuel Consumption Converter ---
                Convert:
                1. L/100km to km/L
                2. km/L to L/100km
                """);

        int choice = readInt("Your choice: ");

        switch (choice) {
            case 1 -> {
                double L_KM = readDouble("Enter fuel in L/100km: ");
                System.out.printf("Result: %.2f L/100km = %.2f Km/L%n",
                        L_KM,
                        litresPer100KnToKmPerLitre(L_KM));
            }
            case 2 -> {
                double KM_L = readDouble("Enter fuel in km/L: ");
                System.out.printf("Result: %.2f km/L = %.2f L/100km%n",
                        KM_L,
                        kmPerLitreToLitresPer100Km(KM_L));
            }
            default -> IO.println("Invalid choice.");
        }
    }

    // grade functions
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

        double score = readDouble("Enter your score: ");

        IO.println(String.format(
                "Your grade: %s",
                gradeResult(score)));
    }
}
