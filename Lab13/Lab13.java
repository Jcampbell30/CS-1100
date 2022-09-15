import java.util.Random;
import java.util.Arrays;
/**
 *Jared Campbell
 *RJN259
 */
public class Lab13
{
    public static void main(String[] args)
{
      int[] primes = {2,3,5,7,11};
      Lab13 markia = new Lab13();
      System.out.println("Printing Rectangle with 3 rows and 4 columns");
      System.out.println();
      markia.printRectangle(3,4);
      System.out.println();
      System.out.println("Printing Primes array");
      System.out.println();
      markia.printArray(primes);
      System.out.println();
      System.out.println("Printing Random array");
      System.out.println();
      int[] myArray1 = markia.getRandomArray(10);
    
    markia.printArray(myArray1);
    System.out.println();
    markia.printEvens(myArray1);
    
}
   public void printRectangle(int rows, int columns){
       String s = "*";
       for(int i = 1; i <= rows; i++)
       {
           for(int j = 1; j <= columns; j++)
           {
              System.out.print((s));
           }
           System.out.println();
       }
}
public void printArray(int[] a)
{
     for(int i = 0; i < a.length; i++)
     {
         System.out.println(a[i]);
     }
}
public int[] getRandomArray(int size){
    int[] myArray = new int [size];
    Random r = new Random();
    for(int i = 0; i < myArray.length; i++)
    {
        myArray[i] = r.nextInt(100)+1; 
    }
    return myArray;
        }
public void printEvens(int[] a){
    int[] myArray1 = a;
    int count = 0;
    for(int i = 0; i < myArray1.length; i++){
        if(myArray1[i]  % 2 == 0){
            System.out.println(myArray1[i]);
            count++;
            
        }
    
        
    }
    System.out.println("printing even numbers of Random array: " + count);
}
    }
  


        

        
    

