import java.util.Scanner;
class mathOperation {

      
    static void add(int a,int b){
        System.out.println("addition " +(a+b));
    }
    static void subtract(int a,int b){
        System.out.println("subtraction : "+(a-b));
    }
    static void multiply(int a,int b){
        System.out.println("Multiplication : "+(a * b));
    }
    static void power (int a,int b){
        double result = Math.pow(a,b);
        System.out.println("a to the Power b : "+result);
    }

      
}

class q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("enter num1 : ");
        a = sc.nextInt();
        System.out.println("enter num2 : ");
        b = sc.nextInt();
        mathOperation.add(a,b);
        mathOperation.subtract(a,b);
        mathOperation.multiply(a,b);
        mathOperation.power(a,b);
    }
}