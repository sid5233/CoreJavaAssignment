package Assignment.Assignment1;

import java.util.Scanner;
class q14{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=sc.nextInt();
		if(year % 4==0 && year % 100!=0 || year % 400==0){
			System.out.println("Leap year");
		}else{
			System.out.println(" Not a Leap year");
        }
    sc.close();
    }
}