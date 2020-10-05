class Employee {
	private static int empNo;
	private static double salary;
	private static double totalSalary;
	static int counter = 0;
	
	 Employee( double salary1) {
		 salary = salary1;
		 empNo = empNo + 1;
		 totalSalary = totalSalary + salary;
		 counter++;
	 }
	 void display() {
		 System.out.println("ID : "+empNo);
		 System.out.println("Salary of EMP "+salary);
	 }	 
	 void totalsal() {
		 System.out.println("Total Salary : "+totalSalary);
		 System.out.println("Total Employee : "+counter);
	 }
}

public class que38 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1000);
		e1.display();
		Employee e2 = new Employee(2000);
		e2.display();
		Employee e3 = new Employee(5000);
		e3.display();
		e3.totalsal();
	}

}
