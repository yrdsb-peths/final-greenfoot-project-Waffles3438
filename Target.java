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
    private long startTime;
    private long endTime;
    private long elapsedTime;
    private long totalTime = 0;

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
            count = 30;
            world.updateCount();
            startTime = System.currentTimeMillis();
        }
        else if(Greenfoot.mouseClicked(this) && count > 0){
            endTime = System.currentTimeMillis();
            world.createTarget();
            count--;
            world.updateCount();
            elapsedTime = endTime - startTime;
            totalTime = totalTime + elapsedTime;
        }
        if(count == 0){
            world.removeTarget();
            totalTime = totalTime / 30;
            AimResults aimresults = new AimResults();
            Greenfoot.setWorld(aimresults);
        }
    }
    
    /**
     * Getter for count
     */
    public int getCount(){
        return count;
    }
    
    /**
     * Getter for totalTime
     */
    public long getTime(){
        return totalTime;
    }
}