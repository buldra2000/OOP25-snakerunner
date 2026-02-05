package snakerunner.graphics;

import snakerunner.controller.Controller;
import snakerunner.graphics.panel.GamePanel;
import snakerunner.graphics.panel.MenuPanel;
import snakerunner.graphics.panel.OptionPanel;

public interface MainFrame {

    void display();

    void showMenu();

    void showGame();

    void showOption();

    void pause();
    void setMenuPanel(MenuPanel menuPanel);

    void setController(Controller controller);
    
    void setGamePanel(GamePanel gamePanel);

    void startGameLoop(Runnable onTick);
    void setOptionPanel(OptionPanel optionPanel);

    void stopGameLoop();
    void won();

    void setSoundEnabled(boolean isEnable);
    void lose();
}
