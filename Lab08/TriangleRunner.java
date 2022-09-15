import java.util.Scanner;
/**
 * Write a description of class TriangleRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TriangleRunner
{
    public static void main(String[] args){
        //creating a new triangle object to run in main method
        Triangle tri1 = new Triangle(0,0,1,0,0,1);
        //calling all methods printf for cleaner read
        System.out.printf(("side1 is: %.2f %n"),   tri1.getSide1Length());
        System.out.printf(("side2 is: %.2f %n"),  tri1.getSide2Length());
        System.out.printf(("side3 is: %.2f %n"),  tri1.getSide3Length());
        System.out.printf(("angle1 is: %.2f %n"), tri1.getAngle1());
        System.out.printf(("angle2 is: %.2f %n"), tri1.getAngle2());
        System.out.printf(("angle3 is: %.2f %n"), tri1.getAngle3());
        System.out.printf(("area is: %.2f %n" ),  tri1.getArea());
        System.out.printf(("perimeter is: %.2f %n"), tri1.getPerimeter());
        //creating scanner for user to enter inputs of new triangle
        Scanner s = new Scanner(System.in);
        //prompting user
        System.out.println("Enter values for x1,y1,x2,y2,x3,y3 in the respective order: ");
        double x1 = (s.nextDouble());
        double y1 = (s.nextDouble());
        double x2 = (s.nextDouble());
        double y2 = (s.nextDouble());
        double x3 = (s.nextDouble());
        double y3 = (s.nextDouble());
        //creating new object based on user inputs
        Triangle tri2 = new Triangle(x1,y1,x2,y2,x3,y3);
        //calling methods on new triangle        
        System.out.printf(("side 1 is: %.2f %n"),tri2.getSide1Length());
        System.out.printf(("side 2 is: %.2f %n"),tri2.getSide2Length());
        System.out.printf(("side 3 is: %.2f %n"),tri2.getSide3Length());
        System.out.printf(("angle 1 is: %.2f %n"),tri2.getAngle1());
        System.out.printf(("angle 2 is: %.2f %n"),tri2.getAngle2());
        System.out.printf(("angle 3 is: %.2f %n"),tri2.getAngle3());
        System.out.printf(("the perimeter is: %.2f %n"),tri2.getPerimeter());
        System.out.printf(("the area is: %.2f %n"),tri2.getArea());
        
        
        
        
        
        
    
        
        
    
        
        
        
        
        
        
                
        
        
            
        }
    }
        
        
    

