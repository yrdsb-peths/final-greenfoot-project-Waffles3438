import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
            NumberMemoryGame memorygame = new NumberMemoryGame(true);
            Greenfoot.setWorld(memorygame);
        }
        super.act();
    }
}
