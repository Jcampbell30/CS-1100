import java.util.Scanner;
/**
 * Write a description of class LoopTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopTester
{
    public static void main(String[] args){
            LoopsComputer loopy = new LoopsComputer();
            
            
            System.out.println("The even Sum between 0 and 100: ");
            loopy.computeEvenSum();
            
            System.out.println("The SquareSum between 2 and 100: ");
            loopy.computeSquareSum();
            System.out.println("The powers of 2^0 to 2^20: ");
            loopy.printPowers();
            System.out.println("The odd Sum: ");
            loopy.oddSum(3,5);
        
            InputAnalyzer inny = new InputAnalyzer();
            System.out.println("Enter values to determine smallest and largest, press anything but a number value to stop");
            inny.findSmallLarge();
            System.out.println("Enter values to determine even/odd #'s, press anything but a number value to stop");
            inny.countEvenOdd();
            System.out.println("Enter values to determine cumulative total, press anything but a number value to stop");
            inny.cumulativeTotal();
            System.out.println("Enter values to determine adjacent duplicate, press anything but a number value to stop");
            inny.findAdjacentDuplicate();
        
            System.out.println("Enter a String type here: ");
            Scanner in = new Scanner(System.in);
            StringManipulator StringCheese = new StringManipulator("Howdy");
            System.out.println("Enter a String now");
            Scanner s = new Scanner(System.in);
            if(s.hasNextLine()){
                StringCheese.line = (in.nextLine());
                
            }
            System.out.println("The Upper Case Letter(s) are: ");
            StringCheese.printUpper();
            System.out.println("Every other letter is: ");
            StringCheese.printEveryOther();
            System.out.println("The vowels are" );
            StringCheese.vowelsToUnderScore();
            System.out.println("The number of vowels is: ");
            StringCheese.printVowelCount();
            System.out.println("The vowel positions are: ");
            StringCheese.printVowelPositions();
        
    }
}
