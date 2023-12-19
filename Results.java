import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Results here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Results extends ReactionTimeGame
{
    private Label result;
    /**
     * Constructor for objects of class Results.
     * 
     */
    public Results() {
        super(true);
        Label result = new Label(getRedButton().getTime() + " ms", 60);
        Label text = new Label("Your average time is: ", 60);
        addObject(result, getWidth() / 2, getHeight() / 2 + 25);
        addObject(text, getWidth() / 2, getHeight() / 2 - 25);
    }
}
