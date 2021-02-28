import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    private int score = 0;
    private int width = 600;
    private int height = 400;
    
    
    private ArrayList<food> foods = new ArrayList<food>();
    private int numFood = 3;
    
    private ArrayList<bomb> bombs = new ArrayList<bomb>();
    private int numBombs = 3;
    
    private Random r = new Random();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        spawnPlayer();
        spawnFood();
        spawnBombs();
    }
    public void act(){
        showText("score = " + score, 100, 20);   
    }
    private void spawnPlayer(){
        player p = new player();
        addObject(p, 50,50);
    }
    private void spawnFood(){
        for(int i = 0; i<numFood; i++){
            foods.add(new food());
        }
        for(int j = 0; j<foods.size(); j++){
            int x = r.nextInt(width-100)+100;
            int y = r.nextInt(height-100)+100;
            addObject(foods.get(j),x,y);
        }
    }
    private void spawnBombs(){
        for(int i = 0; i<numBombs; i++){
            bombs.add(new bomb());
        }
        for(int j = 0; j<bombs.size(); j++){
            int x = r.nextInt(width-100)+100;
            int y = r.nextInt(height-100)+100;
            addObject(bombs.get(j),x,y);
        }
    }
    public void scoreChange(int d){
        score += d;
    }
}
