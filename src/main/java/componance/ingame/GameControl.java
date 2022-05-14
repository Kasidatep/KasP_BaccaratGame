package componance.ingame;

import static componance.ingame.CardGenerator.*;
import static componance.ingame.DeleteGameItem.deleteItemGame;
import static componance.ingame.GameCard.baccaratGame;
import static componance.ingame.TurnControl.*;

public class GameControl {

    public static void play() {
        deleteItemGame();
        createCard();
        cardRandom();
        baccaratGame();
        for (int i = 0 ; i < 6 ; i++){
            int j = cardList[i];
            System.out.println(deck[j]);
        }
        inGame();
    }

}
