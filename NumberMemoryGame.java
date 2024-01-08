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
    
    /**
     * Constructor for objects of class NumberMemoryGame.
     * 
     */
    public NumberMemoryGame()
    {    
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        level = 1;
        Back back = new Back();
        addObject(back, 30, 30);
        
        // Initialize the displayNum Label
        displayNum = new Label("", 60);  // Initialize with an empty string
        addObject(displayNum, getWidth() / 2, getHeight() / 2 - 40); // Centered on the screen
        
        // displaying the textbox
        textbox = new Label("", 60);
        addObject(textbox, getWidth() / 2, getHeight() / 2 + 40);
        
        // Call nextLevel after initializing displayNum
        nextLevel();
    }
    
    public void act(){
        String input = Greenfoot.getKey();
        
        if(input != null){
            // Check if the pressed key is a number
            if(isNumeric(input)){
                userInput = userInput.multiply(BigInteger.TEN).add(new BigInteger(input));
            }
            // Check if the Enter key is pressed
            else if(input.equals("enter")){
                if(!userInput.equals(num)){
                    MemoryResults world = new MemoryResults();
                    Greenfoot.setWorld(world);
                }

                processUserInput();
                nextLevel();
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
}
