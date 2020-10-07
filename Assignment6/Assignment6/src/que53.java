import java.util.Scanner;

//53.	Input data exactly in the following format, and print sum of all integer values. 67, 89, 23, 67, 12, 55, 66.
//(Hint use String class split method and Integer class parseInt method) .
public class que53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the Numbers string");
		String str=sc.nextLine();
		
		String arr[]= str.split(",");
		for(String ar:arr)
		{
			sum+=Integer.parseInt(ar);
		}
		System.out.println("Sum of All String of Integer numbers is ... "+sum);
	}
}
