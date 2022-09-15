
/**
Jared Campbell
Rjn259
Lab07
 */
public class NumberCalculator
{
    double a;
    double b;
        public NumberCalculator(double a, double b){
        this.a = a;
        this.b = b;        
    }
    public double getSum(){
        return a + b;
        }
        public double getDifference(){
            return a - b;      
    }
    public double getProduct(){
        return a * b;
            }
    public double getAverage(){
        return (a + b)/2;
        
    }
    public double getDistance(){
        return  Math.abs(a-b);       
        
      }
    public double getMaximum(){
        return Math.max(a,b);
    }
    public double getMinimum(){
        return Math.min(a,b);
    }

        
    
    

    
    }
    

