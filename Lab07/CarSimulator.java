
/**
 * Jared Campbell
 * Rjn259
 * Lab07
 * Task03: Modified problem E4.10 from the Book.  Create a class called CarSimulator. 
 * You will need three instance variables to store:
•The number of gallons of gas in the tank
•The fuel efficiency in miles per gallon
•The price of gas per gallon
Create the following methods:
 •getCostPer100Miles() – the cost to drive 100 miles
  •getDistance() – how far the car can go with the gas in the tank
In your main method for your tester class insert code to prompt the 
user to enter values for the instance variables described above.  
Then use the Scanner object created in task02 to read in these values. 
 You will then create a CarSimulator object using these values provided by the user. 
 Finally, test the methods you created for this task.  Use printf to limit the number of decimal places in your printouts.  
 You do not need to print expected values.
 For your input values use 25 gallons in the tank, fuel efficiency of 26.35 MPG, and $2.13 cost per gallon.


 */
public class CarSimulator

{
    int Gallons;
    double MilesPerGallon;
    double PricePerGallon;
    public CarSimulator(int g, double mpg, double ppg){
        this.MilesPerGallon = mpg;
        this.Gallons = g;
        this.PricePerGallon = ppg;      
    }
    public double getCostPer100Miles(){
        return (100/this.MilesPerGallon)*this.PricePerGallon;
        }
    public double getDistance(){
        return Math.round(this.Gallons*this.MilesPerGallon);   
    }
}
