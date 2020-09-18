import java.util.Scanner;

class q22 {

  public static void main(String args[]) {
    int n, temp;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an array");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter all element of array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] < arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println("Descending order:");
    for (int i = 0; i < n - 1; i++) {
      System.out.println(arr[i] + ",");
    }
    System.out.println(arr[n - 1]);
  }
}
