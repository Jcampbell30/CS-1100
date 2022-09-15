import java.util.Scanner;
/**
 * Write a description of class tj here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tj
// tj scope
{    
     public static void main(String[] args){  
        //creating main method
        tj Cartman = new tj();
        //creating object called Cartman
        tj Jared = new tj();
        tj Markia = new tj();
        tj Taylor = new tj();
        
        
    
        Markia.getName();
        Markia.getAge();
        
        
        //calling the method getName
    }
    public void getName(){
        //creating method
        String name;
        //declaring name string variable called name
        System.out.println("Enter your name: ");
        //prompting the user
        Scanner in = new Scanner(System.in);
        //creating a scanner calling in
        name = in.next();
        //setting name to user input
        System.out.println("You're a real good person " + name);
        //printing out string message with String Concatenation
    }
    public void getAge(){
        int i;
        System.out.println("Enter your age");
        
        Scanner s = new Scanner(System.in);
        
        i = s.nextInt();
        
        System.out.println("Your age is " + i);

    }
}
