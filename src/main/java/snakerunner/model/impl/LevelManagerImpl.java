package snakerunner.model.impl;

import java.util.List;
import snakerunner.model.Level;
import snakerunner.model.LevelManager;

public class LevelManagerImpl implements LevelManager {
    private final List<Level> levels;
    private int currentIndex;

    public LevelManagerImpl(List<Level> levels) {
        this.levels = levels;
        this.currentIndex = 0;
    }

    @Override
    public Level getCurrentLevel() {
        return levels.get(currentIndex);
    }

    @Override
    public Level nextLevel() {
        return levels.get(++currentIndex);
    }
    
}
