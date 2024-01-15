import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class VerbalMemory extends Button
{
    /**
     * Act - do whatever the VerbalMemry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            // Code to be executed when the button is clicked
            VerbalMemoryGame verbalmemory = new VerbalMemoryGame(true);
            Greenfoot.setWorld(verbalmemory);
        }
        super.act();
    }
}
