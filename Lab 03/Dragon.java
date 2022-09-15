
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon extends PlayerPiece{
    public void setMaxFire(int maxF)
        {
                //set Fire to value received as a parameter,
                // maxS
                maxFire = maxF; //refers to Fire instance var
        }
    public void setCurrentFire(int currentF){
        
                //set maxSpirit to value received as a parameter                // maxS
             currentFire = currentF; //refers to current Fire instance var
        }


    // instance variables - replace the example below with your own
    private int x;
    private int maxFire;
    private int currentFire;

    /**
     * Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise fire
        x = 0;
        currentFire = 50;
        maxFire = 50;
        
        
        
        
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
    public int getCurrentFire(){
        return currentFire;
    }
    public int getMaxFire(){
        return maxFire;
        
    }}
    
    
        
    
    