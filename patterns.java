import java.util.Scanner;

public class patterns {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int a = s.nextInt();
      

    for(int i = 1;i<=a;i++){ //i = 1 ---1<=5 goes to inner loop now i = 2 

      for(int j= 1;j<=a;j++){// here check the inner loop utill condition ends 

    System.out.print("*"); //j = 1 -- * j= 2 --** -- j=5 ***** next 16th line j= 6 false

    }
    System.out.println(); // move to next line

  }
  }
  
}
