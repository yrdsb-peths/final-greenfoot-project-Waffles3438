import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReactionGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReactionGame extends World
{

    /**
     * Constructor for objects of class ReactionGame.
     * 
     */
    
    private long lastAdded = System.currentTimeMillis();
    private int spawnInterval = Greenfoot.getRandomNumber(5000); // Set the initial spawn interval in milliseconds
    
    public ReactionGame() {    
        super(600, 400, 1);
        Notyet notyet = new Notyet();
        addObject(notyet, getWidth() / 2, getHeight() / 2);
        Back back = new Back();
        addObject(back, 25, 30);
    }
    
    public void act() {
        long currentTime = System.currentTimeMillis();
        if (currentTime >= lastAdded + spawnInterval) {
            Now now = new Now();
            addObject(now, getWidth() / 2, getHeight() / 2);
            lastAdded = currentTime;
            spawnInterval = Greenfoot.getRandomNumber(5000); // Update spawn interval
        }
    }
}
