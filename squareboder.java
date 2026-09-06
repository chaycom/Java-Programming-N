import java.util.Scanner;

public class squareboder {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int a = s.nextInt();
      
    

    for(int i = 1;i<=a;i++){ 
      for(int j= 1;j<=a;j++){

        if(i==1||j==1||i==a||j==a){
    System.out.print("*"); 

        }
        else{

          System.out.print(" ");
        }

    }
    System.out.println(); // move to next line

  }
  }
  
}