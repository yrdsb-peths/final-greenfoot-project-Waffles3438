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
    private static long totalTime;
    private int tests = 5;
    
    /**
     * Act - do whatever the Target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        AimTrainerGame world = (AimTrainerGame) getWorld();
        if (Greenfoot.mouseClicked(this) && count == 32) {
            // removes labels then creates the target
            world.removeLabels();
            world.createTarget();
            
            // starts the timer when target is clicked
            elapsedTime = 0;
            totalTime = 0;
            count = tests;
            world.updateCount();
            startTime = System.currentTimeMillis();
        }
        else if(Greenfoot.mouseClicked(this) && count > 0){
            // ends timer and creates a new target at a new location
            endTime = System.currentTimeMillis();
            world.createTarget();
            count--;
            world.updateCount();
            elapsedTime = endTime - startTime;
            totalTime = totalTime + elapsedTime;
            startTime = System.currentTimeMillis();
        }
        if(count == 0){
            // calculates the average and changes to AimResults
            world.removeTarget();
            totalTime = totalTime / tests;
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
    public static long getTime(){
        return totalTime;
    }
}