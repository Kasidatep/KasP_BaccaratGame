package componance.ingame;

import static componance.ingame.CardGenerator.createCard;
import static componance.ingame.CardGenerator.cardRandom;
import static componance.ingame.DeleteGameItem.deleteItemGame;
import static componance.ingame.GameCard.listGameItem;
import static componance.ingame.TurnControl.*;

public class GameControl {

    public static void play() {
        deleteItemGame();
        createCard();
        cardRandom();
        listGameItem();
        inGame();
    }

}
