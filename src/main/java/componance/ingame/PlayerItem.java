package componance.ingame;

import static componance.ingame.CardGenerator.deck;

public class PlayerItem {
    static int[] playerCard = new int[3];

    public static void getListPlayerCard(){
        System.out.println("Player");
        System.out.println(" 1 " + deck[playerCard[0]]);
        System.out.println(" 2 " + deck[playerCard[1]]);
        System.out.println(" 3 " + deck[playerCard[2]]);
    }
}
