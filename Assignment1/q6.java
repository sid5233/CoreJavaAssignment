import java.util.Scanner;

class q6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Radius of circle:");
        float pi = 3.14F;
        int r = sc.nextInt();
        System.out.println("Radius of circle is " + pi * r * r);
        sc.close();
    }
}