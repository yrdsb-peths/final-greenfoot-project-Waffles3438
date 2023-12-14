import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedButton extends Actor
{
    private boolean isWaiting = false; // Start in the waiting state
    private int waitTime;
    private int test;
    private boolean now = false;
    private SimpleTimer timer = new SimpleTimer();
    private long elapsedTime;
    
    public RedButton() {
        super();
        resetTimer();
    }
    
    /**
     * Act - do whatever the RedButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        long test = 0;
        
        for(int i = 0; i < 5; i++)
        {
            if (isWaiting && timer.millisElapsed() >= waitTime) {
                int e = timer.millisElapsed();
                stopWaiting();
                long startTime = System.currentTimeMillis();
                if(now && Greenfoot.mouseClicked(this)) {
                    long endTime = System.currentTimeMillis();
                    long elapsedTime = endTime - startTime;
                    now = false;
                    setImage("red.png");
                }
            } else {
                if (Greenfoot.mouseClicked(this)){
                    resetTimer();
                }
            }
            test = test + elapsedTime;
            
        }
        test = test / 5;
        Results resultworld = new Results();
        Greenfoot.setWorld(resultworld);
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
        now = true;
    }

    private void changeImage() {
        // Change the image to the new image
        GreenfootImage newImage = new GreenfootImage("now.png");
        setImage(newImage);
    }
    
    public long getTime(){
        return test;
    }
}
