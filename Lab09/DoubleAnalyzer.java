
/**
 *Jared Campbell
 *Rjn259
 */
public class DoubleAnalyzer

{
   double a;
  public DoubleAnalyzer(double a){
    this.a=a;
  }
 public void setValue(double a){
       this.a = a;
       
   }
   public double getValue(){
       return a;
 }
   public void AnalyzeDouble(){
       if (this.a == 0)
       {System.out.println("Zero");
   }
   else if (this.a > 0)
   {System.out.println("Positive");
    }
    else{System.out.println("Negative");
        
    
        
    }
    if (this.a > 1000000){
        System.out.println("Large");
    }
    if (this.a < 1){
        System.out.println("Small");
    }
}
}