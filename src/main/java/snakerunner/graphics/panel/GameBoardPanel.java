package snakerunner.graphics.panel;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameBoardPanel extends JPanel {

    private final JLabel label = new JLabel("Snake runner");

    public GameBoardPanel(){
        add(label, Color.WHITE);
        setBackground(Color.BLACK);
    }
}
