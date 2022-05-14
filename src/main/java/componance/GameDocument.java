package componance;

public class GameDocument {
    public static void gameDocument(){
        System.out.println("CARD GAME");
        System.out.println("A:1; \t 2:2; \t 3:3; \t 4:4; \t 5:5; \t 6:6; \t 7:7; \n" +
                "8:8; \t 9:9 ;\t 10:10; \t J:10; \t Q:10; \t K:10");
        System.out.println("\t");
        System.out.println("PLAYER RULE");
        System.out.println("Baccarat rules call for the Player to always go first. The Banker’s hand depends on the Player’s hand. Here are the rules:");
        System.out.println("\t If the Player’s hand is a total of 8 or 9 points, it’s a natural win and no additional cards will be drawn. The Player’s hand will stand.");
        System.out.println("\t The Player’s hand always stands on point totals of 6 or 7 as well.");
        System.out.println("\t When any total from 0 to 5, the Player draws a third card – unless the Banker has 8 or 9. In that case, the Banker wins, and there are no further cards drawn.");
        System.out.println("\t");
        System.out.println("BANKER RULE");
        System.out.println("When Banker’s first two cards total:");
        System.out.println("\t 0 – 1 – 2 : Bank draws unless Player shows a natural 8 or 9");
        System.out.println("\t 3 : Bank draws if Player’s third card is 0 – 1 – 2 – 3 – 4 – 5 – 6 – 7 or 9." +
                "Bank stands when Player’s third card is 8.");
        System.out.println("\t 4 : Bank draws if Player’s third card is 2 – 3 – 4 – 5 – 6 – 7." +
                "Bank stands when Player’s third card is 0 – 1 – 8 – 9.");
        System.out.println("\t 5 : Bank draws if Player’s third card is 4 – 5 – 6 – 7." +
                "Bank stands when Player’s third card is 0 – 1 – 2 – 3 – 8 – 9.");
        System.out.println("\t 6 : Bank draws if Player’s third card is 6 – 7." +
                "Bank stands when Player’s third card is 0 – 1 – 2 – 3 – 4 – 5 – 8 – 9.");
        System.out.println("\t 7 : Stands.");
        System.out.println("\t 8 – 9 : Natural Numbers – neither hand draws a third card.");

    }
}
