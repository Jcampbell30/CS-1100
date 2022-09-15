
/**
 * */
public class Lab10Tester
{
    public static void main(String[] args){
        TaxReturn single8 = new TaxReturn(4566, MaritalStatus.Single);
        //Test for single under $8000
        System.out.println("The tax for a single person is "+single8.getTax());
        //Printing result
        TaxReturn singleOver8 = new TaxReturn(13446, MaritalStatus.Single);
        //Test for single over $8000 but less than $32000
        System.out.println("The tax for a single person is "+singleOver8.getTax());
        //Printing result
        TaxReturn singleOver32 = new TaxReturn(49888, MaritalStatus.Single);
        //Test for single over $32000
        System.out.println("The tax for a single person is "+singleOver32.getTax());
        //Printing result
        TaxReturn married16 = new TaxReturn(14000, MaritalStatus.Married);
        //Test for married under $16000
        System.out.println("The tax for a married person is " + married16.getTax());
        //Printing result
        TaxReturn marriedOver16 = new TaxReturn(24555, MaritalStatus.Married);
        //Test for married over $16000 but less than $64000
        System.out.println("The tax for a married person is "+marriedOver16.getTax());
        //Printing result
        TaxReturn marriedOver64 = new TaxReturn(80000, MaritalStatus.Married);
        //Test for married over 64000
        System.out.println("The tax for a married person is " +marriedOver64.getTax());
        //Printing result
        
        
        
        AutomaticTeller ATM = new AutomaticTeller(1776);
        
        ATM.ValidateUser();
        
        CarSimulator minivan1 = new CarSimulator();
        System.out.println(minivan1.checkDoors(1,1,0,0,1,1,1,1,GearShift.PARK));
        System.out.println("Expected Both Doors Open");
        CarSimulator minivan2 = new CarSimulator();
        System.out.println(minivan2.checkDoors(0,0,0,0,0,0,0,0,GearShift.PARK));
        System.out.println("Expected Both Doors Closed");
        CarSimulator minivan3 = new CarSimulator();
        System.out.println(minivan3.checkDoors(1,0,1,0,0,0,1,0,GearShift.PARK));
        System.out.println("Expected Left Door Only");
        CarSimulator minivan4 = new CarSimulator();
        System.out.println(minivan4.checkDoors(0,1,1,0,0,0,0,0,GearShift.PARK));
        System.out.println("Expected Right Door Only");
        
        
        
        
        
        
        
        
        
                                                                                                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        
        
    
        
        
        
        
            
        
        
        
    }
}
