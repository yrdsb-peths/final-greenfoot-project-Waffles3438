import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SeenButton
 extends Actor
{
    private GreenfootImage normalImage;
    private GreenfootImage hoveredImage;

    /**
     * Constructor for the newButton class.
     */
    public SeenButton()
    {
        // Load the normal and hovered images
        normalImage = new GreenfootImage("orangeseen.png");
        hoveredImage = new GreenfootImage("whiteseen.png");

        // Set the initial image
        setImage(normalImage);
    }

    /**
     * Act - do whatever the newButton wants to do.
     */
    public void act()
    {
        // Check if the mouse is hovering over the actor
        if (Greenfoot.mouseMoved(this)) {
            // Change the image to the hovered state
            setImage(hoveredImage);
        }

        // Check if the mouse is not over the actor
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) {
            // Change the image back to the normal state
            setImage(normalImage);
        }

        // Add your other action code here.
    }
}
