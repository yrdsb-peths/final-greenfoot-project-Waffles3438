import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedButton extends Actor
{
    private boolean tooearly = false;
    /**
     * Act - do whatever the RedButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            // Code to be executed when the button is clicked
            setImage("tooearly.png");
            tooearly = true;
        }
    }
    
    public boolean getEarly(){
        return tooearly;
    }
}
