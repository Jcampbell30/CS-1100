import java.util.Scanner;
/**
 * Write a description of class Mama here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mama
{
    public Mama() {
    }

    public static void main(String[] args) {
        String markia = "Markia";
        System.out.println("I say baby girl but you say " + markia);
        System.out.println(markia);
        
        Scanner in = new Scanner(System.in);
    
        System.out.println("Hey there what's your name?");
        String name = in.nextLine();
        
        System.out.println("How old are you "+ name);
        int age = in.nextInt();
        
        int NewAge = age + 1;
        
        System.out.println("What is your hourly pay in U.S. dollars " );
        
        double hourly = in.nextDouble();
        double NewHourly = hourly + 5.50;
        in.close();
        
        
        System.out.println("Hello " + name);
        System.out.println("On your next birthday you will be "  + NewAge);
        System.out.println("If you had a five dollar and fifty cent raise you would make " +  NewHourly);
        
        System.out.println("Markia is the most beautiful woman on the planet!!!!!!!!!!!");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  
    }

    @Override
    public String toString() {
        return "Mama []";
    }
}