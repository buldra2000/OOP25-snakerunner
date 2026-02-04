package snakerunner.model.impl;

import java.util.Set;

import snakerunner.commons.Point2D;
import snakerunner.model.Grid;
import snakerunner.model.Level;
public class LevelImpl implements Level{
    // GRANDEZZA LIVELLO
    private final Grid grid;
    private final Set<Point2D<Integer, Integer>> obstacles;

    public LevelImpl() {
        this.grid = new GridImpl(20, 20);
        this.obstacles = null;
    }

    @Override
    public Grid getGrid() {
        return grid;
    }

    @Override
    public Set<Point2D<Integer, Integer>> getObstacles() {
        return obstacles;
    }

    @Override
    public boolean IsBlocked(Point2D<Integer, Integer> position) {
        return !grid.isInsideGrid(position) || obstacles.contains(position);
    }
}