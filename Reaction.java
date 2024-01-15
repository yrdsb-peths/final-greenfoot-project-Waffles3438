import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Reaction extends Button
{
    /**
     * Act - do whatever the Reaction wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        if (Greenfoot.mouseClicked(this)){
            // Code to be executed when the button is clicked
            //System.out.println("Button Clicked!");
            ReactionTimeGame.redbutton = null;
            ReactionTimeGame reactiongame = new ReactionTimeGame();
            Greenfoot.setWorld(reactiongame);
        }
        super.act();
    }
}
