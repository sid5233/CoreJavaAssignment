import java.util.Scanner;
class  q19 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		 int no = sc.nextInt();
            int res=12;
            int sum=0;
            for(int i=1;i<=no;i++)
            {
                System.out.print(res+" ");
                 res =res+10;
                 sum=sum+res;
            }
            System.out.println("");
            System.out.println("Sum of Series : "+sum);
        }
    }