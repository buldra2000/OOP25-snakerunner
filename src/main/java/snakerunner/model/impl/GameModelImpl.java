package snakerunner.model.impl;

import java.util.List;

import snakerunner.model.Food;
import snakerunner.model.FoodEffect;
import snakerunner.model.GameModel;
import snakerunner.model.Level;
import snakerunner.model.Snake;

public class GameModelImpl implements GameModel {

    //Prova
    private static final FoodEffect FoodEffect = null;

    private Level currentLevel;
    private Snake snake;
    private List<Food> foods;
    //private LevelManager levelManager;

    public GameModelImpl() {
    }

    @Override
    public void update() {
        // Every game update logic goes here and updates the game state accordingly.
        
        //snake.move();
        //checkCollisions();
        
    }

    @Override
    public void checkCollisions() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isGameOver() {
        /*
        if (level.IsBlocked(snake.getHead())) {
            return true;
        } else {
            return false;
        }
        */
       return false;
    }


    @Override
    public void resetLevel() {
        //this.snake = new SnakeImpl();
        //this.food = new FoodImpl();
    }

    @Override
    public void loadLevel(Level level) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadLevel'");
    }

    @Override
    public void nextLevel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextLevel'");
    }

    @Override
    public void startTimer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'startTimer'");
    }

    @Override
    public void stopTimer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stopTimer'");
    }

    @Override
    public int getTimeLeft() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTimeLeft'");
    }
}