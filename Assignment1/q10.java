import java.util.Scanner;
class q10 {
public static void main(String args[]){
System.out.println("convert temperature from Fahrenheit to Celsius");
Scanner sc=new Scanner(System.in);
int f=sc.nextInt();
int C= 5*(f-32)/9;
System.out.println("temperature is " +C);
sc.close();
}
}