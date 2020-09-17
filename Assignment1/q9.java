import java.util.Scanner;

class q9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a days");
        int year, month, days, number_of_days, Days_In_month = 30;
        number_of_days = sc.nextInt();
        year = number_of_days / 365;
        month = (number_of_days % 365) / Days_In_month;
        days = (number_of_days % 365) % Days_In_month;
        System.out.println("Years : " + year);
        System.out.println("months : " + month);
        System.out.println("Days : " + days);
        sc.close();
    }

}