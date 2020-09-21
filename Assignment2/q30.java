import java.util.Scanner;
class q30 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int sumL = 0,sumR = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array ");
        for ( int i = 0; i<arr.length; i++){
            for ( int j = 0; j<arr.length; j++)
            {
                arr[i][j] = sc.nextInt();
                if (i == j )
                {
                    sumL = sumL + arr[i][j];
                }
                if ( (i+j) == 2 ){
                    sumR = sumR + arr[i][j];
                }
            }
        }
        System.out.println(sumL);
        System.out.println(sumR);
    }
}