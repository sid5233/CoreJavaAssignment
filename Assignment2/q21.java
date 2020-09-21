import java.util.Scanner;
class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        float avg;
        System.out.println("Enter elements : ");
        int arr[] = new int[10];
        for (int i=0; i<10; i++){
            arr[i]=sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println(sum);
        avg = sum / 10;
        System.out.println(avg);
    }
}