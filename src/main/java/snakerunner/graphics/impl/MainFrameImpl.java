package snakerunner.graphics.impl;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import snakerunner.graphics.MainFrame;
import snakerunner.graphics.panel.GamePanel;

public class MainFrameImpl extends JFrame implements MainFrame {
    
    private static final String TITLE = "Snake Runner";
    private static final double PROPORTION = 0.5;

    private final GamePanel gamePanel;

    public MainFrameImpl(){
        super(TITLE);
        gamePanel = new GamePanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDimensionFrame();
    }

    @Override
    public void setDimensionFrame(){
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)(screensize.width * PROPORTION);
        int height = (int)(screensize.height * PROPORTION);
        setSize(width,height);
    }

    @Override
    public void display() {
        System.out.println("Mostro gamePanel");
        setContentPane(gamePanel);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}