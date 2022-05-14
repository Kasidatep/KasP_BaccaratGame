package componance.ingame;

import static componance.ingame.CardGenerator.cardReset;
import static componance.ingame.TurnControl.scoreReset;

public class DeleteGameItem {
    public static void deleteItemGame(){
       cardReset();
       scoreReset();
    }
}
