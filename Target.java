import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target extends Actor
{
    int count = 0;
    /**
     * Act - do whatever the Target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        AimTrainerGame world = (AimTrainerGame) getWorld();
        if (Greenfoot.mouseClicked(this) && count == 0) {
            world.removeLabels();
            count = 1;
        }
        else if(Greenfoot.mouseClicked(this) && count < 31){
            world.createTarget();
            count++;
        }
        
    }
}