
/**


 */
public class CarSimulator
{  
    public CarSimulator(){
        
    }
    public String checkDoors(int leftDashSwitch, int rightDashSwitch, int childLock, int masterUnlock, int leftInside, int
    rightInside, int leftOutSide, int rightOutside, GearShift gear){
        boolean leftOpen = false;
        boolean rightOpen = false;
        String S;
        if((leftDashSwitch == 1|| leftOutSide == 1 ||(leftInside == 1 && childLock == 0)&& 
        masterUnlock == 
                         
        0 && gear == GearShift.PARK))
        {
            leftOpen = true;
        }
         if(rightDashSwitch == 1|| rightOutside == 1 ||(rightInside == 1 && childLock == 
        0)&& masterUnlock == 0 && gear == GearShift.PARK)
        {
            rightOpen = true;
        }
        if( rightOpen && leftOpen )
        {
            S = "Both Doors Open";;
        }
        else if(rightOpen)
        {
            S = "Right Door Only";
        }
        else if(leftOpen)
        {
            S = "Left Door Only";
        }
     
        else 
        {
            S = "Both Doors Locked";
        }
        return S;
    }
}
