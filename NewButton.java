import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class NewButton extends Actor
{
    private GreenfootImage normalImage;
    private GreenfootImage hoveredImage;

    /**
     * Constructor for the newButton class.
     */
    public NewButton()
    {
        // Load the normal and hovered images
        normalImage = new GreenfootImage("orangenew.png");
        hoveredImage = new GreenfootImage("whitenew.png");

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
    }
}
