import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class food extends Actor
{
    public food() {
        setImage("images/plum.png");
    }
    
    /**
     * Act - do whatever the food wants to do. This method is called whenever
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
            m.scoreChange(10);
        }
    }
}
