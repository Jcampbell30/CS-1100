import java.util.Arrays;
//imports a java library containing the function Arrays.toString()
/**
 practice self check 7.2
 */
public class Primes
{
    public static void main(String [] args){
        //initializing array primes as the first 5 prime numbers
        int [] primes = {2,3,5,7,11};
        for(int i = 0; i < 2; i++){
             /**creating loop inside main method
             * loop replaces values with index elements
             */
            
            /** As long as i is less than 2 the loop will execute.
             * after one successful itteration i increases by 1.
             * index 4 - 0 assigns the index at 4 to the index at i
             * primes[i] in the first itteration is 0, the element at 0
             * is 2.
             * i increases to 1
             * the condition is checked to see if i is less than 2.
             * 4 - 1 = 3. primes[3] = primes[1];
             * the element at index 1 is now assigned to the value at
             * index 3. 7 now becomes 3.
             */
            
            primes[4 - i] = primes[i];
        }
        System.out.println(Arrays.toString(primes));
        //Expected output is {2,3,5,3,2}
        int[] values = new int[10];
        values[0] = 10;
        values[9] = 10;
        String[] words = new String[10];
        String[] st1 = {"Yes", "No"};
    }
}
