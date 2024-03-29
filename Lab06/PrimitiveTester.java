import java.util.Scanner;
/**
 * Write a description of class PrimitiveTester here.
Jared Campbell rjn259 Lab06
 */

public class PrimitiveTester {
    public static void main(String[] args) {
        //Step 1
        // Declaring primitive variables
        int primitive_type_int;
        byte primitive_type_byte;
        short primitive_type_short;
        long primitive_type_long;
        float primitive_type_float;
        double primitive_type_double;
        boolean primitive_type_boolean;
        char primitive_type_char;
        //initialize each variable with any appropriate value
        primitive_type_int = 50;
        primitive_type_byte = 2;
        primitive_type_short = 5;
        primitive_type_long = 10000;
        primitive_type_float = 54.5f;
        primitive_type_double = 43.4;
        primitive_type_boolean = true;
        primitive_type_char = 'B';

        //. Print out the name of each variable and its value 
        System.out.println("The int type = " + primitive_type_int );
        System.out.println("The byte type = " + primitive_type_byte);
        System.out.println("The short type = " + primitive_type_short);
        System.out.println("The long type = " + primitive_type_long);
        System.out.println("The float type = " + primitive_type_float);
        System.out.println("The double type = " + primitive_type_double);
        System.out.println("The boolean type = " + primitive_type_boolean);
        System.out.println("The char type = " + primitive_type_char);

        //Modify the value of each variable with an assignment statement

        primitive_type_boolean = false;
        primitive_type_char = 'C';
        primitive_type_double = 5.5;
        primitive_type_float = 60.1f;
        primitive_type_long = 20000;
        primitive_type_short = 10;
        primitive_type_byte = 1;
        primitive_type_int = 21;

        //print out the names of the variables and their new values 

        System.out.println("The int type = " + primitive_type_int );
        System.out.println("The byte type = " + primitive_type_byte);
        System.out.println("The short type = " + primitive_type_short);
        System.out.println("The long type = " + primitive_type_long);
        System.out.println("The float type = " + primitive_type_float);
        System.out.println("The double type = " + primitive_type_double);
        System.out.println("The boolean type = " + primitive_type_boolean);
        System.out.println("The char type = " + primitive_type_char);
        final int INTEGER_TYPE = 12;
        final byte BYTE_TYPE = 3;
        final short SHORT_TYPE = 11; 
        final long LONG_TYPE = 21211;
        final float FLOAT_TYPE = 32.1f;
        final double DOUBLE_TYPE = 5.6;
        final boolean BOOLEAN_TYPE = true;
        final char CHAR_TYPE = 'A';

        System.out.println("When you try to assign a value to a constant the result is: you cannot assign a value to final variable type");
        //Step 2
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 17;
        // 3 and 4 are added with sum 7
        // 7 is divided by 5 with quotient 1
        System.out.println((a + b)/ c);
        // 4 is divided by 5 with quotient 0
        // 3 is added to 0 with sum 3
        System.out.println(a + b / c);
        // 1 is being added to 3 with sum of 4     
        a++;

        System.out.println(a);
        // 1 is being subtracted from 4 with new value of a is 3
        a--;
        System.out.println(a);

        // 3 is being added to 1
        System.out.println(a + 1);
        // 4 is divided from 5 this prints remainder of 2
        System.out.println(d % c);
        // 17 is being divided by 5 this prints remainder 2
        System.out.println(d / c);
        // 17 is being divided by 5 prints value of 3
        System.out.println(d % b);
        // 17 is being divided by 4 and the remainder is 1
        System.out.println(d / b);
        // 17 is divided by 4 and the value is 4
        System.out.println(d + a / d + b);
        // 3 is being divided by 17
        // 17 is being added to value plus 17
        // value is 21
        System.out.println((d + a) / (d + b));
        //3 is being added to 17
        //4 is being added to 17
        //20 is being divided by 21 value of 0
        System.out.println(Math.sqrt(b));
        // square root of 4 is 2.0
        System.out.println(Math.pow(a, b));
        // prints value of 3 raised to 4th power
        System.out.println(Math.abs(-a));
        // prints value of absolute value of variable which is 3
        System.out.println(Math.max(a, b));
        // Prints the maximum of two numbers, value of 4
        //Step 3
        Scanner in = new Scanner(System.in);
        //creating new scanner object
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        //creating first prompt
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();
        //creating second prompt
        System.out.println("The minimum of the two: " + (Math.min(num1, num2)));
        //Step 4
        double milk = 5.5; // gallons
        double jarCapacity = 0.75; // gallons

        /*int completelyFilledJars = milk / jarCapacity; 
         * there is loss in this in this conversion because the
         * there are 2 different types of variables
         * so we must use the a conversion method and that creates an 
         * integer type.
         */
        int completelyFilledJars = (int) Math.round(milk / jarCapacity);
        System.out.println("Number of Filled Jars: " + completelyFilledJars);
        //Step 5
        //fix the code so that it has constants
        final double YARDS = 3.5;
        final double FEET = YARDS * 3;
        final double INCHES = FEET * 12;
        //correcting the code b
        //by adding spaces to make output more legible
        System.out.println(YARDS + " yards are " + FEET + " feet");
        System.out.println(YARDS + " yards are " + INCHES + " inches");
        //Step 6
        int x = 10;
        int y = -3;
        x = x + 1;
        System.out.println("The value of x = " + x);
        y++;
        y--;
        //This is the same as x = x -1, and x = x + 1, yet it shorter.
        System.out.println("The value of adding a y increment is: " + y++);
        System.out.println("The value of subtracting a y increment is: " + y--);

        //Step 7
        //Creating variables in order to calculate future value
        //pmt is the payment, rate is the compunding interest, n is num of payments
        double payment;
        double interest;
        double number;
        double annPMV;

        System.out.println("Enter Payment here: ");
        payment = in.nextDouble();
        System.out.println("Enter Interest here: ");
        interest = in.nextDouble();
        System.out.println("Enter Number of payments here; ");
        number = in.nextInt();

        annPMV = payment * ((((Math.pow(1 + interest, number - 1) - 1/ interest)) / Math.pow(1 + interest, number - 1) + 1/ interest));

        System.out.println(" The value of the annuity is :  " + String.format("%.2f",annPMV));

        //prints the value of the annuity

        //Step 8

        int age1 = 18;
        int age2 = 35;
        int age3 = 50;
        int age4 = 44;

        double averageAge = (age1 + age2 + age3 + age4) / 4;
        System.out.println("average age: " + averageAge);

        // the program is rounding down when the actual average is 36.75

        // correcting for an incorrect usage of primitive data type int
        //no more loss of precision

        double age1_corrected = 18;
        double age2_corrected = 35;
        double age3_corrected = 50;
        double age4_corrected = 44;
        averageAge = (age1_corrected + age2_corrected + age3_corrected + age4_corrected) / 4;
        System.out.println("average age: " + (int)Math.round(averageAge));

        //Step 9
        
        double probability = 8.70;
        int percentage = (int) (100.0 * probability);
        System.out.println(percentage);

        double probability_corrected = 8.70;
        double percentage_corrected = (100.0 * probability);
        System.out.println(Math.round(percentage_corrected));
        
        
        String inputString = "The quick brown fox jumps over the lazy dog";
        String character_1 = inputString.substring(0,1);//T
        String character_2 = inputString.substring(2,3);//e
        String character_3 = inputString.substring(22,23);//m
        String character_4 = inputString.substring(23,24);//p
        String character_5 = inputString.substring(21,22);//u
        String character_6 = inputString.substring(24,25);//s
        String character_7 = inputString.substring(25,26);//
        String character_8 = inputString.substring(16,17);//f
        String character_9 = inputString.substring(21,22);//u
        String character_10 = inputString.substring(42,43);//g
        String character_11 = inputString.substring(6,7);//i
        String character_12 = inputString.substring(31,32);//t
        String outputString = character_1 + character_2 + character_3 + character_4 + character_5 + character_6 + character_7 + 
        character_8 + character_9 + character_10 + character_11 + character_12;
        System.out.println(outputString);
        
      
      
        
    }

}

