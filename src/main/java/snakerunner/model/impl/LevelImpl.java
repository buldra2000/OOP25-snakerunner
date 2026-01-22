package snakerunner.model.impl;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8dc557d (Added new methods for the grid and the obstacles)
import java.util.Set;
import snakerunner.commons.Point2D;
import snakerunner.model.Grid;
=======
>>>>>>> ab5c8e9 (added the level implementation)
=======
import snakerunner.model.Grid;
>>>>>>> 954dfd7 (Added new function for the grid in level implementation)
import snakerunner.model.Level;

public class LevelImpl implements Level{
    // GRANDEZZA LIVELLO
<<<<<<< HEAD
<<<<<<< HEAD
    private final Grid grid;
    private final Set<Point2D<Integer, Integer>> obstacles;
<<<<<<< HEAD

    public LevelImpl(Grid grid, Set<Point2D<Integer, Integer>> obstacles) {
        this.grid = grid;
        this.obstacles = obstacles;
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
=======
    // private final int width;
    // private final int height;
=======
    private final Grid grid;
>>>>>>> 954dfd7 (Added new function for the grid in level implementation)
    private final int baseSpeed;
    private final int ItemCount;
    private final int levelDuration;
=======
>>>>>>> 8dc557d (Added new methods for the grid and the obstacles)

    public LevelImpl(Grid grid, Set<Point2D<Integer, Integer>> obstacles) {
        this.grid = grid;
<<<<<<< HEAD
        this.baseSpeed = baseSpeed;
        this.ItemCount = itemCount;
        this.levelDuration = levelDuration;
>>>>>>> ab5c8e9 (added the level implementation)
=======
        this.obstacles = obstacles;
>>>>>>> 8dc557d (Added new methods for the grid and the obstacles)
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
