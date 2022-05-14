import java.util.Scanner;

import static componance.GameDocument.gameDocument;
import static componance.ingame.CardGenerator.cardRandom;
import static componance.ingame.GameControl.play;

public class PlayBaccaratGame {
    public static void main(String[] args) {
        System.out.println("===== WELCOME TO BACCARAT GAME =====");
        String gameFunction;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("\n Type to selected function");
            System.out.println(
                    """
                            \t > [s] to start game\s
                            \t > [r] to random card again\s
                            \t > [d] to read document\s
                            """);
            System.out.print("[PLAY]>> ");
            gameFunction = scan.next();
            gameFunction = gameFunction.toLowerCase();
            switch (gameFunction){
                case "s" -> play();
                case "r" -> cardRandom();
                case "d" -> gameDocument();
            }
        } while (!gameFunction.equals("e".toLowerCase()));
    }
}
