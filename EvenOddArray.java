  import java.util.Scanner;

  public class EvenOddArray {

    public static void main(String[] args){

  Scanner s = new Scanner(System.in);
  

  System.out.println("Enter the size if the array");

  int n = s.nextInt();

  int even[] = new int[n];
  int odd[]  = new int[n];

  int a[] =  new int[n];
  System.out.println("Enter the element");
  for(int i = 0;i<a.length;i++){
  
    a[i] = s.nextInt();
 }
  for(int i = 0;i<a.length;i++){

    if(a[i]%2==0){
     even[i]= a[i];
    }
    else{
      odd[i] = a[i];
    }


  }

  for(int i = 0;i<even.length;i++){
   
    System.out.print("even no."+ even[i]);



  }
  for(int i = 0;i<odd.length;i++){
   
    System.out.print("odd no."+ odd[i]);

}

 }


}
