package assignment;


	//Create a Employee class with variables for name, emp_no , salary.
	//Use constructors to assign values to 3 different employees.
	//Display the values using method named display.

public class Employees_details {
	public String name;
	public int empNo;
	public double salary;
    
    public Employees_details(String name, int empNo, double salary) {
        this.name = name;
        this.empNo = empNo;
        this.salary = salary;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee Number: " + empNo);
        System.out.println("Salary: " + salary);
        System.out.println("=================================");
    }



    public static void main(String[] args) {
    	Employees_details emp1 = new Employees_details("Ronit Patel", 101, 36000);
    	Employees_details emp2 = new Employees_details("Abhilash Meher", 102, 60000);
    	Employees_details emp3 = new Employees_details("Hallen Pradhan", 103, 28000);
        
        emp1.display();
        emp2.display();
        emp3.display();
    }
}

