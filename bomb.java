import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends Actor
{
    public bomb() {
        setImage("images/bomb.png");
    }
    
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkCollisions();
    }    
    private void checkCollisions(){
        Actor a = getOneIntersectingObject(player.class);
        MyWorld m = (MyWorld)getWorld();
        if(a!=null){
            getWorld().removeObject(this);
            Greenfoot.delay(5);
            m.scoreChange(-30);
        }
    }  
}
