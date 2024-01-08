import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Button reaction = new Reaction();
        Button aimtrainer = new AimTrainer();
        Button numbermemory = new NumberMemory();
        Button verbalmemory = new Button();
        Label title = new Label("Human Benchmark", 45);
        Color fontColor = Color.WHITE;
        title.setFillColor(fontColor);
        title.setLineColor(fontColor);
        addObject(title, 300, 30);
        
        addObject(reaction, getWidth() / 4, getHeight() / 2 - 65);
        addObject(aimtrainer, getWidth() /4, getHeight() / 4 * 3 + 10);
        addObject(numbermemory, getWidth() /4 * 3, getHeight() / 2 - 65);
        
    }
}
