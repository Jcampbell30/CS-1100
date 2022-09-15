
/**
 RJN259
 Jared Campbell 
 */
public class Lab09Tester
{
    public static void main(String[] args){
        //Task01
        ValueAnalyzer s = new ValueAnalyzer(4); 
        
        System.out.println("TASK ONE");
        System.out.println();
        
       
        //creating new valueAnalyzer s
        if (s.valueAnalyzer() == -1 ){
            System.out.println("negative");
        } else if (s.valueAnalyzer() == 1){
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
        //Testing s object at value 4             
        s.setValue(-4);
       
        
        //Testing s object at -4
        if (s.valueAnalyzer() == -1 ){
            System.out.println("negative");
        } else if (s.valueAnalyzer() == 1){
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
        //printing result        
        s.setValue(0);
        //Set new value
         if (s.valueAnalyzer() == -1 ){
            System.out.println("negative");
        } else if (s.valueAnalyzer() == 1){
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
        //Task02
        System.out.println();
        System.out.println("TASK TWO");
        System.out.println();
        DoubleAnalyzer test = new DoubleAnalyzer(1130000);
        //Getting the new value
        System.out.println("the doubleAnalyzer test value is: " + test.getValue());
        //Analyzing if/else
        test.AnalyzeDouble();
        
        
        //Setting new value
        test.setValue(-5);
         //Getting value
        System.out.println("the new value has been set to " + test.getValue());
         //Analyzing if/else
        test.AnalyzeDouble();
        
        //Task03
        System.out.println();
        System.out.println("TASK THREE");
        System.out.println();
        DigitPrinter fun  = new DigitPrinter(2);
        //set value
        fun.setValue(1);
        System.out.println("the new value is: " + fun.getValue());
        System.out.println("the new digit value below: " );
        fun.printDigits();
        //expected 1
        fun.setValue(-45);
        System.out.println("the new value is: " + fun.getValue());
        System.out.println("The new digit value below: ");
        fun.printDigits();
        //expected 2
        fun.setValue(-332);
        System.out.println("the new value is: " + fun.getValue());
        System.out.println("The new digit value below: ");
        fun.printDigits();
         //expected 3
        fun.setValue(4554);
        System.out.println("the new value is: " + fun.getValue());
        System.out.println("The new digit value below: ");
        fun.printDigits();
        //expected 4
        fun.setValue(-54544);
        System.out.println("the new value is: " + fun.getValue());
        System.out.println("The new digit value below: ");
        fun.printDigits();
        //expected 5
        fun.setValue(656000);
        System.out.println("the new value is: " + fun.getValue());
        System.out.println("The new digit value below: ");
        fun.printDigits();
        //expected 6
        fun.setValue(-1000000);
        System.out.println("the new value is: " + fun.getValue());
        System.out.println("The new digit value below: ");
        fun.printDigits();
        //expected 7
        fun.setValue(10000000);
        System.out.println("the new value is: " + fun.getValue());
        System.out.println("The new digit value below: ");
        fun.printDigits();
        //expected 8
        System.out.println();
        System.out.println("TASK FOUR");
        System.out.println();
        
        DigitalThermometer Temp = new DigitalThermometer(14);
        System.out.println("The Voltage has been set to: "+Temp.getVoltage());
        System.out.println("The temperature in celcius below: ");
        //expected 150;
        
        Temp.calculateTemp();
        Temp.setVoltage(21);
        System.out.println();
        System.out.println("The Voltage has been set to: "+Temp.getVoltage());
        System.out.println("The temperature in celcius below: ");
        //Should show error
        Temp.calculateTemp();
        
        
        
        
        
        
    }
}
