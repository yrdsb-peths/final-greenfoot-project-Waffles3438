import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Results extends ReactionTimeGame
{
    private Label result;
    /**
     * Constructor for objects of class Results.
     * 
     */
    public Results() {
        super(true);
        result = new Label(getRedButton().getTime() + " ms", 60);
        Label text = new Label("Your average time is: ", 60);
        addObject(result, getWidth() / 2, getHeight() / 2 + 25);
        addObject(text, getWidth() / 2, getHeight() / 2 - 25);
        Label text1 = new Label("The average person has a reaction time", 30);
        Label text2 = new Label("between 200-250 ms", 30);
        addObject(text1, getWidth() / 2, 320);
        addObject(text2, getWidth() / 2, 360);
    }
}
