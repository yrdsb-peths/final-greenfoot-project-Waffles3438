import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AimResults here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AimResults extends AimTrainerGame
{
    private Label result;
    
    /**
     * Constructor for objects of class AimResults.
     * 
     */
    public AimResults()
    {
        removeLabels();
        removeTarget();
        removeObject(count);
        result = new Label(getTarget().getTime() + " ms", 60);
        Label text = new Label("Your average time is: ", 60);
        addObject(result, getWidth() / 2, getHeight() / 2 + 25);
        addObject(text, getWidth() / 2, getHeight() / 2 - 25);
    }
}
