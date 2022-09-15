
/**
 * Employee object is used to track the following data:
 * name, job title, salary, sick days (a total number of sick days that the employee has remaining to use).
 * Jared Campbell
 * RJN259
 * Lab05 
 */
public class Employee
{
    //Instance variables of employee class
    
    
    private String name;
    private String jobTitle;
    private double salary;
    private int sickDays;
    
    
    
        public Employee(){
        name = "name";
        jobTitle = "jobTitle";
        salary = 100.0;
        sickDays = 12;
        
        

    }

    /**
     * Constructor for objects of class Employee
     * with arguments
     */
    public Employee(String name, String jobTitle, double salary, int sickDays)
    {
        /**initialise instance variables
         * setting values to variables
         * 4 constructor argument
         */
        
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.sickDays = sickDays;
        
        
        
        
        
    }

    
      //Creating accessor methods for Employee

    public String getJobTitle()
    {
        return jobTitle;        
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public int getSickDays(){
        return sickDays;
    }
    // Creating mutator methods
    public void increaseSalary(double percent){
        salary = salary * (1 + percent);
        
        
    }
    
    
    public void decreaseSalary(double percent){
        salary = salary *100.0 * .15;
        
    }
    public double getDecreaseSalary(){
        return salary - 100.0 *.15;
        
    }
    
    public void addSickDay(){
        sickDays = sickDays + 1;
        
    }
    public int getAddSickDay(){
        return sickDays + 1;
    }
    public void removeSickDay(){
        sickDays = sickDays - 1;
        
        
    }
    public int getRemoveSickDay(){
        return sickDays - 1;
    }
    public void changeJobTitle(String newTitle){
        jobTitle = newTitle;        
        
    }
    public String getChangeJobTitle(){
        return jobTitle;
    }
}
