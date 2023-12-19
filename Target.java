import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target extends Actor
{
    int count = 0;
    /**
     * Act - do whatever the Target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this) && count == 0) {
            // remove text1, text2 and aimtrainer
            removeLabelsAndAimTrainer();
        }
        
    }
    
        private void removeLabelsAndAimTrainer() {
        // Get a reference to the world
        World world = getWorld();

        // Remove aimtrainer
        Label aimtrainer = (Label) world.getObjects(Label.class).get(0);
        world.removeObject(aimtrainer);

        // Remove text1
        Label text1 = (Label) world.getObjects(Label.class).get(0);
        world.removeObject(text1);

        // Remove text2
        Label text2 = (Label) world.getObjects(Label.class).get(0);
        world.removeObject(text2);
        
        // make sure that it doesn't happen when button is pressed again
        count = 1;
    }
}