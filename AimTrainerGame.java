import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AimTrainerGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AimTrainerGame extends World
{

    /**
     * Constructor for objects of class AimTrainerGame.
     * 
     */
    public AimTrainerGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Back back = new Back();
        addObject(back, 30, 30);
    }
}
