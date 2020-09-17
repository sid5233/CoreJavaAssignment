import java.util.Scanner;
class q13 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 number");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>=b && a>=c){
			System.out.println("a is greater number");
		}else if(b>=a && b>=c){
			System.out.println("b is greater number");
		}else{
			System.out.println("c is greater number");
		}
        sc.close();	
	}
    
}