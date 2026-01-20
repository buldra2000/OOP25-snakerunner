package snakerunner.model;

public interface GameModel {
    
    public void update();

    public void checkCollisions();

<<<<<<< HEAD
    public void startTimer();

    public void stopTimer();

    public int getTimeLeft();

=======
>>>>>>> c57c0f0 (added method for load a level and reset a level)
    public boolean isGameOver();

    public void loadLevel(Level level);

    public void resetLevel();
<<<<<<< HEAD

    public void nextLevel();
=======
>>>>>>> c57c0f0 (added method for load a level and reset a level)
}
