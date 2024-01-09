import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.math.BigInteger;
import java.util.Random;

/**
 * Write a description of class NumberMemoryGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberMemoryGame extends World
{
    private static int level = 1;
    private BigInteger userInput = BigInteger.ZERO;
    private Label displayNum;
    private static Random rng = new Random();
    private BigInteger num;
    private Label textbox;
    private SimpleTimer timer = new SimpleTimer();
    private int waittime = 5000;
    private boolean game;
    private long starttime;
    private long endtime;
    private long elapsedtime;
    
    /**
     * Constructor for objects of class NumberMemoryGame.
     * 
     */
    public NumberMemoryGame(boolean flag)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        if(flag)
            level = 1;
        Back back = new Back();
        addObject(back, 30, 30);
        game = true;
        resetTimer();
        
        // Initialize the displayNum Label
        displayNum = new Label("", 60);  // Initialize with an empty string
        addObject(displayNum, getWidth() / 2, getHeight() / 2 - 40); // Centered on the screen
        
        // displaying the textbox
        textbox = new Label("", 60);
        addObject(textbox, getWidth() / 2, getHeight() / 2 + 40);
        
        if (flag)
            nextLevel();
    }
    
    public void act(){
        String input = Greenfoot.getKey();
        endtime = System.currentTimeMillis();
        elapsedtime = endtime - starttime;
        //System.out.println(elapsedtime);
        if(elapsedtime >= 5000){
            removeObject(displayNum);
        }
        
        if(input != null && elapsedtime >= 5000){
            // Check if the pressed key is a number
            if(isNumeric(input)){
                userInput = userInput.multiply(BigInteger.TEN).add(new BigInteger(input));
            }
            // Check if the Enter key is pressed
            else if(input.equals("enter")){
                if(!userInput.equals(num)){
                    level -= 2;
                    MemoryResults world = new MemoryResults();
                    Greenfoot.setWorld(world);
                    return;
                }

                processUserInput();
                nextLevel();
                resetTimer();
                addObject(displayNum, getWidth() / 2, getHeight() / 2 - 40);
            }
            // Check if the Backspace key is pressed
            else if(input.equals("backspace")){
                // Remove the last digit from userInput
                userInput = userInput.divide(BigInteger.TEN);
            }
            
            // update label
            textbox.setValue(userInput.toString());
            if(userInput == BigInteger.ZERO){
                textbox.setValue("");
            }
        }
    }

    private void processUserInput() {
        // Clear userInput for the next input
        userInput = BigInteger.ZERO;
    }

    // Utility method to check if a string is numeric
    private boolean isNumeric(String str) {
        return str.matches("\\d+"); // Matches one or more digits
    }
    
    /**
     * Generates a random number and adds one to the level
     */
    private void nextLevel() {
        num = BigInteger.valueOf(rng.nextInt(9)).add(BigInteger.ONE);
        
        // for ever new level add another digit
        for (int i = 1; i < level; i++) {
            num = num.multiply(BigInteger.TEN).add(BigInteger.valueOf(rng.nextInt(10)));
        }
        
        // increase level and update label
        level++;
        displayNum.setValue(num.toString());
    }
    
    /**
     * Getter for level
     */
    public static int getLevel(){
        return level;
    }
    
    /**
     * Remove displayNum from the world
     */
    public void removeDisplayNum() {
        removeObject(displayNum);
    }

    /**
     * Remove textbox from the world
     */
    public void removeTextbox() {
        removeObject(textbox);
    }
    
    /**
     * Resets timer
     */
    private void resetTimer() {
        timer.mark();
        starttime = System.currentTimeMillis();
    }
}
