import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VerbalResults here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VerbalResults extends VerbalMemoryGame
{
    private Label scorecount;
    
    /**
     * Constructor for objects of class VerbalResults.
     * 
     */
    public VerbalResults()
    {
        super(false);
        
        // gets the score from VerbalMemoryGame and displays it.
        scorecount = new Label(VerbalMemoryGame.getScore() + " words", 50);
        addObject(scorecount, getWidth() / 2, getHeight() / 2);
        super.remove();
    }
}
