    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MemoryResults extends NumberMemoryGame
{
    private Label result;
    /**
     * Constructor for objects of class MemoryResults.
     * 
     */
    public MemoryResults()
    {
        super(false);
        // Display the result label
        result = new Label("You memorized a maximum of " + super.getLevel() + " digits", 30);
        addObject(result, getWidth() / 2, 100);
        Label text = new Label("The average person can memorize 7 digits", 30);
        addObject(text, getWidth() / 2, 350);
        Label WhatYouTyped = new Label("You typed: " + super.getUserInput(), 30);
        Label ActualNum = new Label("The actual number is: " + super.num, 30);
        addObject(WhatYouTyped, getWidth() / 2, getHeight() / 2 - 20);
        addObject(ActualNum, getWidth() / 2, getHeight() / 2 + 20);
        
        // Remove displayNum and textbox from the world
        removeDisplayNum();
        removeTextbox();
        removeTexts();
    }
}
