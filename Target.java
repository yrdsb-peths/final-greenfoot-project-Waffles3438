import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target extends Actor
{
    int count = 32;
    /**
     * Act - do whatever the Target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        AimTrainerGame world = (AimTrainerGame) getWorld();
        if (Greenfoot.mouseClicked(this) && count == 32) {
            world.removeLabels();
            world.createTarget();
            count = 31;
            world.updateCount();
        }
        else if(Greenfoot.mouseClicked(this) && count > 0){
            world.createTarget();
            count--;
            world.updateCount();
        }
        if(count == 0){
            world.removeTarget();
        }
    }
    
    /**
     * Getter for count
     */
    public int getCount(){
        return count;
    }
}