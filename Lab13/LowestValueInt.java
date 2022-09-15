
/**
 * Jared Campbell
 * RJN259
 * Final Exam
 * Question 1 Short Answer
 */
public class LowestValueInt
{
    String s = "The lowest value is: ";
    int a = 0;
    int b = 0;
    int c = 0;
    public static void main(String[] args){
        LowestValueInt i = new LowestValueInt();
        System.out.println(i.GetMin(123,12,1));
    }
    public String GetMin(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        if( a < b && a<c){
                s = s + a;
            }
            else if(b <a && b < c){
                s = s + b;
            }
            else if( c < a&& c <b ){
                s = s+c;
            }
            else{
                s = ("For this program to work correctly, you need at least one different value for a,b,c");
            }
        return s;
        }
        }
    
    

