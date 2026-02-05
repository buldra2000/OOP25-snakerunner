package snakerunner.graphics;

import snakerunner.controller.Controller;

public interface MainFrame {

    void display();

    void showMenu();

    void showGame();

    void showOption();

    void pause();

    void setController(Controller controller);

    void startGameLoop(Runnable onTick);

    void stopGameLoop();

    void setSoundEnabled(boolean isEnable);
}
