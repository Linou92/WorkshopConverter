package se.lexicon;

public class InputValidator {

    static int readMenuChoice(String prompt, int min, int max) {
        while (true) {
            int choice = InputValidator.readInt(prompt);
            if (choice >= min && choice <= max) {
                return choice;
            }
            IO.println("❌ Invalid choice. Please enter a number between " + min + " and " + max + ".");
        }
    }

    static double readDouble(String prompt) {
        while (true) {
            try {
                return Double.parseDouble(IO.readln(prompt));
            } catch (NumberFormatException e) {
                IO.println("❌ Invalid input! Please enter a number.");
            }
        }
    }

    public static int readInt(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(IO.readln(prompt));
            } catch (NumberFormatException e) {
                IO.println("❌ Invalid input! Please enter a whole number.");
            }
        }
    }

    public static double readPositiveDouble(String prompt, String fieldName) {

        while (true) {

            double value = readDouble(prompt);

            if (value >= 0) {
                return value;
            }

            IO.println("❌ Invalid value. " + fieldName + " cannot be negative.");
        }
    }

    public static double readDoubleInRange(String prompt, double min, double max, String errorMessage) {

        while (true) {

            double value = readDouble(prompt);

            if (value >= min && value <= max) {
                return value;
            }

            IO.println(errorMessage);
        }
    }
}
