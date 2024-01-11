import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Start extends Actor
{
    private GreenfootImage normalImage;
    private GreenfootImage hoveredImage;

    /**
     * Constructor for the Start class.
     */
    public Start()
    {
        // Load the normal and hovered images
        normalImage = new GreenfootImage("Start.png");
        hoveredImage = new GreenfootImage("hovered.png");

        // Set the initial image
        setImage(normalImage);
    }

    /**
     * Act - do whatever the Start wants to do.
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

        // Check if the actor is clicked
        if (Greenfoot.mouseClicked(this)){
            // Code to be executed when the button is clicked
            VerbalMemoryGame.startgame();
            getWorld().removeObject(this);
        }
    }
}
