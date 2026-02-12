package snakerunner.test.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import snakerunner.commons.Point2D;
import snakerunner.model.Direction;
import snakerunner.model.Snake;

class SnakeTest {

    @Test
    void mySnakeTest() {
        //check if the snake spawns in the right position

        final Point2D<Integer, Integer> startPos = new Point2D<>(10, 10);
        final Snake testSnake = new Snake(startPos);

        //check if head  spawns ar 10 10
        assertEquals(10, testSnake.getHead().getX());
        assertEquals(10, testSnake.getHead().getY());

        //the snake should be long 5 
        final int size = testSnake.getFullBody().size();
        assertEquals(5, size);
    }

    @Test
    void movementTest() {
        final Point2D<Integer, Integer> p = new Point2D<>(5, 5);
        final Snake s = new Snake(p);
        //it should become 6 cuz it goes right by default
        s.move();

        assertEquals(6, s.getHead().getX());
        assertEquals(5, s.getHead().getY());

        //i try to make it go up 
        s.setDirection(Direction.UP);
        s.move();

        //X stays 6, Y should be 4
        assertEquals(6, s.getHead().getX());
        assertEquals(4, s.getHead().getY());
    }

    @Test
    void testWrongTurn() {
        final Snake s = new Snake(new Point2D<>(5, 5));

        //it should not be possible for the snake to go left 
        //if it's going right
        s.setDirection(Direction.LEFT);

        //check if it's still going right
        final Direction current = s.getCurrentDirection();
        assertEquals(Direction.RIGHT, current);
    }
}

