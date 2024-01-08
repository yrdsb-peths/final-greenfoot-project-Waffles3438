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
    private long test;
    private boolean now = false;
    private boolean tooEarly = false;
    private boolean done = false;
    private SimpleTimer timer = new SimpleTimer();
    private long nanos;
    private long startTime;
    private int count;
    
    public RedButton() {
        super();
        resetTimer();
    }
    
    /**
     * Act - do whatever the RedButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (done) {
            sleepFor(100);
            return;
        }
        
        // gets the average of the test
        if (count < 5) {
            long elapsedTime = 0;
            // random delay
            if (!tooEarly && isWaiting && timer.millisElapsed() >= waitTime) {
                int e = timer.millisElapsed();
                stopWaiting();
                //if(now && Greenfoot.mouseClicked(this)) {
                //}
            } else if (now && Greenfoot.mouseClicked(this)) {
                long endTime = System.currentTimeMillis();
                elapsedTime = endTime - startTime - waitTime;
                //System.out.println(elapsedTime);
                now = false;
                setImage("red.png");
                count++;
                resetTimer();
                test = test + elapsedTime;
            } else if (tooEarly) {
                if (Greenfoot.mouseClicked(this)) {
                    resetTimer();
                    setImage("red.png");
                    tooEarly = false;
                }
            } else {
                if (Greenfoot.mouseClicked(this)){
                    setImage("tooearly.png");
                    tooEarly = true;
                    now = false;
                }
            }
            
        } else if (!done) {
            test = test / 5;
            Results resultworld = new Results();
            getWorld().removeObject(this);
            Greenfoot.setWorld(resultworld);
            done = true;
        }
    }
    
    private void resetTimer() {
        timer.mark();
        waitTime = Greenfoot.getRandomNumber(3000) + 2000;
        isWaiting = true;
        startTime = System.currentTimeMillis();
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
