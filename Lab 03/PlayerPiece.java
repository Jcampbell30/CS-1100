
/**
 * Write a description of class PlayerPiece here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayerPiece extends BoardPiece
{
    // instance variables - replace the example below with your own
    private int currentHealth = 100;
    private int maxHealth = 100;
    private int locx = 15;
    private int locy = 13;
    private int attackPower = 12;
    private int defensePower = 10;
      

    /**
     * Constructor for objects of class PlayerPiece
     */
    public PlayerPiece()
    {
        // initialise instance variables
        
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
        
        
        return 0;        
    }
    public int getMaxHealth(){//Using Accessor
        return maxHealth;
    }
    public int getCurrentHealth(){
        return currentHealth;
    }
    public int getLocx(){
        return locx;    
    }
    public int getLocy(){
        return locy;
                   
    }
    public int getAttackPower(){
        return attackPower;
    }
    public int getDefensePower(){
        return defensePower;
    }
    public void MoveUp(){//Declaring move variable
        
    }
    public void MoveDown(){
    }
    public void MoveRight(){
        
    }
    public void MoveLeft(){
        
    }
}