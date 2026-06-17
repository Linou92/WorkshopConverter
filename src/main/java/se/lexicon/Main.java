package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main() {

        try{
            while (true){

                ConsoleUI.runMenu(ConsoleUI.MENU_ITEMS);

                String answer = IO.readln("\nContinue? (yes/no): ");

                if (!answer.equalsIgnoreCase("yes")) {
                    IO.println("Goodbye!");
                    break;
                }
            }
        } catch (RuntimeException e) {
            // exit triggered
        }

    }
}
