package snakerunner.controller;

import snakerunner.graphics.MainFrame;
import snakerunner.model.GameModel;

//LinkedBlockingQueue -> thread safe
//Il controller non deve vedere Swing

public interface Controller {

    void init();

    /**
     * Starts the game loop.
     */
    void start();

    void pause();

    GameModel getModel();

<<<<<<< HEAD
    void updateGame();

    void setSoundEnable(boolean isEnable);

    void resume();

    //GamePanel
    void onPause();

    void onOption();

    void onResume();

    void onBackToMenu();
=======
    MainFrame getView();

    void updateGame();

    void setSoundEnable(boolean isEnable);

    void loadLevelFromFile(String filepath);
>>>>>>> main
}
