import java.util.Scanner;

class Product {
	 int pid;
	 int price;
	 int quantity;
	
	Product (int pid,int price,int qua){
		this.pid = pid;
		this.price = price;
		this.quantity = qua; 
	}
	
	static int total(Product p1[]) {
		int totalA = 0;
		for (int i = 0; i < p1.length; i++) {
			totalA = totalA + p1[i].price * p1[i].quantity;
		}
		return totalA;
	}
}

public class que39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter objects : ");
		int count = sc.nextInt();
		
		Product p1[] = new Product[count];
		for (int i=0; i<p1.length;i++) {
			System.out.println("Enter pid : ");
			int pid = sc.nextInt();
			
			System.out.println("Enter price : ");
			int price = sc.nextInt();
			
			System.out.println("Enter Qunatity : ");
			int quantity = sc.nextInt();
			
			Product p = new Product(pid,price,quantity);
			
			p1[i] = p;
		}
		
		int max = 0,maxpid=0;
		for (int i = 0; i < p1.length; i++) {
			max = p1[0].price;
			if (p1[i].price >= max) {
				maxpid = p1[i].pid;
			}
		}
		
		System.out.println("PID with Highest Price :"+maxpid);
		int res = Product.total(p1);
		System.out.println("Total Amount : "+res);
		sc.close();
	}

}
