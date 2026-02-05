package snakerunner.controller;

import java.util.List;
import java.util.Set;
import snakerunner.commons.Point2D;
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

    /**
     * Show OptionPanel (Controller - View)
     */
    void onOption();

    /**
     * Pause Game (Model - Controller - View)
     */
    void pause();

    GameModel getModel();

    /**
     * Get obstacles from Model (Controller - Model)
     * @return
     */
    Set<Point2D<Integer, Integer>> getObstacles();

    /**
     * Get Collectibles from Model (Controller  Model)
     * @return
     */
    List<Point2D<Integer, Integer>> getCollectibles();

    void resume();

    MainFrame getView();

    void updateGame();

    void loadLevelFromFile(String filepath);

    void onBackMenu();

    void exit();
}
