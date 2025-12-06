package snakerunner.graphics;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Tutti i pannelli, invece di estendere JPanel, estendono BasePanel
//In questo modo definisco delle caratteristiche comuni per i pannelli
//Ricordati di aggiungere il background, i font e tutte le cose che possono avere in comune.
public abstract class BasePanel extends JPanel {

    protected final Color defaultBackground = new Color(100,238,100);
    protected final Font arial = new Font("Arial", Font.BOLD, 32);

    public BasePanel(){
        super();
        setBackground(defaultBackground);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    protected JLabel createTitle(String text){
        JLabel title = new JLabel(text);
        title.setFont(arial);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        return title;
    }
    
}
