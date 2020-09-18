import java.util.Scanner;

class q18 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num : ");
    int num = sc.nextInt();
    for (int i = 2; i <= num/2; i++) {
      if (num % i == 0) {
        System.out.println("num is not prime ");
        break;
      } 
      else {
        System.out.println("num is prime ");
        break;
      }
    }
  }
}
