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
        Label aimtrainer = new Label("Aim Trainer", 60);
        Color fontColor = Color.WHITE;
        aimtrainer.setFillColor(fontColor);
        aimtrainer.setLineColor(fontColor);
        Label text1 = new Label("Hit 30 targets as quickly as possible", 30);
        text1.setFillColor(fontColor);
        text1.setLineColor(fontColor);
        Label text2 = new Label("Click the target above to begin", 30);
        text2.setFillColor(fontColor);
        text2.setLineColor(fontColor);
        Target target = new Target();
        addObject(aimtrainer, getWidth()/2, getHeight()/5);
        addObject(target, getWidth()/2, getHeight()/2 - 10);
        addObject(text1, getWidth()/2, getHeight()/5 * 4);
        addObject(text2, getWidth()/2, getHeight()/7 * 5);
        addObject(back, 30, 30);
    }
}
