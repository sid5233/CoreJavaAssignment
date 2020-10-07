import java.util.Scanner;

public class que58 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String str2[] = {"Sun","Tue","Wed","Thur","Fri","Sat","Mon"};
		 int a = sc.nextInt();
		 
		 for (int i = 0; i < str2.length; i++) {
			if(i==(a-1)) {
				System.out.println(str2[i]);
 			}
		}
		 sc.close();
	}

}
