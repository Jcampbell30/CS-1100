import java.util.Scanner;
/**
 * Write a description of class aaf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class aaf
{
    boolean valid = true;
     int x = 0;
    int count = 0;
    int [] a = new int[10];
    String [] b = new String[1000];
    String catchPhrase = "Hello";
    String Food = "Pizza";
    
    
    public static void main(String[] args){  
    aaf buddy = new aaf();
    buddy.SetCatchPhrase("I love you");
    buddy.getCatchPhrase();
    aaf Markia = new aaf();
    Markia.SetCatchPhrase("Tee hee");
    Markia.getCatchPhrase();
    Markia.setFavoriteFood("TACO BELL");
    buddy.setFavoriteFood("Watermelon");
    buddy.getFavoriteFood();
    Markia.getFavoriteFood();
    Markia.fillArray();

    
}
public void SetCatchPhrase( String catchPhrase){
    this.catchPhrase = catchPhrase;
    }
public void getCatchPhrase(){
  System.out.println(catchPhrase);
}
public void setFavoriteFood(String Food){
    this.Food = Food;
}
public void getFavoriteFood(){
    System.out.println(Food);
}
public void fillArray(){
    for(int i = 0; i < a [9]; i+=2){
        a[0] = i;
        
    }
    
}
  
}
    
    

