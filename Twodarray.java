import java.util.Scanner;

public class Twodarray {
  
public static void main(String[] args) {

  Scanner s = new Scanner(System.in);

  System.out.println("Enter the rows");

  int rows =  s.nextInt();
  System.out.println("Enter the number of coloum");

  int coloum = s.nextInt();
 

  int a[][]= new int[rows][coloum];

  for(int i = 0;i<a.length;i++){
    
     for (int j = 0; j < a[i].length; j++){
     
       System.out.println("Enter value for [" + i + "][" + j + "]:");
      a[i][j] = s.nextInt();

     }


}

for(int i = 0;i< a.length;i++){

for(int j = 0;j<i;j++){

System.out.print(a[i][j]);

}

System.out.println();

}





  
  
}
}
