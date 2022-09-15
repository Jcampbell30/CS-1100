
/**
 * Jared Campbell
 * RJN259
 * Tester for Student
 * Lab05
 */
public class StudentTester{
    public static void main(String[] args) {
        Student student01 = new Student("Jared",1,24.3);
        //Creating new object to run Test
        
        System.out.println("The Total Score = " + student01.getTotalScore());
        System.out.println("The Average Score = " + student01.getAverageScore());
        System.out.println("The Number of Quiz = " + student01.addNumQuiz());
        System.out.println("The Student name = " + student01.getName());
        //using these methods in order to test object
        
        
        
    
}}
