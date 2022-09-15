/**
 * This is a class to test the PlayerPiece class
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerPieceTester
{
    public static void main(String[] args) {
      //create a PlayerPiece object
      //this is equivalent to right clicking
      //a class in BlueJ and creating an object
      PlayerPiece piece01 = new PlayerPiece();
      //by default, all instance vars 
      //in PlayerPiece are set to 0
     
     //actual results
      System.out.println("Current/Total HP = " + 
                    piece01.getCurrentHealth() + "/" + 
                    piece01.getMaxHealth());
    System.out.println("Add Health = " + piece01.getAddHealth() + "  " + piece01.getCurrentHealth());
    System.out.println("Moving Right = " + piece01.getLocX() + "  " + piece01.getMoveRight());
    System.out.println("Moving Left = " + piece01.getLocX() + "   " + piece01.getMoveLeft());
    System.out.println("Moving Up  = " + piece01.getLocY() + "   " + piece01.getMoveUp());
    System.out.println("Moving Down = " + piece01.getLocY() + "   " + piece01.getMoveDown());
    //Testing my methods 
            
            

    System.out.println("Attack Power = " + piece01.getAttackPower());
    System.out.println("Defense Power = " + piece01.getDefensePower());
    System.out.println("Location X = " + piece01.getLocX());
    System.out.println("Location Y = " + piece01.getLocY());
    System.out.println("Current Special Power = " + piece01.getCurrentSpecialPower());
    System.out.println("Max Special Power = " + piece01.getMaxSpecialPower());
    System.out.println("Piece name = " + piece01.getPieceName());
    System.out.println("Piece type = " + piece01.getPieceType());
    //we expect the values to be 0 initially because we have not set 
    //any other specific values in the PlayerPiece.java file
      System.out.println("Expected 0/0");   
      
      //Below this line you need to add tests 
      //first you will test your constructors.
      //test the  no argument constructor, and make sure
      //that the default values are set correctly (use method calls)
      //
      //next, test the constructor that has several arguments
      //use method calls again to test these values are set correctly
      //My expected output in steps 13-21
      System.out.println("Move Right = " + piece01.getMoveRight());
    System.out.println("Move Up = " + piece01.getMoveUp());
    System.out.println("Move Down = " + piece01.getMoveDown());
    System.out.println("Move Left = " + piece01.getMoveLeft());
    System.out.println("New position " + piece01.getLocX());
    System.out.println("New position " + piece01.getLocY());
    System.out.println("Get LOCXY = " + piece01.getLocXY());
    System.out.println("Deduct Health = " + piece01.getDeductHealth());
    System.out.println("Add Health  =   " + piece01.getAddHealth());
    
    }
}
