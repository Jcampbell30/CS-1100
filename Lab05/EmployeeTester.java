
/**
 * Write a description of class EmployeeTester here.
 *Jared Campbell
 *Rjn259
 *Lab05
 */
public class EmployeeTester

{
public static void main(String[] args) {
    Employee employee01 = new Employee();
    
    //Created new object
    
    //Testing methods
    System.out.println("The Employee's Job Title = " + employee01.getJobTitle());
    System.out.println("The Employee's name = " + employee01.getName());
    System.out.println("The Employee's Salary = " + employee01.getSalary());
    System.out.println("The Employee's SickDays = " + employee01.getSickDays());
    System.out.println("Decrease Salary = " + employee01.getDecreaseSalary());
    System.out.println("Increase Salary = " + employee01.getIncreaseSalary());
    System.out.println("Add Sick Day = " + employee01.getAddSickDay());
    System.out.println("Remove Sick Day = " + employee01.getRemoveSickDay());
    System.out.println("Change Job Title = " + employee01.getChangeJobTitle());
    
    //Expected output
 
    System.out.println("Expected Title = " + employee01.getJobTitle());
    System.out.println("Expected name = " + employee01.getName());
    System.out.println("Expected Salary = " + employee01.getSalary());
    System.out.println("Expected SickDays = " + employee01.getSickDays());
    System.out.println("Expected Increase = " + employee01.getDecreaseSalary());
    System.out.println("Expected Decrease = " + employee01.getIncreaseSalary());
    System.out.println("Expected add = " + employee01.getAddSickDay());
    System.out.println("Expected remove = " + employee01.getRemoveSickDay());
    System.out.println("Expected titlechange = " + employee01.getChangeJobTitle());
    
    
    
    
    
    
    
    
}
}