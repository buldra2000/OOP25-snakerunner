package snakerunner.model;

import java.util.List;

public interface GameModel {
    
    public void update();

    public boolean isGameOver();

    public void loadLevel(LevelData data);

    public void resetLevel();

    public Snake getSnake();

    //GETTER PER LA VIEW / DEBUG
    public List<Collectible> getCollectibles();

    public Level getLevel();

    
    //public Level nextLevel();

    //Adding obstacles
    public java.util.Set<snakerunner.commons.Point2D<Integer,Integer>> getObstacles();
    
    public boolean isLevelCompleted();

    public void addScore(int points);

    public int getScore();
    
    public void applySlowEffect();

    public int getSpeed();
}
