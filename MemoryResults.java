import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MemoryResults here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MemoryResults extends NumberMemoryGame
{
    private Label result;
    /**
     * Constructor for objects of class MemoryResults.
     * 
     */
    public MemoryResults()
    {
        // Display the result label
        result = new Label("You memorized a maximum of " + NumberMemoryGame.getLevel() + " digits", 30);
        addObject(result, getWidth() / 2, getHeight() / 2);
        
        // Remove displayNum and textbox from the world
        removeDisplayNum();
        removeTextbox();
    }
}
