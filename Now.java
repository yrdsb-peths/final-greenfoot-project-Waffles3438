import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Now here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Now extends Actor
{
    private long startTime;
    private int time;
    /**
     * Act - do whatever the Now wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Now() {
        // Set the start time to the current time when the Now actor is created
        startTime = System.currentTimeMillis();
    }

    public void onClick() {
        // Calculate elapsed time when the Now actor is clicked
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - startTime;

        // Display the elapsed time in milliseconds
        time = (int) elapsedTime;
    }
    
    public void act(){
        if (Greenfoot.mouseClicked(this)) {
            onClick();
            Results result = new Results();
            Greenfoot.setWorld(result);
        }
    }
    
    public int getTime(){
        return time;
    }
}
