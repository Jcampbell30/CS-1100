import java.util.Scanner;
/**
 * Jared Campbell
 * RJN259
 */
public class FibonacciTester
{    public static void main(String[] args){
    //main method creation of the scanner object and setting boundaries for user input
    Scanner in = new Scanner(System.in);
    int x = 0;
    while(true){
    System.out.println("Enter integer value");
    if(in.hasNextInt()){
        x = in.nextInt();
        break;
    }
    else
    {
         System.out.println("It is not an integer value, please try again");
         in.next();
         continue;
    }
   
}
Fibonacci fibo = new Fibonacci(x);
//creating new Fibonacci object
System.out.println("The Fibonacci number is : ");
//prompting user from scanner above
System.out.println(fibo.getFiboNumber());
//calling the method to get the Fibonacci number
System.out.println();
//making a space
MaxMinFromArray susie = new MaxMinFromArray();
//creating new array object
//Testing methods from enhanced loop and nested loops 
susie.getMaxFromArray1D();
System.out.println();
susie.getMinFromArray1D();
System.out.println();
susie.getMaxFromArray2D();
System.out.println();
susie.getMinFromArray2D();
System.out.println();
MaxMinFromArray molly = new MaxMinFromArray();

molly.get_MaxFromArray1D();
molly.get_MinFromArray1D();
molly.get_MaxFromArray2D();
molly.get_MinFromArray2D();












  
}
}