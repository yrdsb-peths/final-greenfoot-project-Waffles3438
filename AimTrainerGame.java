import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class AimTrainerGame extends World
{
    Label text1;
    Label text2;
    Label aimtrainer;
    Target target;
    Label count;
    /**
     * Constructor for objects of class AimTrainerGame.
     * 
     */
    public AimTrainerGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        // back button
        Back back = new Back();
        
        // aim trainer text and making it white
        aimtrainer = new Label("Aim Trainer", 60);
        Color fontColor = Color.WHITE;
        
        // some more information in white
        text1 = new Label("Hit 30 targets as quickly as possible", 30);
        
        // more information in white
        text2 = new Label("Click the target above to begin", 30);
        
        // create target
        target = new Target();
        
        // adding it to world
        addObject(aimtrainer, getWidth()/2, getHeight()/5);
        addObject(target, getWidth()/2, getHeight()/2 - 10);
        addObject(text1, getWidth()/2, getHeight()/5 * 4);
        addObject(text2, getWidth()/2, getHeight()/7 * 5);
        addObject(back, 30, 30);
    }
    
    /**
     * removes labels
     */
    public void removeLabels(){
        // removes texts
        removeObject(text2);
        removeObject(text1);
        removeObject(aimtrainer);
        
        // Amount of times clicked
        count = new Label(target.getCount(), 30);
        addObject(count, 575, 25);
    }
    
    /**
     * Creates a target
     */
    public void createTarget(){
        // creates a target at random location
        removeObject(target);
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(400);
        addObject(target, x, y);
    }
    
    /**
     * update count
     */
    public void updateCount(){
        count.setValue(target.getCount());
    }
    
    /**
     * remove target
     */
    public void removeTarget(){
        removeObject(target);
    }
    
    /**
     * Get target
     */
    public Target getTarget(){
        return target;
    }

    /**
     * test
     */
    public long test(){
        return Target.getTime();
    }
}
