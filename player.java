import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    private int speed = 5;
    public player() {
        setImage("images/bee.png");
    }
    
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(speed);
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
            move(speed);
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
            move(speed);

        }   
        if(Greenfoot.isKeyDown("up")){
            setRotation(270);
            move(speed);
        } 
        
    }    
    
}
