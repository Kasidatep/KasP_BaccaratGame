package componance.ingame;

import static componance.ingame.BankerItem.bankerCard;
import static componance.ingame.CardGenerator.cardList;
import static componance.ingame.CardGenerator.deck;
import static componance.ingame.PlayerItem.playerCard;

public class GameCard {
    static boolean isPlayerTurn = true;
    static int countCardOnBoard = 0;
    public static void baccaratGame(){
        for (int i = 0 ; i < 6 ; i ++){
            int j = i/2;
            if (isPlayerTurn == true){
                playerCard[j] = cardList[i];
                countCardOnBoard++;
                System.out.print(playerCard[j]+"P:");
                System.out.print(deck[playerCard[j]].face() + " / ");
                isPlayerTurn = false;
            } else {
                bankerCard[j] = cardList[i];
                countCardOnBoard++;
                System.out.print(bankerCard[j]+"B:");
                System.out.print(deck[bankerCard[j]].face() + " / ");
                isPlayerTurn = true;
            }
        }
        System.out.println("List card item successfully");
    }
}
