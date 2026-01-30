package snakerunner.model;

import java.awt.Rectangle; //Maybe we can use another method. Contains all of the classes for creating user interfaces and for painting graphics and images.

public class Obstacle extends Entity{
    
//Temporary dimensions
    private int width= 50;
    private int height= 50;

    //Obstacle's inital position
    public Obstacle(int x, int y){
        this.x=x;
        this.y=y;
    }
 
    //Obstacle generation
    public void generate(){

    }

//We check if the obstacle is hit by the snake
    public boolean isHit(int snakeX, int snakeY, int snakeWidth, int snakeHeight){
        //If obstacle's and snake's coordinates are the same then this means that there is a collision.
        //Probably it makes more sense to create rectangles instead of using exact coordinates.
 if (this.x==snakeX && this.y==snakeY){
    return true;
 }
//... else it's false
    return false;       

    
}
  
}
 