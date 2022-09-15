
/**
 * Write a description of class Dwarf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dwarf extends PlayerPiece
{public void setMaxStrength(int maxSt)
    	{
        		//set maxStrenght
        		// maxSt
        		maxStrength = maxSt; 
    	}
    	public void setCurrentStrength(int currentSt)
    	{
        		//set currentStrength,
        	
        		currentStrength = currentSt;
        		
    	}


    // instance variables - replace the example below with your own
    private int x;
    private int maxStrength;
    private int currentStrength;

    /**
     * Constructor for objects of class Dwarf
     */
    public Dwarf()
    {
        // initialise instance variables
        x = 0;
        maxStrength = 50;
        currentStrength = 50;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    public int getCurrentStrength(){
        return currentStrength;
    }
    public int getMaxStrength(){
        return maxStrength;
    
    }
}
