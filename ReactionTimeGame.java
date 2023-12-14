import greenfoot.*;

public class ReactionTimeGame extends World {
    private RedButton redbutton;
    
    public ReactionTimeGame() {
        super(600, 400, 1);
        redbutton = new RedButton();
        addObject(redbutton , getWidth() / 2, getHeight() / 2);
        Back back = new Back();
        addObject(back, 30, 30);
    }
    
    /**
     * Gets redbutton
     */
    public RedButton getRedButton() {
        return redbutton;
    }
}