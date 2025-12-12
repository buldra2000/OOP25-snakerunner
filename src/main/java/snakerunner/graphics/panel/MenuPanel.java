package snakerunner.graphics.panel;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import snakerunner.graphics.impl.BasePanelImpl;

public class MenuPanel extends BasePanelImpl {

    private static final String START = "Start";
    private static final String OPTION = "Option";
    private static final String EXIT = "Exit";

    private final JPanel menuPanel;
    private final JButton start;
    private final JButton option;
    private final JButton exit;

    public MenuPanel(){
        menuPanel = new JPanel();
        start = createButton(START);
        option = createButton(OPTION);
        exit = createButton(EXIT);
        menuPanel.add(Box.createVerticalGlue());
        
        addActionListeners();
    }

    private JButton getStartButton() {
        return start;
    }

    private JButton getTutorialButton() {
        return option;
    }

    private JButton getExitButton() {
        return exit;
    }

    public void addActionListeners(){
        getStartButton().addActionListener(null);/*TODO */
        getTutorialButton().addActionListener(null);/*TODO */
        getExitButton().addActionListener(e -> System.exit(0));
    }

    @Override
    public void setLayoutPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }
}