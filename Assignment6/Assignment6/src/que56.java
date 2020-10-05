import java.util.Scanner;

public class que56 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the sentence");
		String name = scanner.nextLine();

		int len = name.length();
		String array[] = name.split(" ");
		
		int size = array.length;
		for(int i = 0 ; i<size ; i++)
		{
		         System.out.print(array[i].substring(0,1).toUpperCase());
		         
		         System.out.print(array[i].substring(1,array[i].length()) + " ");
		}
	}

}
