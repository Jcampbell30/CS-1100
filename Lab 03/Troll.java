
/**
 * Write a description of class Troll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Troll extends PlayerPiece


{    public void setMaxHate(int maxH)
        {
                //set maxSpirit to value received as a parameter,
                // maxS
                maxHate = maxH; //refers to maxSpirit instance var
        }
    public void setCurrentHate(int currentH){
        
                //set maxSpirit to value received as a parameter                // maxS
             currentHate = currentH; //refers to current Spirit instance var
        }
    // instance variables - replace the example below with your own
    private int x;
    private int currentHate;
    private int maxHate;
    

    /**
     * Constructor for objects of class Troll
     */
    public Troll()
    {
        // initialise instance variables
        x = 0;
        currentHate = 50;
        maxHate = 50;
        
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

  public int getCurrentHate(){
        return currentHate;
    }
    public int getMaxHate(){
        return maxHate;
    }}