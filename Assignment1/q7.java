import java.util.Scanner;

class q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Five subjects marks : ");
        int s1= sc.nextInt();
        int s2= sc.nextInt();
        int s3= sc.nextInt();
        int s4= sc.nextInt();
        int s5= sc.nextInt();
        int sum = s1+s2+s3+s4+s5;
        float perc = (sum*100)/500;
        //System.out.println("percentage : " +perc);
        System.out.format(" Percentage Marks = %.3f " +perc );
        sc.close();
    }
}