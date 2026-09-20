import java.util.Scanner;

public class reverseArraya {
  
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of the array");

    int n = s.nextInt();

    int a[] = new int[n];
    System.out.println("Enter the element");
    for(int i = 0;i<a.length;i++){
     
      a[i] = s.nextInt();

}
 System.out.println("The value insert by the user");
 for(int i = 0;i<a.length;i++){
 
  System.out.println(a[i]);


 }
 System.out.println("The reverse order of the array");
 for(int i = n-1;i>=0;i--){


  System.out.println(a[i]);
 }





  



    
  }
}
