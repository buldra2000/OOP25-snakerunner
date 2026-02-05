package snakerunner.model;

import java.util.List;

public interface GameModel {
    
    void update();

    void checkCollisions();

    boolean isGameOver();

    void loadLevel(LevelData data);

    void resetLevel();

    Snake getSnake();

    //GETTER PER LA VIEW / DEBUG
    public List<Collectible> getCollectibles();

    Level getLevel();
}
