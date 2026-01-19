package snakerunner.controller.impl;

import snakerunner.controller.Controller;
import snakerunner.graphics.MainFrame;
import snakerunner.model.GameModel;

public class ControllerImpl implements Controller {
    private final MainFrame mainFrame;
    private final GameModel gameModel;

    public ControllerImpl(MainFrame mainFrame, GameModel gameModel) {
        this.mainFrame = mainFrame;
        this.gameModel = gameModel;
    }

    @Override
    public void init() {
        mainFrame.showMenu();
        mainFrame.display();
    }

    @Override
    public void start() {
        // Implementation to start the game loop
    }

    @Override
    public void update() {
        //un tick di gioco
        gameModel.update();
    }
}
