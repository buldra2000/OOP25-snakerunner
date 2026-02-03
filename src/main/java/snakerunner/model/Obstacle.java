package snakerunner.model;

import java.util.HashSet;
import java.util.Set;

import snakerunner.commons.Point2D;

public class Obstacle extends Entity{
    
//Dimensions in grid
    private int width;
    private int height;

    //Obstacle's inital positions and dimensions
    public Obstacle(int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
 
    //Getter Widht
    public int getWidth(){
        return width;
    }

    //Getter Height
    public int getHeight(){
        return height;
    }

//We check if targetX is between x and x + width and targetY is between y and y + height
    public boolean isHit(int targetX, int targetY){
     return targetX>= this.x && targetX< this.x + this.width && //Checking if x is between the beginning and the end of the obstacle
            targetY>= this.y && targetY< this.y + this.height;//Checking if the y is between the beginning and the end of the obstacle
     

    }

    public Set<Point2D<Integer, Integer>> getOccupiedPositions(){
        Set<Point2D<Integer, Integer>> positions = new HashSet<>();
        for(int i = 0; i< width; i++){ //We check every cell
            for (int j= 0; j< height; j++){
                //adds a new "point" to the set for every cell that's occupied
                positions.add(new Point2D<Integer,Integer>(x + i, y+j));
            }
        }
        return positions;
    }


    //Predefined set of obstacles. This list is not dynamic for now.
    public static Set<Point2D<Integer, Integer>> generatePresetVerticalPipes() {
        Set<Point2D<Integer, Integer>> allPositions = new HashSet<>();

        //Obstacles. These are temporary obstacles. They may change
         
        Obstacle obs1 = new Obstacle(6, 3, 1, 10); //Vertical
        Obstacle obs2 = new Obstacle(10, 7, 1, 10); //Vertical
        Obstacle obs3 = new Obstacle(30, 10, 1, 10);//Vertical
        Obstacle obs4 = new Obstacle(50, 15, 1, 10);//Vertical
        Obstacle obs5 = new Obstacle(3, 15, 4, 1); //Horizontal

        
        //Position calculation
        allPositions.addAll(obs1.getOccupiedPositions());
        allPositions.addAll(obs2.getOccupiedPositions());
        allPositions.addAll(obs3.getOccupiedPositions());
        allPositions.addAll(obs4.getOccupiedPositions());
        allPositions.addAll(obs5.getOccupiedPositions());

        return allPositions;
    }

}
  

 