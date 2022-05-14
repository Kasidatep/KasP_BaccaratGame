package componance.ingame.encryption;

import componance.ingame.face;

public class CardEncryption {
    public static String deckFaceToEncryptionMessage(int onDeck){
        String f;
        switch(onDeck){
                case 0 -> f = face.a.getText();
                case 1 -> f = face.b.getText();
                case 2 -> f = face.c.getText();
                case 3 -> f = face.d.getText();
                case 4 -> f = face.e.getText();
                case 5 -> f = face.f.getText();
                case 6 -> f = face.g.getText();
                case 7 -> f = face.h.getText();
                case 8 -> f = face.i.getText();
                case 9 -> f = face.j.getText();
                case 10 -> f = face.k.getText();
                case 11 -> f = face.l.getText();
                case 12 -> f = face.m.getText();
                default -> f = "NOT A CARD";
            }
        return f;
    }

    public static int deckFaceToEncryptionValue(int onDeck){
        int f;
        switch(onDeck){
            case 0 -> f = face.a.getScore();
            case 1 -> f = face.b.getScore();
            case 2 -> f = face.c.getScore();
            case 3 -> f = face.d.getScore();
            case 4 -> f = face.e.getScore();
            case 5 -> f = face.f.getScore();
            case 6 -> f = face.g.getScore();
            case 7 -> f = face.h.getScore();
            case 8 -> f = face.i.getScore();
            case 9 -> f = face.j.getScore();
            case 10 -> f = face.k.getScore();
            case 11 -> f = face.l.getScore();
            case 12 -> f = face.m.getScore();
            default -> f = -1;
        }
        return f;
    }
    public static void deckFaceToEncryption(int onDeck){
        System.out.println("DISPLAY CARD : " + deckFaceToEncryptionMessage(onDeck) + " : " + deckFaceToEncryptionValue(onDeck));

    }
}
