import java.util.Scanner;

class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a num : ");
        int num = sc.nextInt();
        int newNum = 0;
        while (num != 0 )
        {
            int rem = num % 10;
            newNum = newNum * 10 +rem;
            num = num / 10;
        }       
        System.out.println("New num : "+newNum);
    }
}