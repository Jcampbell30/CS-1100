//Jared Campbell
//RJN259
import javax.swing.JOptionPane;
 public class HelloPrinter
{
    public static void main(String[] args) {//begin main
        //the following line of code prints a message to the screen
        System.out.println("Hello People!!");
        System.out.println(1+2+3+4+5+6+7+8+9+10);
        System.out.println(1*2*3*4*5*6*7*8*9*10);
        System.out.println("*********       ****");
        System.out.println("    *           * "  );
        System.out.println("    *           * " );
        System.out.println(" *  *           * " );
        System.out.println("  **            ****");
        System.out.println("Sales Tax Rates");
        System.out.println("---------------");
        System.out.println("Alaska       9%");
        System.out.println("Georgia     10%");
        System.out.println("Alabama      6%");
        System.out.println("Tennessee    4%");
        System.out.println("California   5%");
        String name=JOptionPane.showInputDialog("What is your name?");
        System.out.println("hello " + name);
        
    } //end main
} 
