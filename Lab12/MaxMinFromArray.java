import java.util.Arrays;
import java.util.Random;
/**
 Jared Campbell
 RJN259
 
 */
public class MaxMinFromArray
{
int[] Array1D = new int[20];
int[][] Array2D = new int[10][10];    
    public MaxMinFromArray(){
    final int LENGTH = 20;
    Random r = new Random();
    for(int i = 0; i < LENGTH; i++){
        Array1D[i] = r.nextInt(100)+1;
    }
        for (int i = 0; i < Array2D.length;i++){
        for( int j = 0; j < Array2D[i].length; j++){
            Array2D[i][j]=r.nextInt(100)+1;
        }
    }
}
public void getMaxFromArray1D(){
    int currentSize = 0;
    int max = Array1D[0];
    for(int i = 1; i < 20; i++){
        if(Array1D[i] > max){
            max = Array1D[i];
        
        }
        System.out.print(" " +Array1D[i]+"\t");
    }
     System.out.println();
    System.out.println("The Max from the Array1D above is: "+(max));
}
public void getMinFromArray1D(){
    int min = Array1D[0];
    for(int i = 1; i < 20; i++){
        if(Array1D[i] < min){
            min = Array1D[i];
        }
        System.out.print(" " +Array1D[i]+"\t");
    }
    System.out.println();
    System.out.println("The Min from the Array1D above is: "+(min));
}
public void getMaxFromArray2D(){
    int max = Array2D[0][0];
    for(int i = 1; i < 10; i++){
        for(int j = 1; j<10; j++){
            if(Array2D[i][j] > max){
                max = Array2D[i][j];
            }
            System.out.print(" " +Array2D[i][j]+"\t");
        }
        System.out.println();
    }
    System.out.println("The Max in the 2D array above is: "+ (max));
}
public void getMinFromArray2D(){
    int min = Array2D[0][0];
    for(int i = 1; i < 10; i++){
        for(int j = 1; j<10; j++){
            if(Array2D[i][j] < min){
                min = Array2D[i][j];
            }
            System.out.print(" " +Array2D[i][j]+"\t");
        }
        System.out.println();
    }
    System.out.println("The Min in the 2D array above is: "+ (min));
}
//Using Enhanced Loop for 1D
public void get_MaxFromArray1D(){
    int max = Array1D[0];
    int x;
    for(int i : Array1D){
    x = i;
        if(x > max)
        {
            max = x;     
    }
}
System.out.println("The maximum value is from Array1D is: "+ max);
}
//Using Enhanced Loop for 1D
public void get_MinFromArray1D(){
    int min  = Array1D[0];
    int x;
    for(int i : Array1D){
        x = i;
        if(x < min){
            min = x;
        }
    }
    System.out.println("The minimum value from Array1D is: " + min);
}
//Using Enhanced Loop For 2D
public void get_MaxFromArray2D(){
    int max = Array2D[0][0];
    int x;
    for(int [] i : Array2D){
        for( int j : i){
            x = j;
            if(x > max){
                max = x;
            }
        }
    }
    System.out.println("The maximum value in Array2D is: "+ max);
}
//Using Enhanced Loop for 2D
public void get_MinFromArray2D(){
    int min = Array2D[0][0];
    int x;
    for(int [] i : Array2D){
        for( int j : i){
            x = j;
            if(x < min){
                min = x;
            }
        }
    }
    System.out.println("The minimum value in Array2D is: "+ min);
}
}