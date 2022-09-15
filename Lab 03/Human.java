
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Human extends PlayerPiece

{
    public void setMaxSpirit(int maxS)
    	{
        		//set maxSpirit to value received as a parameter,
        		// maxS
        		maxSpirit = maxS; //refers to maxSpirit instance var
    	}
    public void setCurrentSpirit(int currentS){
    	
        		//set maxSpirit to value received as a parameter        		// maxS
             currentSpirit = currentS; //refers to current Spirit instance var
    	}

    // instance variables - replace the example below with your own
    //creating private variables for Human class
    private int currentSpirit;
    private int maxSpirit;

    /**
     * Constructor for objects of class Human
     */
    public Human()
    
    { 
        // initialise instance variables
        // initializing variables
        currentSpirit = 50;
        maxSpirit = 50;
        
        
    
              

        
        }
   
    public int getCurrentSpirit(){
        return currentSpirit;
    }
    public int getMaxSpirit(){
        return maxSpirit;
    }}
     

    