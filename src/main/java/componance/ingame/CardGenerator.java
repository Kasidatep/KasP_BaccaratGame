package componance.ingame;

import java.util.ArrayList;
import java.util.Collections;

public class CardGenerator {
    static int [] cardList = new int[6];
    public static Card [] deck = new Card[52];
    private static int count = 0;
    static int face;
    static int slut;

    public static void createCard(){
        for (int face = 0 ; face < 13 ; face++){
            for(int slut =0 ; slut < 4 ; slut++){
                deck[count++] = new Card(count,face,slut);
            }
        }
    }

    protected record Card(int count, int face, int slut) {
    }

    public static void cardRandom(){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <51; i ++) {
            numbers.add (i + 1);
        } Collections.shuffle (numbers);
        for (int j = 0; j < 6; j ++) {
            cardList[j] = numbers.get(j);
        }
    }

    public static void cardReset(){
        count = 0;
        face = 0;
        slut =0;
    }
}
