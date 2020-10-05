import java.util.Scanner;

class Student {
	private int rollNo;
	private String name;
	private int age;
	int score;
	
	void set(int rollNo,String name,int age,int score) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.score = score;
	}
	void show() {
		System.out.println(name+" "+rollNo+ " "+age+ " " +score);
	}
}

public class que40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		Student s1[] = new Student[count];
		for (int i = 0; i < s1.length; i++) {
			System.out.println("Enter name : ");
			String name = sc.next();
			System.out.println("Enter rollNo : ");
			int rollNo = sc.nextInt();
			System.out.println("Enter age : ");
			int age = sc.nextInt();
			System.out.println("Enter score : ");
			int score = sc.nextInt();
			
			Student p = new Student();
			p.set(rollNo, name, age, score);
			s1[i]= p;
		}
		
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].score >= 0 && s1[i].score <=50) {
				System.out.println("Catogory [0-50] : ");
				s1[i].show();
			}
			else if (s1[i].score >= 50 && s1[i].score <=65) {
				System.out.println("Catogory [50-65] : ");
				s1[i].show();
			}
			else if (s1[i].score >= 65 && s1[i].score <=80) {
				System.out.println("Catogory [65-80] : ");
				s1[i].show();
			}
			else if (s1[i].score >= 80 && s1[i].score <=100) {
				System.out.println("Catogory [80-100] : ");
				s1[i].show();
			}
			else {
				System.out.println("score not valid");
				s1[i].show();
				
			}
		}
		
		
	}

}
