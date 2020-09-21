import java.util.Scanner;

class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of ele : ");
        int n ;
        n =  sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++ )
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("reversed Array ");
        for (int j=n-1; j>=0; j-- ){
            System.out.print(arr[j]+ " ");
            
        }
       
    }
}