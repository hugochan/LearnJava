package new_salary;

/* File name : NewSalary.java */
public class NewSalary extends NewEmployee {
   private double salary;   // Annual salary
  
   public double computePay() {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
   // Remainder of class definition
}