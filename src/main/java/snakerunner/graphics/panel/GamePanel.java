package snakerunner.graphics.panel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import snakerunner.graphics.impl.BasePanelImpl;

public class GamePanel extends BasePanelImpl {

    private static final String PAUSE = "Pause";
    private static final String RESTART = "Restart";

    private final JPanel nPanel;
    private final JPanel sPanel;
    private final GameBoardPanel gameBoardPanel;
    private final JPanel ePanel;
    private final JPanel wPanel;
    private final JButton pause;
    private final JButton restart;
    private final JLabel timer;
    private final JLabel life;
    private final JLabel score;

    public GamePanel(){
        super();
        nPanel = new JPanel();
        sPanel = new JPanel();
        gameBoardPanel = new GameBoardPanel();
        ePanel = new JPanel();
        wPanel = new JPanel();
        life = createLabel("Lives remaining: 3");
        timer = createLabel("0:00");
        score = createLabel("Score : 0");

        setLayoutPanel();

        pause = createButton(PAUSE);
        restart = createButton(RESTART);

        nPanel.setOpaque(false);
        sPanel.setOpaque(false);
        ePanel.setOpaque(false);
        wPanel.setOpaque(false);

        add(nPanel, BorderLayout.NORTH);
        add(sPanel, BorderLayout.SOUTH);
        add(gameBoardPanel, BorderLayout.CENTER);
        add(ePanel, BorderLayout.EAST);
        add(wPanel, BorderLayout.WEST);

        nPanel.add(timer);
        ePanel.add(pause);
        ePanel.add(restart);
        wPanel.add(life);
        sPanel.add(score);

        addActionListeners();
    }

    public JButton getPause() {
        return pause;
    }

    public JButton getRestart() {
        return restart;
    }

    /*TODO */
    public void addActionListeners(){
        getPause().addActionListener(null); // e ->
        getRestart().addActionListener(null); // e ->
    }

    @Override
    public void setLayoutPanel() {
        setLayout(new BorderLayout());
    }
}