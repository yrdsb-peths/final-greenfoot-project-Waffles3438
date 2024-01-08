import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NumberMemory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberMemory extends Button
{
    /**
     * Act - do whatever the NumberMemory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            // Code to be executed when the button is clicked
            NumberMemoryGame memorygame = new NumberMemoryGame();
            Greenfoot.setWorld(memorygame);
        }
        super.act();
    }
}
