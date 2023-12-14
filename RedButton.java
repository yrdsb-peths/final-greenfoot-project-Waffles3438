import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedButton extends Actor
{
    private boolean tooearly = false;
    private boolean isWaiting = false; // Start in the waiting state
    private int waitTime;
    private int test;
    private SimpleTimer timer = new SimpleTimer();
    
    public RedButton() {
        super();
        resetTimer();
        
    }
    
    /**
     * Act - do whatever the RedButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        //System.out.println("e" + timer.millisElapsed());
        if (isWaiting && timer.millisElapsed() >= waitTime) {
            int e = timer.millisElapsed();
            stopWaiting();
            //resetTimer();
        } else {
            if (Greenfoot.mouseClicked(this)){
            // Code to be executed when the button is clicked
                //System.out.println("sus");
                resetTimer();
            }
        }
    }
    
    private void resetTimer() {
        timer.mark();
        waitTime = Greenfoot.getRandomNumber(3000) + 2000;
        isWaiting = true;
    }
    
    private void stopWaiting() {
        // Change the state to not waiting
        isWaiting = false;

        // Change the image after waiting
        changeImage();
    }

    private void changeImage() {
        // Change the image to the new image
        GreenfootImage newImage = new GreenfootImage("now.png");
        setImage(newImage);
        
        //Temp
        //System.out.println("e" + timer.millisElapsed());
        try {
            //java.lang.Thread.sleep(5000l);
        } catch (Exception e) {}
    }

}
