package snakerunner.graphics;

import snakerunner.controller.Controller;

public interface MainFrame {

    void display();

    void showMenu();

    void showGame();

    void showOption();

    void pause();

    void resume();

    void setController(Controller controller);

    void startGameLoop();

    void stopGameLoop();

    void setSoundEnabled(boolean isEnable);

    void won();

    void lose();
}
