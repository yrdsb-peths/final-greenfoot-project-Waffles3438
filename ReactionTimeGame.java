import greenfoot.*;

public class ReactionTimeGame extends World {
    private RedButton redbutton;
    private long startTime;
    
    public ReactionTimeGame() {
        super(600, 400, 1);
    }
    
    public void onClick() {
        // Calculate elapsed time when the Now actor is clicked
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - startTime;

        // Display the elapsed time in milliseconds
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
    }
    
    public void act() {
        for(int i = 0; i < 5; i++)
        {
            RedButton redbutton = new RedButton();
            addObject(redbutton , getWidth() / 2, getHeight() / 2);
            long startTime = System.currentTimeMillis();
            
            
        }
    }
}