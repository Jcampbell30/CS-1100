import java.util.Scanner;
/**
 * Jared Campbell
 * Rjn259
 *  
 */
public class Lab07Tester
{
    public static void main(String[] args){
        System.out.println("Tasks begin now");
        
        Paper paper01 = new Paper(8.2,5.3);
        
        System.out.printf("The paper Width in Inches: %.2f %n",paper01.getWidthInInches());
        System.out.printf("The paper Width in Millimeters: %.2f %n" , paper01.getWidthInMillimeters());
        System.out.printf("The paper Height in Inches: %.2f %n ", paper01.getHieghtInInches());
        System.out.printf("The paper Height in Millimeters: %.2f %n ", paper01.getHieghtInMillimeters());
        
        
    
    
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double a = (in.nextDouble());
        System.out.println("Enter number 2: ");
        double b = (in.nextDouble());
        
        NumberCalculator calc1 = new NumberCalculator(a,b);
        
        System.out.printf("The sum of the two numbers is: %.2f %n", calc1.getSum());
        System.out.printf("The difference of the two numbers is: %.2f %n",calc1.getDifference());
        System.out.printf("The product of the two numbers is: %.2f %n",calc1.getProduct());
        System.out.printf("The average of the two numbers is: %.2f %n",calc1.getAverage());
        System.out.printf("The distance of the two numbers is: %.2f %n",calc1.getDistance());
        System.out.printf("The max value of the two numbers is: %.2f %n",calc1.getMaximum());
        System.out.printf("The min value of the two numbers is: %.2f %n",calc1.getMinimum());
        
        System.out.println("Enter number of Gallons: ");
        int Gallons = (in.nextInt());
        
        System.out.println("Enter Miles Per Gallon: ");        
        double MilesPerGallon = (in.nextDouble());
        
        System.out.println("Enter the PricePerGallon: ");        
        double PricePerGallon = (in.nextDouble());
        
        CarSimulator car1 = new CarSimulator(Gallons,MilesPerGallon,PricePerGallon);
        
        System.out.printf("The cost to drive 100 miles is: %.2f %n", car1.getCostPer100Miles());
        System.out.println("The car can go this far with this amount of gas: "+ car1.getDistance());
    
        System.out.println("Enter Frequency here: " );
        double f = (in.nextDouble());
        System.out.println("Enter the Cmin here: " );
        double Cmin = (in.nextDouble());
        System.out.println("Enter Cmax here: " );
        double Cmax = (in.nextDouble());
        TuningCircuit cir1 = new TuningCircuit(f,Cmin,Cmax);
        
        System.out.printf("Fmin = %.2f %n ", cir1.getFmin());
        System.out.println("");
        System.out.printf("Fmax = %.2f %n ", cir1.getFmax());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
    
        
        
    }
}
