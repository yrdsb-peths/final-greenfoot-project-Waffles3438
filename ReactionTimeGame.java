import greenfoot.*;

public class ReactionTimeGame extends World {
    static public RedButton redbutton = null;
    
    public ReactionTimeGame() {
        super(600, 400, 1);
        if (redbutton == null) {
            redbutton = new RedButton();
            addObject(redbutton , getWidth() / 2, getHeight() / 2);
        }
        Back back = new Back();
        addObject(back, 30, 30);
    }
    
    public ReactionTimeGame(boolean e) {
        super(600, 400, 1);
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