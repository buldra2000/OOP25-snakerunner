package snakerunner.model.impl;

import snakerunner.model.FoodEffect;
import snakerunner.model.Snake;

public class SpeedUpEffect implements FoodEffect {
    private final double speedIncrease;

    public SpeedUpEffect(double speedIncrease) {
        this.speedIncrease = speedIncrease;
    }

    @Override
    public void apply(Snake snake) {
        //snake.increaseSpeed(speedIncrease);
    }
    
}
