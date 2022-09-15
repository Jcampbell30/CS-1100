
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends PlayerPiece
{
    public void setMaxMagic(int maxM)
    	{
        		//set maxMagic
        		
        		maxMagic = maxM; 
    	}
    	public void setCurrentMagic(int currentM)
    	{
        		//set maxMagic
        		        	
        		currentMagic = currentM; 
    	}


    // instance variables - replace the example below with your own
    private int x;
    private int currentMagic;
    private int maxMagic;
    

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        // initialise instance variables
        x = 0;
        currentMagic = 50;
        maxMagic = 50;
        
    
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
    public int getCurrentMagic(){
        return currentMagic;
    
    }
    public int getMaxMagic(){
        return maxMagic;
    }
    
}
