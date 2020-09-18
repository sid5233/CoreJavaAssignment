package Assignment.Assignment1;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        System.out.println("enter two numbers : ");
        Scanner sc =  new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("BS A : " +a);
            System.out.println("BS B : " +b);
            a = a + b;
            b = a - b;
            a = a - b; 
        System.out.println("AS A : " +a);
        System.out.println("AS B : " +b);
        sc.close();
        
    }
    
}
