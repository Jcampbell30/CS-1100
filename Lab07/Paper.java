
/**
 *Jared Campbell
 *Rjn259
 *Lab07
 */
public class Paper
{
    double height;
    double length;
    final double MilPerInch = 25.4;
    
    
    public Paper(double height, double length){
        this.height = height;
        this.length = length;
        
    }
    public double getWidthInMillimeters(){
        return Math.round(this.length/MilPerInch);
        
        
    }
    public double getHieghtInMillimeters(){
        return Math.round(this.height/MilPerInch);
    }
    public double getHieghtInInches(){
        return this.height;
    
    }
    public double getWidthInInches(){
        return this.length;
    }
}

