import java.util.Scanner;

abstract class Processor{
	int data;
 	void showData() {
		System.out.println(data);
	}
	abstract void process(int no);
}
class Factorial extends Processor{
	int result = 1;
	void process (int no1) {
		for(int i= no1 ;i>0; i--)
		{
			result=result*i;
		}
		
		data=result;
	}
	
}

class Circle extends Processor {
	void process (int no2){
		int area=(int)(Math.PI*(Math.pow(no2,2)));
		data = area;
		}
}

public class que48 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("choose any : \n1.Factorial \n2.Area of circle \n3.Exit");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("enter number : ");
			int no= sc.nextInt();
			Processor fact = new Factorial();
			fact.process(no);
			fact.showData();
		}
		else if (choice == 2) {
			System.out.println("enter radius : ");
			int no1 = sc.nextInt();
			Processor rad = new Circle();
			rad.process(no1);
			rad.showData();
		}
		else if(choice == 3) {
			System.exit(0);
		}
		else {
			System.out.println("invalid choice");
		}
		
		}
 
	}

}
