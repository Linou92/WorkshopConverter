package se.lexicon;

public class ConverterApp {

    // currency
    private static final double SEK_TO_USD_RATE = 10.87;
    private static final double SEK_TO_EUR_RATE = 11.32;

    // temperature
    private static final double FAHRENHEIT_OFFSET = 32;
    private static final double TEMP_FACTOR = 9.0 / 5.0;
    public static final double ABSOLUTE_ZERO_C = -273.15;
    public static final double ABSOLUTE_ZERO_F = -459.67;


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


    // currency functions
    static double sekToUsd(double sek) {
        return sek / SEK_TO_USD_RATE;
    }

    static double sekToEur(double sek) {
        return sek / SEK_TO_EUR_RATE;
    }

    // temperature functions
    static double celsiusToFahrenheit(double celsius) {
        return celsius * TEMP_FACTOR + FAHRENHEIT_OFFSET;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_OFFSET) / TEMP_FACTOR;
    }

    // length functions
    static double centimetersToMeters(double cm) {
        return cm / CM_TO_M;
    }

    static double metersToKilometers(double meters) {
        return meters / M_TO_KM;
    }

    // weight functions
    static double kilogramsToGrams(double kg) {
        return kg * KG_TO_G;
    }

    static double kilogramsToPounds(double kg) {
        return kg * KG_TO_LB;
    }

    // time functions
    static double hoursToMinutes(double hours) {
        return hours * TIME_CONSTANT;
    }

    static double minutesToSeconds(double minutes) {
        return minutes * TIME_CONSTANT;
    }

    // speed functions
    static double kmhToMs(double kmh) {
        return kmh / KMH_TO_MS_FACTOR;
    }

    static double msToKmh(double ms) {
        return ms * KMH_TO_MS_FACTOR;
    }

    // data storage functions
    static double kbToMb(double kb) {
        return kb / STORAGE_FACTOR;
    }

    static double mbToGb(double mb) {
        return mb / STORAGE_FACTOR;
    }

    // BMI functions
    static double calculateBmi(double height, double weight) {
        return weight / Math.pow(height, 2);
    }

    static String bmiCategory(double bmi) {
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

    // fuel consumption functions
    static double litresPer100KnToKmPerLitre(double litresPer100Km) {
        return FUEL_CONSTANT / litresPer100Km;
    }

    static double kmPerLitreToLitresPer100Km(double kmPerLitre) {
        return FUEL_CONSTANT / kmPerLitre;
    }

    // grade functions
    static String gradeResult(double score) {
       // long roundedScore = Math.round(score);
        if (score >= 90) {
            return "Grade A - Excellent";
        }
        if (score >= 80) {
            return "Grade B - Good";
        }
        if (score >= 70) {
            return "Grade C - Pass";
        }
        if (score >= 60) {
            return "Grade D - Below average";
        }
        return "Grade F - Fail";
    }
}
