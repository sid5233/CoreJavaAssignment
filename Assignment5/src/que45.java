import java.util.Scanner;

class Student {
	public static int rno;
	int rollno;
	int percentage;
	
	public Student() {
		this.rollno = ++rno;
	}
	Student( int per){
		this.percentage = per;
		this.rollno = ++rno;
	}
	void show() {
		System.out.println("Roll No :"+rollno);
		System.out.println("Percentage : "+percentage);
	}
	int getRN () {
		return this.rollno;
	}
	int getPer() {
		return this.percentage;
	}
}

class collegeStudent extends Student {
	int semester;
	public collegeStudent() {
		 this.semester = 1;
	}
	collegeStudent(int per , int sem){
		super(per);
		this.semester = sem;
	}
	void show() {
		super.show();
		System.out.println("Semester : "+this.semester);
	}
}
class schoolStudent extends Student{
	String className;
	public schoolStudent() {
		this.className = "12th";
	}
	public schoolStudent(int perc,String classname){
		super(perc);
		this.className = classname;
	}
	void show() {
		super.show();
		System.out.println("ClassName : "+className);
	}
}

public class que45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[4];
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter percentage: ");
			int cent = sc.nextInt();
			System.out.println("Enter Semseter: ");
			int sem = sc.nextInt();
			
			Student s1 = new collegeStudent(cent,sem);
			s[i] = s1;

		}
		
		for(int i=2; i<4; i++){// 2 3

			System.out.println("Enter percentage: ");
			int cent = sc.nextInt();
			System.out.println("Enter class Name: ");
			String className = sc.next();

			
			Student s1 = new schoolStudent(cent,className);
			s[i]= s1;
			//s[i].show(); 
		}
		
		int count=0;
		for (int i = 0; i < s.length; i++) {
			if(s[i].getPer() > 75 ) {
				count++;
			}
			s[i].show();
		}
		
		System.out.println("Enter a rollNo to search");
		int search = sc.nextInt();
		
		for (int i = 0; i < s.length; i++) {
			if (search == s[i].getRN()) {
				if(s[i] instanceof schoolStudent) {				
				s[i].show();
			}
				else {
					System.out.println("College type: ");
					s[i].show();
				}
				
		}
	}
	System.out.println("Students with A greade : "+count);	
		sc.close();
	}

}
