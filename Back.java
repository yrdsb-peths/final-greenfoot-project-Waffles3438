import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Actor
{
    public Back(){
        GreenfootImage img = getImage();
        img.scale(50, 50);
        img.mirrorHorizontally();
        setImage(img);
    }
    
    
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        if (Greenfoot.mouseClicked(this)) {
            // Code to be executed when the button is clicked
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
