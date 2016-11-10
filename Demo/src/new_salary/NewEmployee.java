package new_salary;

public abstract class NewEmployee {
   private String name;
   private String address;
   private int number;
   
   public abstract double computePay();
   // Remainder of class definition
   
   public String getName() {
	   return name;
   }
	   
}