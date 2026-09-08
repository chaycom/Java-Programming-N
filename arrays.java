import java.util.Scanner;

public class arrays {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = s.nextInt();
    
    int arr[] = new int [n];
    System.out.println("Enter the elements");
    for(int i = 0;i<arr.length;i++){

      arr[i] =  s.nextInt();

    }
    System.out.println("The element you Enter");
    for(int i = 0;i<arr.length;i++){

      System.out.println(arr[i]);
    }


  }
}
