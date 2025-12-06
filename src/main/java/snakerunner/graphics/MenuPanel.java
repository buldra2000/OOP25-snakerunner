package snakerunner.graphics;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.JButton;

public class MenuPanel extends BasePanel {

    private static final String LABEL = " Welcome to Snake Runner";
    private static final String START = "Start";
    private static final String OPTION = "Option";
    private static final String EXIT = "Exit";

    private final JButton start;
    private final JButton option;
    private final JButton exit;

    public MenuPanel(){
        super();
        start = new JButton(START);
        option = new JButton(OPTION);
        exit = new JButton(EXIT);

        createTitle(LABEL);
        
        start.setAlignmentX(Component.CENTER_ALIGNMENT);
        option.setAlignmentX(Component.CENTER_ALIGNMENT);
        exit.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(createTitle(LABEL));
        add(Box.createVerticalGlue());
        add(start);
        add(option);
        add(exit);
        add(Box.createVerticalGlue());
        
        getStartButton().addActionListener(e -> pressedStartbutton());
        getOptionButton().addActionListener(e -> pressedOptionbutton());
        getExitButton().addActionListener(e -> pressedExitbutton());
    }

    public JButton getStartButton() {
        return start;
    }

    public JButton getOptionButton() {
        return option;
    }

    public JButton getExitButton() {
        return exit;
    }

    public void pressedStartbutton(){
        System.out.println("Start button pressed");
    }

    public void pressedOptionbutton(){
        System.out.println("Option button pressed");
    }

    public void pressedExitbutton(){
        System.out.println("Exit button pressed");
        System.exit(0);
    }
}