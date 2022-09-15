
/**
 * Jared Campbell
 * Lab08
 */
public class Triangle
{
    // instance variables - replace the example below with your own
    double x1;
    double x2;
    double x3;
    double y1;
    double y2;
    double y3;
    /**
     * Constructor for objects of class Triangle
     */
    public Triangle(double x1, double yl, double x2, double y2, double x3, double y3)
    {
        // initialise 
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        
        
    }
    public double getSide1Length(){
        //Calculating side1
        return Math.sqrt(Math.pow(x2 - x3 ,2)+ Math.pow(y2 - y3, 2));              
    }
    public double getSide2Length(){
        //calculating Side2
        return Math.sqrt((Math.pow(x1-x3,2)+Math.pow(y1-y3, 2)));
    }
    public double getSide3Length(){
        //calculating Side3
        return Math.sqrt((Math.pow(x1-x2,2)+Math.pow(y1-y2, 2)));
    }
    public double getAngle1(){
        //calculating angle1
        double side1 = getSide1Length();
        double side2 = getSide2Length();
        double side3 = getSide3Length();
        return Math.toDegrees(Math.acos((Math.pow(side2, 2)+ Math.pow(side3, 2)-Math.pow(side1, 2))/(2*side2*side3)));        
    }
    public double getAngle2(){
        //calculating angle2
        double side1 = getSide1Length();
        double side2 = getSide2Length();
        double side3 = getSide3Length();
        return Math.toDegrees(Math.acos((Math.pow(side3, 2) + Math.pow(side1, 2)-Math.pow(side2, 2))/(2*side3*side1)));
            }
    public double getAngle3(){
        //calculating angle 3
        double side1 = getSide1Length();
        double side2 = getSide2Length();
        double side3 = getSide3Length();
        return Math.toDegrees(Math.acos((Math.pow(side1, 2) + Math.pow(side2, 2)-Math.pow(side3, 2))/(2*side1*side2)));        
    }
    public double getPerimeter(){
        //calculating perimeter
        double side1 = getSide1Length();
        double side2 = getSide2Length();
        double side3 = getSide3Length();
        return side1+side2+side3;
            }
    public double getArea(){
        //calculating the Area using Heron's Formula
        double side1 = getSide1Length();
        double side2 = getSide2Length();
        double side3 = getSide3Length();
        double s = ((side1 +side2+side3)/2);
        return Math.sqrt(s*((s - side1)*(s -side2)*(s-side3)));                        
     }
    }
    

