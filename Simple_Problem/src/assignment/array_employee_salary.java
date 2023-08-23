package assignment;

public class array_employee_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a java program and use arrays store the 
		// name and salary of 5 employees and display the same ?
		String[] employeeNames = new String[5];
        double[] employeeSalaries = new double[5];

        // Fill in employee information
        employeeNames[0] = "Ronit";
        employeeSalaries[0] = 50000.0;
        employeeNames[1] = "Abhi";
        employeeSalaries[1] = 55000.0;
        employeeNames[2] = "Hallen";
        employeeSalaries[2] = 60000.0;
        employeeNames[3] = "Jagannath";
        employeeSalaries[3] = 52000.0;
        employeeNames[4] = "KD";
        employeeSalaries[4] = 58000.0;

        // Display employee information
        System.out.println("Employee Information:");
        System.out.println("---------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Name: " + employeeNames[i]);
            System.out.println("Salary: $" + employeeSalaries[i]);
            System.out.println("---------------------");
        }
	}

}
