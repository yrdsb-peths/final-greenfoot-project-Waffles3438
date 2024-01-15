import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AimResults extends AimTrainerGame
{
    private Label result;
    
    /**
     * Constructor for objects of class AimResults.
     * 
     */
    public AimResults()
    {
        // add some text to the screen that displays information
        removeLabels();
        removeTarget();
        removeObject(count);
        result = new Label("each click: " + getTarget().getTime() + " ms", 40);
        Label text = new Label("Your average time between", 40);
        Label text1 = new Label("The average time is 400ms", 40);
        addObject(result, getWidth() / 2, getHeight() / 2 + 10);
        addObject(text, getWidth() / 2, getHeight() / 2 - 25);
        addObject(text1, getWidth() / 2, getHeight() / 2 + 70);
    }
}
