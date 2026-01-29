package snakerunner.model;

public interface GameModel {
    
    void update();

    void checkCollisions();

    void startTimer();

    void stopTimer();

    int getTimeLeft();

    boolean isGameOver();

    void loadLevel(Level level);

    void resetLevel();

    void nextLevel();

    boolean hasWon();

    boolean hasLost();
}
