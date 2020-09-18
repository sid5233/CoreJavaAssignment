package Assignment.Assignment1;

import java.util.Scanner;

class q15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter sex: M/F");
        int sex = sc.next().charAt(0);

         if ((sex == 'M') && (age >= 21)) {
            System.out.println("Eligible for Marriage");

        } 
        else if ((sex == 'F') && (age >= 18)) {
            System.out.println("Eligible for Marriage");
        } 
        else {
            System.out.println("Not Eligible for Marriage");
        }
        sc.close();
    }
}