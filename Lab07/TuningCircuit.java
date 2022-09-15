
/**
*Task04: Modified problem P4.25 from the Book.  
*Create a class called TuningCircuit. 
*You should have 3 instance variables that represent the frequency, Cmin, and Cmax.  
*Create a constructor that accepts values for all 3 of the instance variables.  
*Create two methods, getFMin() and getFMax()
Using the equations provided in the problem description from the book you can calculate these values. 
You do not need to understand the physics of this problem to solve it. 
Look at the problem closely, and see what values are known. 
One of the formulas will have a single variable that is unknown.
You can solve for the unknown variable, and then use that value in the other equations as needed.f
In your main method in your tester, prompt the user for values for the three instance variables, 
and create a new TuningCircuit object using the values entered by the user.
  
The original problem from the book is posted below. 
You should again print your solution (the results from your two methods) neatly using printf. 
 For your output capture to turn in use the typical values listed in the problem description below.

 */
public class TuningCircuit

{
    double Frequency;
    double Cmin;
    double Cmax;   
   
    public TuningCircuit(double Frequency, double Cmin, double Cmax){
        this.Cmin = Cmin;
        this.Frequency = Frequency;
        this.Cmax = Cmax;
    }
    
    public double getFmin(){
        double C = Math.sqrt(this.Cmin * this.Cmax);
        double L = (Math.pow(((2 * Math.PI)/this.Frequency)/C, (2)));
        return (2*Math.PI*Math.sqrt(L*this.Cmax));
        
    }
    public double getFmax(){
        double C = Math.sqrt(this.Cmin * this.Cmax);
        double L = (Math.pow(((2 * Math.PI)/this.Frequency)/C, (2)));
        return (2*Math.PI/Math.sqrt(L*this.Cmin));         
         
    }
}
