
/**
 * Write a description of class DigitPrinter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DigitPrinter
{
    int x;
    public DigitPrinter(int x){
            this.x = x;
    }
    public double getValue(){
        return this.x;
    }
    public void setValue(int x){
        this.x = x;
  }
    public void printDigits(){
        if (this.x >=10000000||this.x<= -10000000){
            System.out.println(8);
        }
        else if 
        (this.x >=1000000 || this.x<= -1000000){
            System.out.println(7);
        }
        else if
        (this.x >=100000 || this.x<= -100000){
            System.out.println(6);
        }
        else if (this.x>=10000 || this.x <=-10000){
            System.out.println(5);
        }
        else if (this.x >=1000 || this.x <= -1000){
            System.out.println(4);
        }
        else if (this.x >=100 || this.x <= -100){
            System.out.println(3);
           }
        else if (this.x >=10 || this.x <= -10){
            System.out.println(2);
           }
        else{System.out.println(1);
        
    }
}
}