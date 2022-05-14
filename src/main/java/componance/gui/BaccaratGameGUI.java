package componance.gui;

import javax.swing.*;
import java.awt.event.*;

import static componance.GameDocument.gameDocument;
import static componance.ingame.CardGenerator.cardRandom;
import static componance.ingame.GameControl.play;
import static componance.ingame.TurnControl.getPlayer_score;

public class BaccaratGameGUI {
    private JButton DOCUMENTButton;
    private JButton SHUFFIEButton;
    private JButton PLAYButton;
    private JButton EXITButton;
    private JLabel card;
    private JLabel PScore;
    private JPanel B;
    private JPanel A;
    private JLabel BScore;
    private JLabel whowin;


    public BaccaratGameGUI() {
        final int[] action = new int[1];

        do {
            PLAYButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    play();
                    action[0] = 1;
                    PScore.setText(getPlayer_score());
                    BScore.setText(getBanker_score());
                }
            });

            SHUFFIEButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cardRandom();
                    action[0] = 2;
                }
            });
            DOCUMENTButtonButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    gameDocument();
                    action[0] = 3;
                }
            });
            EXITButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    action[0] = 9;
                }
            });
        } while (action[0] != 9);


        whowin.addContainerListener(new ContainerAdapter() {
            @Override
            public void componentAdded(ContainerEvent e) {
                super.componentAdded(e);
            }
        });
    }
}
