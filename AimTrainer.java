import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AimTrainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AimTrainer extends Button
{
    /**
     * Act - do whatever the AimTrainer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            // Code to be executed when the button is clicked
            AimTrainerGame aimgame = new AimTrainerGame();
            Greenfoot.setWorld(aimgame);
        }
        super.act();
    }
}
