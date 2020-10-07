import java.util.Scanner;

public class que58 {

	public static void main(String[] args) {
		
			String weekday[] = {"Sunday","Monday","Tuesday","Wenesday","Thursday", "Friday","Saturday"};
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int no =sc.nextInt();
			try {
			for (int i = 0; i < weekday.length-1; i++) {
					
					System.out.println(weekday[i]);
					sc.close();
					
				}
			}
 		    catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Check the Length :");
			 	}
	}
}
