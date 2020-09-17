import java.util.Scanner;

 public class q8 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount time rate ");
        float amount =sc.nextFloat();
        int time = sc.nextInt();
        float rate = sc.nextFloat();

        double SI = (amount*time*rate)/100;
        System.out.format("Simple interest = %.3f\n",SI);
        sc.close();
    }
}
