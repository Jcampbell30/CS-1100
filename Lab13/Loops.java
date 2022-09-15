
/**
 * Final Exam
 * CPSC 1100
 * Question 4
 * a) && b)
 */
public class Loops
{
    public static void main(String[] args)
    {
      double x = 7;
      double sum1 = 0;
      int sum = 0;
      int count = 0;
      while(x <=20)
      {
            sum1 = (Math.pow(x,2) + sum1);
            x++;
      }
        for(int i = 3; i <= 41; i++){
            if(i%2!=0){
                 sum = i + sum;
                 count++; 
            }
        }
        System.out.println("The sum of all squares from 7 to 20 is: " + sum1);
        System.out.println("The average of all odd numbers between 3 and 41 is: " + sum/count);
    }
}
