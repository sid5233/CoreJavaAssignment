import java.util.Scanner;

class q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A:");
        byte a = sc.nextByte();
        System.out.println("Enter value of B:");
        byte b = sc.nextByte();
        int c = a + b;

        System.out.println("Sum : " + c);
        sc.close();
    }
}