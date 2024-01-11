import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class VerbalMemoryGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VerbalMemoryGame extends World
{
    private static boolean startgame = false;
    private String[] newWords = {"apple", "banana", "car", "dog", "elephant", "fish", "guitar", "house", "ice cream", "jacket", "kangaroo", "lemon", "moon", "nose", "orange", "pizza", "queen", "rainbow", "sun", "tree", "umbrella", "violin", "water", "xylophone", "yellow", "zebra", "book", "cat", "desk", "egg", "fire", "goose", "hat", "island", "jungle", "kite", "lion", "mango", "nest", "ocean", "pencil", "quilt", "river", "snake", "table", "unicorn", "volcano", "window", "yacht", "zeppelin", "atom", "butterfly", "cloud", "diamond", "feather", "giraffe", "helicopter", "internet", "jellyfish", "kayak", "leopard", "mushroom", "nutmeg", "ostrich", "peacock", "quicksilver", "rhinoceros", "sandwich", "telephone", "vampire", "waterfall", "yogurt", "zealous", "chicken", "word", "interesting", "why"};
    private ArrayList<String> seenWords;
    private Start start;
    private SeenButton seenbutton;
    private NewButton newbutton;
    private Label text;
    private Label text2;
    private int life = 3;
    private static int score = 0;
    private Label lives;
    private Label scorecount;
    private int rng;
    private Label randomword;
    
    /**
     * Constructor for objects of class VerbalMemoryGame.
     * 
     */
    public VerbalMemoryGame(boolean flag)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        if(flag)
            score = 0;
        startgame = false;
        
        // some actors that I need to show up
        Back back = new Back();
        start = new Start();
        seenbutton = new SeenButton();
        newbutton = new NewButton();
        lives = new Label("Lives: " + life, 30);
        scorecount = new Label("Score: " + score, 30);
        text = new Label("Some words will be shown and if you", 30);
        text2 = new Label("have seen them press seen, otherwise, press new", 30);
        randomword = new Label("", 50);
        
        // adding them to the world
        addObject(randomword, getWidth() / 2, getHeight() / 2 - 10);
        addObject(start, getWidth() / 2, getHeight() / 2 - 20);
        addObject(text, getWidth() / 2, getHeight() / 2 + 30);
        addObject(text2, getWidth() / 2, getHeight() / 2 + 60);
        addObject(back, 30, 30);
        
        // list of words that I will use
        seenWords = new ArrayList<>();
    }
    
    public void remove(){
        removeObject(text);
        removeObject(text2);
        removeObject(start);
    }
    
    public void act(){
        if(startgame == true){
            setup();
            rng = Greenfoot.getRandomNumber(newWords.length);
            randomword.setValue(newWords[rng]);
            if(Greenfoot.mouseClicked(newbutton) && !seenWords.contains(newWords[rng])){
                score++;
                scorecount.setValue("Score: " + score);
                seenWords.add(newWords[rng]);
            }
            else if(Greenfoot.mouseClicked(newbutton) && seenWords.contains(newWords[rng])){
                life--;
                lives.setValue("Lives: "+ life);
            }
            else if(Greenfoot.mouseClicked(seenbutton) && seenWords.contains(newWords[rng])){
                score++;
                scorecount.setValue("Score: " + score);
            }
            else if(Greenfoot.mouseClicked(seenbutton) && !seenWords.contains(newWords[rng])){
                life--;
                lives.setValue("Lives: "+ life);
            }
            
            if(life == 0){
                gameover();
            }
        }
    }
    
    /**
     * set startgame to true
     */
    public static void startgame(){
        startgame = true;
    }
    
    /**
     * Change worlds to results
     */
    private void gameover(){
        VerbalResults vr = new VerbalResults();
        Greenfoot.setWorld(vr);
    }
    
    /**
     * Getter for score
     */
    public static int getScore(){
        return score;
    }
    
    public void setup(){
        addObject(seenbutton, getWidth() / 2 - 75, getHeight() / 2 + 50);
        addObject(newbutton, getWidth() / 2 + 75, getHeight() / 2 + 50);
        removeObject(text);
        removeObject(text2);
        addObject(lives, getWidth() / 2 - 75, getHeight() / 2 + 100);
        addObject(scorecount, getWidth() / 2 + 75, getHeight() / 2 + 100);
    }
}
