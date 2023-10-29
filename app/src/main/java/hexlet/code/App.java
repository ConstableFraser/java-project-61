package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Calculator;
import hexlet.code.games.Progression;
import static hexlet.code.Cli.greeting;

public class App {
    private static final String[] MENU_OF_GAME = {"Greet", "Even", "Calc", "GCD", "Progression", "Prime", "Exit"};
    private static final String WELCOME_TEXT = "Please enter the game number and press Enter.";
    private static final int EXIT = 0;
    private static final int GREETING = 1;
    private static final int EVEN = 2;
    private static final int CALCULATOR = 3;
    private static final int GCD_ITEM = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuItem;

        System.out.println(WELCOME_TEXT);
        printListOfGames();
        menuItem = scanner.nextInt();
        System.out.println("Your choice: " + menuItem);

        startGame(menuItem);
    }
    private static void printListOfGames() {
        var length = MENU_OF_GAME.length;
        for (int i = 0; i < length - 1; i++) {
            System.out.println(i + 1 + " - " + MENU_OF_GAME[i]);
        }
        System.out.println(0 + " - " + MENU_OF_GAME[length - 1]);
    }

    private static void startGame(int menuItem) {
        switch (menuItem) {
            case GREETING:
                greeting();
                return;
            case EVEN:
                Even.playGame(greeting());
                break;
            case CALCULATOR:
                Calculator.playGame(greeting());
                break;
            case GCD_ITEM:
                GCD.playGame(greeting());
                break;
            case PROGRESSION:
                Progression.playGame(greeting());
                break;
            case PRIME:
                Prime.playGame(greeting());
                break;
            case EXIT:
            default:
                break;
        }
    }
}
