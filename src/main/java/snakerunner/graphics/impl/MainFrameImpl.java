package snakerunner.graphics.impl;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.Timer;

import snakerunner.controller.Controller;
import snakerunner.graphics.MainFrame;
import snakerunner.graphics.panel.GamePanel;
import snakerunner.graphics.panel.MenuPanel;
import snakerunner.graphics.panel.OptionPanel;

public class MainFrameImpl extends JFrame implements MainFrame {

    private static final long serialVersionUID = 1L;
    private static final String TITLE = "Snake Runner";
    private static final double PROPORTION = 0.5;
    private Controller controller;
    private Timer timer;
    private MenuPanel menuPanel;
    private GamePanel gamePanel;
    private OptionPanel optionPanel;

    public MainFrameImpl() {
        super(TITLE);
        //setIcon();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDimensionFrame();
    }

    @Override
    public void display() {
        setVisible(true);
    }
    /*
    private void setIcon(){
        URL iconURL = getClass().getResource("/icon.png");
        System.out.println("Icon URL: " + iconURL);
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
    }
    */

    private void setDimensionFrame(){
        final Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        final int width = (int)(screensize.width * PROPORTION);
        final int height = (int)(screensize.height * PROPORTION);
        setSize(width,height);
    }

    @Override
    public void showMenu() {
        setContentPane(menuPanel);
        revalidate();
        repaint();
    }

    @Override
    public void showGame() {
        setContentPane(gamePanel);
        revalidate();
        repaint();

        controller.start();
    }

    @Override
    public void pause(){
        controller.pause();
    }

    @Override
    public void showOption() {
        setContentPane(optionPanel);
        revalidate();
        repaint();
    }

    
    @Override
    public void setMenuPanel(MenuPanel menuPanel) {
        this.menuPanel = menuPanel;
    }

    @Override
    public void setController(final Controller controller) {
        this.controller = controller;
    }

    @Override
    public void startGameLoop(final Runnable onTick) {
        timer = new Timer(200, e -> onTick.run()); 
        //gamePanel.updateTimer(getTimeLeft());
        //gamePanel.updateTimer(/*getTimeLeft()*/);
        timer.start();
    }

    @Override
    public void stopGameLoop() {
    if (timer != null) {
            timer.stop();
        }
    }

    @Override
    public void setSoundEnabled(final boolean isEnable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSoundEnabled'");
    }

    @Override
    public void setGamePanel(GamePanel gamePanel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setGamePanel'");
    }

    @Override
    public void setOptionPanel(OptionPanel optionPanel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setOptionPanel'");
    }

    @Override
    public void won() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'won'");
    }

    @Override
    public void lose() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lose'");
    }
}