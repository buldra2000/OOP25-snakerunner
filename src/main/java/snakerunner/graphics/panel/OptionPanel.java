package snakerunner.graphics.panel;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import snakerunner.audio.AudioPlayer;
import snakerunner.graphics.MainFrame;
import snakerunner.graphics.impl.BasePanelImpl;

public class OptionPanel extends BasePanelImpl {

    private static final long serialVersionUID = 1L;

    private static final String APPLY = "Apply";
    private static final String BACK = "Back";
    private static final String SOUND = "Sound On / Off";

    private final MainFrame mainFrame;

    private final JButton apply;
    private final JButton back;
    private final JCheckBox checkbox;
    private final JLabel label;

    public OptionPanel(final MainFrame mainFrame){
        super();
        this.mainFrame = mainFrame;
        checkbox = new JCheckBox();
        label = new JLabel(SOUND);
        setLayoutPanel();
        checkbox.setAlignmentX(CENTER_ALIGNMENT);
        initSoundPanel();
        add(Box.createVerticalGlue());
        apply = createButton(APPLY);
        back = createButton(BACK);
        add(apply);
        add(back);
        addActionListeners();
    }

    private void initSoundPanel(){
        final JPanel soundPanel = new JPanel();
        soundPanel.setLayout(new BoxLayout(soundPanel, BoxLayout.X_AXIS));
        soundPanel.setAlignmentX(CENTER_ALIGNMENT);
        soundPanel.setOpaque(false);
        soundPanel.add(label);
        soundPanel.add(checkbox);
        add(soundPanel);
    }

    @Override
    public void setLayoutPanel(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    @Override
    public void addActionListeners(){
        apply.addActionListener(e -> mainFrame.showMenu());
        back.addActionListener(e -> mainFrame.showMenu());
        checkbox.addActionListener(e -> {
            final boolean enable = checkbox.isSelected();
            AudioPlayer.setSoundEnabled(enable);
        });
    }
}