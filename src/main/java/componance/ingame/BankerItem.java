package componance.ingame;

import static componance.ingame.CardGenerator.deck;

public class BankerItem {
    static int[] bankerCard = new int[3];

    public static void getListBankerCard(){
        System.out.println("Banker");
        System.out.println(" 1 " + deck[bankerCard[0]]);
        System.out.println(" 2 " + deck[bankerCard[1]]);
        System.out.println(" 3 " + deck[bankerCard[2]]);
    }
}
