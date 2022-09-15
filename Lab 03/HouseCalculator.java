// Jared Campbell RJN259

import java.awt.Rectangle;

public class HouseCalculator
{
    public static void main(String[] args) {
        System.out.println("House Calculations begin now:");
        //double variables of house and feet below:
        double hHouse = 25.5; //Initialize hieght of house
        double wHouse = 65.2; //Initialize width of house
        double dHouse = 75.5; //Initialize depth of house
        //format print for labels
        System.out.println("The height of the house is "+ hHouse);
        System.out.println("The width of the house is " + wHouse);
        System.out.println("The depth of the house is " + dHouse);
        //Step 3 variables below:
        double hWin = 1.2; //Initialize hieght of windows
        double wWin = .75; //Initialize width of windows
        int numWin = 19; //Initialize number of windows
        //Step 4 variables below
        double hDoor = 1.75; //Initialize hieght of doors
        double wDoor = .95; //Initialize width of doors
        int numDoor = 5; //Initialize number of doors
        //window print:
        System.out.println("Height of Windows: " + hWin);
        System.out.println("Width of Windows: " + wWin);
        System.out.println("Number of windows: " + numWin);
        //door print:
        System.out.println("Height of Doors: " + hDoor);
        System.out.println("Width of Doors: " + wDoor);
        System.out.println("Number of Doors: " + numDoor);
       //Step 6 Below
        double surFloor = 0; //floor SA
        double surLeft = 0; //left wall SA
        double surRight = 0; //right wall SA
        double surFront = 0; //front wall SA
        double surBack = 0; //back wall SA
        double surRoof = 0; //roof/ceiling SA
        //Step 7
        double surWhole = 0; //surface area including windows
        double surSub = 0; //surface area excluding windows
        //Step 8 Strings Initialized below
        String sl = "good";
        String s2 = "bad";
        String s3 = "boring";
        String s4 = "exciting";
        String s5 = "big";
        String s6 = "small";
        String s7 = "Jared"; //name
        //Step 10 below;
        surFloor = wHouse * dHouse ; //calculates the area of surFloor    
        surRoof = surFloor; //Sets floor = to Roof
        surFront = hHouse * wHouse;//height * depth = side
        surBack = surFront; //surFront side = surBack
        surLeft = hHouse * dHouse;// surLeft wall = wHouse * dHouse
        surRight = surLeft;//sets surLeft = surRight
        //Print area for each surface
        System.out.println("The area of the Floor and Roof: " + surRoof);
        System.out.println("The area of the Front and Back: " + surBack);
        System.out.println("The area of the Right and Left: " + surRight);
        //Step 11 below:        
        surWhole = (surFloor * 2)+(surRight * 2)+(surFront * 2);
        //Calculates total surface area        
        //Step 12 below
        //comments the owner house with adjective and surface area of House
        System.out.println("This is Jared's house, it is "+ s3  +  surWhole);   
        
        //Step 13 below
        surWhole = (surWhole - (numWin * hWin * wWin));//Calculates total surface minus windows
        System.out.println("The total surface area including windows: " + surWhole);
        //Step 15 below:
        surWhole = (surWhole -(numDoor * hDoor * wDoor));
        //Calculates surface area minus windows and doors
        System.out.println("The surface area of the House minus doors and windows is: " + surWhole);
        //Prints new value of area 
        System.out.println("This is Jared's house it is very " + s5);
        //Print house owner and adjective
        //Steps 17 - 21 below
        int x = 7; //Initialize x value of rec
        int y = 13; //Initialize y value of rec
        int width = 5;//Initialize width of rec
        int height = 10;//Initialize height of rec
        var myrec = new Rectangle(x,y,width,height);//Creates rectangle using object
        System.out.println("Rectangle x: " + myrec.getX());//Prints X location
        System.out.println("Rectangle y: " + myrec.getY());//Prints Y location
        System.out.println("Rectangle width: " + myrec.getWidth());//Prints width location
        System.out.println("Rectangle height: " + myrec.getHeight());//Prints height location
        myrec.grow(4,8);//Initializes grow value
        System.out.println("The rectangle x and y after growth");
        System.out.println("Rectangle x location: " + myrec.getX());//Prints width location
        System.out.println("Rectangle y location: " + myrec.getY());//Prints height location
        myrec.translate(4,8);//Restores original values
        System.out.println("Rectangle translated to previous form");
        System.out.println("Rectangle x location: " + myrec.getX());//Prints width location
        System.out.println("Rectangle y location: " + myrec.getY());//Prints height location
        
    }
}
