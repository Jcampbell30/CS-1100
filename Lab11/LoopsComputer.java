import java.util.Scanner;
/**
 *Jared Campbell
 *Rjn259
 *Task 01
 */
public class LoopsComputer
{
public LoopsComputer(){
    
        
    }
void computeEvenSum(){
    double sum = 0;
    double a = 0;
    while( a <= 100){
        sum = sum + a;
        a = a + 2;
    }
    System.out.println(sum);
}
void computeSquareSum(){
    double sum = 0;
    double a = 0;
    while (a <=100){
        sum = sum + Math.pow(a, 2);
        a++;
    }
    System.out.println(sum);
}
void printPowers(){
    double power = 0;
    double sum = 0;
    while(power <=20){
        sum = Math.pow(2,power);
        System.out.println(sum);
        power++;     
    }
}
    void oddSum(int a, int b){
    int sum = 0;
        while(a <= b){
            if (a % 2 != 0){
                sum = sum + a;              
    }
    a++;
    }
    System.out.println(sum);
}
}