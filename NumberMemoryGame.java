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
    private int level = 1;
    private BigInteger userInput = BigInteger.ZERO;
    
    private static Random rng = new Random();
    private BigInteger num;
    
    /**
     * Constructor for objects of class NumberMemoryGame.
     * 
     */
    public NumberMemoryGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Back back = new Back();
        addObject(back, 30, 30);
    }
    
    public void act(){
        String input = Greenfoot.getKey();
        
        if(input != null){
            // Check if the pressed key is a number
            if(isNumeric(input)){
                userInput = userInput.multiply(BigInteger.TEN).add(new BigInteger(input));
                System.out.println(userInput);
            }
            // Check if the Enter key is pressed
            else if(input.equals("enter")){
                processUserInput();
            }
            // Check if the Backspace key is pressed
            else if(input.equals("backspace")){
                // Remove the last digit from userInput
                userInput = userInput.divide(BigInteger.TEN);
                System.out.println(userInput);
                
                nextLevel();
                System.out.println(num);
            }
            // Handle other cases if needed
        }
    }

    private void processUserInput() {
        // Process the userInput (add your code here)
        System.out.println("Processing user input: " + userInput);

        // Clear userInput for the next input
        userInput = BigInteger.ZERO;
    }

    // Utility method to check if a string is numeric
    private boolean isNumeric(String str) {
        return str.matches("\\d+"); // Matches one or more digits
    }
    
    private void nextLevel() {
        num = BigInteger.valueOf(rng.nextInt(9)).add(BigInteger.ONE);
        
        for (int i = 1; i < level; i++) {
            num = num.multiply(BigInteger.TEN).add(BigInteger.valueOf(rng.nextInt(10)));
        }
        level++;
    }
}
