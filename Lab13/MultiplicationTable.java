
/**
 * Jared Campbell Rjn259
 * Final Exam
 * Question 5 short answer
 * Multiplication Table
 */
public class MultiplicationTable
{
    public static void main(String [] args){
    int [][] tableArray2D = new int [15][16];
    for(int i  = 1; i <= 14; i++){
        for(int j = 1; j <=15; j++){
            tableArray2D[i][j] = j*i;
            System.out.print(" " +tableArray2D[i][j]+ "\t");
        }
        System.out.println();
    }
}
}
