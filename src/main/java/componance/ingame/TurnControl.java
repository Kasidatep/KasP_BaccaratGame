package componance.ingame;

import static componance.ingame.BankerItem.bankerCard;
import static componance.ingame.CardGenerator.*;
import static componance.ingame.PlayerItem.playerCard;
import static componance.ingame.encryption.CardEncryption.*;

public class TurnControl {
    private static int player_score;
    private static int banker_score;
    public static void inGame(){
        System.out.println("Turn Start E> ");
        drawPlayerCard();
        drawBankerCard();
        drawPlayerCard();
        drawBankerCard();
        checkTheThirdDrawOfPlayer();
        checkTheThirdDrawOfBanker();
        whoWin();
    }

    static int countPlayerCard = 0;
    public static void drawPlayerCard(){
        int card =  deckFaceToEncryptionValue(deck[playerCard[countPlayerCard]].face());
        deckToEncryption("P",deck[playerCard[countPlayerCard]].face(),deck[playerCard[countPlayerCard]].slut());
        player_score += card;
        player_score %= 10;
        countPlayerCard++;
        showScore();
    }



    static int countBankerCard = 0;
    public static void drawBankerCard(){
        int card =  deckFaceToEncryptionValue(deck[bankerCard[countBankerCard]].face());
        deckToEncryption("B",deck[bankerCard[countBankerCard]].face(),deck[bankerCard[countBankerCard]].slut());
        banker_score += card;
        banker_score %= 10;
        countBankerCard++;
        showScore();
    }

    public static void showScore(){
        System.out.println("P["+player_score+"] B["+banker_score+"]");
        spacialMessage(player_score,"PLAYER");
        spacialMessage(banker_score,"BANKER");
    }

    public static void checkTheThirdDrawOfPlayer(){
        if (player_score >= 0 && player_score <= 5) {
            drawPlayerCard();
        } else if (banker_score >= 8 && banker_score <= 9){
            System.out.println("PLAYER: OHH NO!!");
        } else {
            System.out.println("Player stand.");
        }
    }

    public static void checkTheThirdDrawOfBanker(){
        int theThirdPlayerCard = deck[playerCard[2]].face();
        if (banker_score <= 2 && player_score <= 7) {
            drawBankerCard();
        } else if (banker_score == 3 && theThirdPlayerCard != 8) {
            drawBankerCard();
        } else if (banker_score == 4 && theThirdPlayerCard <= 7 && theThirdPlayerCard >= 2) {
            drawBankerCard();
        } else if (banker_score == 5 && theThirdPlayerCard <= 7 && theThirdPlayerCard >= 4) {
            drawBankerCard();
        } else if (banker_score == 6 && theThirdPlayerCard <= 7 && theThirdPlayerCard >= 6) {
            drawBankerCard();
        } else if(banker_score >= 8 && banker_score <= 9){
            System.out.println("IT'S LUCKY, GOOD TURN");
        }else{
            System.out.println("Banker stand");
        }
    }

    public static void whoWin(){
        System.out.println("----------------------------");
        showScore();
        if(banker_score < player_score){
            System.out.println("PLAYER WIN!!");
        } else if(banker_score > player_score){
            System.out.println("BANKER WIN!!");
        } else {
            System.out.println("AMAZING!!, IT'S TIE");
        }
        System.out.println("----------------------------");
    }

    public static void spacialMessage(int score, String who){
        if(score == 8){
            System.out.println("WOW!,"+who+" POK 8");
        } else if(score == 9){
            System.out.println("WOW!,"+who+" POK 9");
        }
    }

    public static int getPlayer_score() {
        return player_score;
    }

    public static int getBanker_score() {
        return banker_score;
    }

    public static void scoreReset(){
        player_score = 0;
        banker_score = 0;
        countPlayerCard = 0;
        countBankerCard = 0;
    }
}
