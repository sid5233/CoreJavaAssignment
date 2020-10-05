import java.util.Scanner;

class Faculty{
	int facultyId;
	int salary;
	
	void input(int facultyId) {
		this.facultyId = facultyId;
	}
	void printSalary() {
		System.out.println("Salary is : "+salary);
	}
}

class FullTimeFaculty extends Faculty{
	int basicSalary;
	int allowance;
	
	public void input(int facultyId) {
		super.input(facultyId);
	}
	public FullTimeFaculty(int basicSalary, int allowance) {
		this.basicSalary = basicSalary;
		this.allowance = allowance;
		calFSal();
	}
	void calFSal() {
		float sal = this.basicSalary + this.allowance;
		System.out.println("Full Time Salary : "+sal);
	}
}

class PartTimeFaculty extends Faculty {
	int workingHour;
	int ratePerHour;
	
	void input(int facultyId){
		super.input(facultyId);
	}
	PartTimeFaculty(int workingHour,int ratePerHour){
		this.workingHour = workingHour;
		this.ratePerHour = ratePerHour;
		calPtSal();
	}
	void calPtSal() {
		float sal = this.workingHour * this.ratePerHour;
		System.out.println("PartTimeSal : "+sal);
	}
}	
class que44 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter FullTimeFacultyData");
		System.out.println("Faculty ID : ");
		int fid = sc.nextInt();
		System.out.println("Basic Salary : ");
		int bs = sc.nextInt();
		System.out.println("Allowance : ");
		int alw = sc.nextInt();
		
		Faculty f = new FullTimeFaculty(bs,alw);
		f.input(fid);
		
		System.out.println("Enter PartTimeFacultyData");
		System.out.println("Faculty ID : ");
		fid = sc.nextInt();
		System.out.println("Working hour : ");
		int wh = sc.nextInt();
		System.out.println("Rate per hour : ");
		int rph = sc.nextInt();
		
		Faculty f1 = new PartTimeFaculty(wh, rph) ;
		f1.input(fid);
		
		sc.close();
	}
}