import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        scorecount = new Label("You got a score of: " + VerbalMemoryGame.getScore(), 50);
        addObject(scorecount, getWidth() / 2, getHeight() / 2);
        Label text = new Label("The average person can get a score of 30", 30);
        addObject(text, getWidth() / 2, getHeight() / 2 + 40);
        
        super.remove();
    }
}
