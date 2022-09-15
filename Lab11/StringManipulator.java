import java.util.Scanner;
/**
 *Jared Campbell
 *Task 03
 */
public class StringManipulator
{
public String line;
public String z;
public StringManipulator(String line)
{
    this.line = line;        
}
    void printUpper()
    {
        for(int i = 0; i < line.length(); i++)
        {
            if(Character.isUpperCase(line.charAt(i)))
            { 
                System.out.println(line.charAt(i));
            }
        }
}
void printEveryOther()
{
    for(int i = 0; i < line.length(); i+=2){
        System.out.println(line.charAt(i));
        
    }
}
void vowelsToUnderScore(){
    String vowel = line;
    for(int i= 0; i< line.length()-1; i++){
        char s = vowel.charAt(i);
        if(s == 'a' || s == 'A'||s== 'e' || s== 'E' || s=='i' || s== 'I' || s== 'o' ||s== 'O' ||s== 'u' || s=='U'){
            vowel = vowel.substring(0,i) + '_' + vowel.substring(i +1);
            
            
        }
        System.out.println(vowel);         
    }
}
void printVowelCount(){
    String vowel = line;
    int count = 0;
    for(int i = 0; i<line.length(); i++){
        char s = line.charAt(i);
        if(s == 'a' || s == 'A'||s== 'e' || s== 'E' || s=='i' || s== 'I' || s== 'o' ||s== 'O' ||s== 'u' || s=='U')
        {
            count++;
        }
    }
    System.out.println(count);
}
void printVowelPositions(){
    String vowel = line;
    int count = 0;
    for(int i = 0; i<line.length(); i++){
        char s = line.charAt(i);
        if(s == 'a' || s == 'A'||s== 'e' || s== 'E' || s=='i' || s== 'I' || s== 'o' ||s== 'O' ||s== 'u' || s=='U')
        {
            System.out.println(i);
        }    
    }
}
}