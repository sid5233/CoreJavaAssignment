import java.util.Scanner;

public class que55 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String name = scanner.nextLine();
		int count = 0;
		int len = name.length();
		for(int i = 0 ; i<=len-1 ; i++)
		{
			count = count+1;
		}
		
		 System.out.println("Number of words in the String are = "+count);
	}

}
