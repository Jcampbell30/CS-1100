import java.util.Scanner;
/**
 * 
 * 
 */
public class AutomaticTeller{
    
    
    int PIN;
   public AutomaticTeller(int PIN){
        this.PIN = PIN;
    }
    public void ValidateUser(){
         Scanner in = new Scanner(System.in);
         int attempts = 3;
         int pin;
         System.out.println("Enter PIN now");
         pin = in.nextInt();

         if  (pin == this.PIN){
            System.out.println("Your PIN is correct");
            
        }
        else{
                attempts --;
    
        System.out.println("Your PIN is incorrect!" + attempts + "attempt(s) left");
        System.out.println();
        System.out.print("Please Enter PIN: ");
        pin = in.nextInt();
            if  (pin == this.PIN){
            System.out.println("Your PIN is correct");
        }
        else{
                attempts --;
    
        System.out.println("Your PIN is incorrect!" + attempts + "attempt(s) left");
        System.out.println();
        System.out.print("Please Enter PIN: ");
        pin = in.nextInt();
            if(pin == this.PIN)
    {
         System.out.println("Your PIN is correct");
    }
    else
    {
       attempts--;
       System.out.println("Your card is blocked");

          
         }
        }
            
            }
            
        
      
         }
        }