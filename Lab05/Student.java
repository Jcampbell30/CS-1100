
/**
 * Jared Campbell
 * RJN259
 * Lab05

 */
public class Student
{
    // instance variables - replace the example below with your own
    private int x;
    private String name;
    private double TotalScore;

    private int NumQuiz;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        x = 0;
        name = "name";
        TotalScore = 0;
        NumQuiz = 0;
        
        
        
    }
    public Student(String name, int NumQuiz, double TotalScore){
        this.name = name;
        this.NumQuiz = NumQuiz;
        this.TotalScore = TotalScore;
        
    }
    
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    public String getName(){
        return name;
    }
    public double getTotalScore(){
        return TotalScore;
    }
    public int addNumQuiz(){
         return NumQuiz + 1;
        
    }public double getAverageScore(){
        return TotalScore/NumQuiz;
    }
    }

    
    
