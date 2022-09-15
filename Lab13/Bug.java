
/**
 * Jared Campbell
 * RJN259
 * Final Exam
 * Question 3 Short Answer
 */
public class Bug
{
    String name = "Bugg";
    int currentPosition = 0;
    boolean turn = true;
    int intP = 0;
    public static void main(String[] args){
        Bug Bugg = new Bug(34);
        Bugg.move();
        Bugg.turn();
        Bugg.turn();
        Bugg.move();
        Bugg.getPosition();
    }
    public Bug(int intP){
        this.intP = intP;
    }
    public void getPosition(){
        System.out.println("The current position is: " + intP);
    }
    public void move(){
        intP++;   
     }
    public void turn(){
        if(turn){
            System.out.println(name + "s is now facing Left");
            turn = false;
        }
            else{
            System.out.println(name + "s is now facing Right");
            turn = true;
        }
        }
        }
    
            
     
    
        

        
        
    

    
