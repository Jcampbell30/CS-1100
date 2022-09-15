import java.util.Scanner;
/**
 * Jared Campbell
 * RJN259
 * Task 02
 */
public class InputAnalyzer
{
    public InputAnalyzer(){
        
    }
    void findSmallLarge(){
        System.out.println("Enter value here: ");
        Scanner in = new Scanner(System.in);
        int largest = 0;
        int smallest = 0;
        boolean finished = false;
        while(!finished){
            if (in.hasNextInt()){
                int input = in.nextInt();
                if(input > largest) largest = input;
                if(input < smallest) smallest = input;
            }else{
                finished = true;
            }
            }
        System.out.println("The largest one is: " + largest);
        System.out.println("The smallest one is: " + smallest);
        }
    void countEvenOdd(){
        System.out.println("Enter the value here: ");
        Scanner in = new Scanner(System.in);
        int num = 0;
        int evenNumber = 0;
        int oddNumber = 0;
        boolean finished = false;
        while(!finished){
            if(in.hasNextInt()){
                num = in.nextInt();
                if(num % 2 != 0){
                    System.out.println("odd number: " + num);
                    oddNumber++; 
                }
                else{
                    System.out.println("even number: " + num);
                    evenNumber++;
                }
            }
            else{
                System.out.println("The number of even numbers you have entered is: " + evenNumber);
                System.out.println("The number of odd numbers you have entered is: " + oddNumber);
                finished = true;
            }
        }
    
          }
    void cumulativeTotal(){
    int sum = 0;
    System.out.println("Enter Integer values to begin, enter a different type to stop");
    Scanner in = new Scanner(System.in);
    while(in.hasNextInt())
    {
            sum = sum + in.nextInt();
            System.out.println(sum);
    }
    while(!in.hasNextInt()){
        System.out.println("The program has stopped");
        break;
    }
        }
    void findAdjacentDuplicate()
    {
        System.out.println("Enter in a number now,");
        Scanner in = new Scanner(System.in);
        int input = 0;
        int duplicate = 0;
        while(in.hasNextInt()){
            int previous = input;
            input = in.nextInt();
            if( previous == input && previous != in.nextInt()){
                duplicate = previous;    
                System.out.println(duplicate);
                
            }
            else if(duplicate == input){
                System.out.println();
            }
            }
            while(!in.hasNextInt()){
            System.out.println("Program ended now" );
            break;
        }
        }
    }
    

    
