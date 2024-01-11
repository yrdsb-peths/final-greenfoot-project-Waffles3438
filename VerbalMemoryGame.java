import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VerbalMemoryGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VerbalMemoryGame extends World
{
    private static boolean startgame = false;
    private String[] newWords;
    private String[] seenWords;
    private Start start;
    private static int test = 1;
    private SeenButton seenbutton;
    private NewButton newbutton;
    private Label text;
    private Label text2;
    
    /**
     * Constructor for objects of class VerbalMemoryGame.
     * 
     */
    public VerbalMemoryGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        startgame = false;
        
        // some actors that I need to show up
        Back back = new Back();
        start = new Start();
        seenbutton = new SeenButton();
        newbutton = new NewButton();
        text = new Label("Some words will be shown and if you", 30);
        text2 = new Label("have seen them press seen, otherwise, press new", 30);
        addObject(start, getWidth() / 2, getHeight() / 2 - 20);
        addObject(text, getWidth() / 2, getHeight() / 2 + 30);
        addObject(text2, getWidth() / 2, getHeight() / 2 + 60);
        addObject(back, 30, 30);
        
        // list of words that I will use
        String[] newWords = {"apple", "banana", "car", "dog", "elephant", "fish", "guitar", "house", "ice cream", "jacket", "kangaroo", "lemon", "moon", "nose", "orange", "pizza", "queen", "rainbow", "sun", "tree", "umbrella", "violin", "water", "xylophone", "yellow", "zebra", "book", "cat", "desk", "egg", "fire", "goose", "hat", "island", "jungle", "kite", "lion", "mango", "nest", "ocean", "pencil", "quilt", "river", "snake", "table", "unicorn", "volcano", "window", "yacht", "zeppelin", "atom", "butterfly", "cloud", "diamond", "feather", "giraffe", "helicopter", "internet", "jellyfish", "kayak", "leopard", "mushroom", "nutmeg", "ostrich", "peacock", "quicksilver", "rhinoceros", "sandwich", "telephone", "vampire", "waterfall", "yogurt", "zealous", "chicken", "word", "interesting", "why"};
        String[] seenWords = {};
    }
    
    public void act(){
        if(startgame == true){
            addObject(seenbutton, getWidth() / 2 - 75, getHeight() / 2 + 50);
            addObject(newbutton, getWidth() / 2 + 75, getHeight() / 2 + 50);
            removeObject(text);
            removeObject(text2);
        }
    }
    
    /**
     * Setter for startgame
     */
    public static void startgame(){
        startgame = true;
    }
}
