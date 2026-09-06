    import java.util.Scanner;

    public class Diamond {
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
          
        

        for(int i = 1;i<=a;i++){ 
          for(int j= 1;j<=a-i;j++){

        System.out.print(" "); 

            }
        for (int j = 1;j<=i*2-1;j++){
          
          if(j==1||j==i * 2 - 1){
          System.out.print("*");

          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println();
        }
        
        for(int i = a-1;i>=1;i--){
          for(int j= 1;j<=a-i;j++){

        System.out.print(" "); 

            }
        for (int j = 1;j<=i*2-1;j++){
  if(j==1||j==i * 2 - 1){
          System.out.print("*");

          }
          else{
            System.out.print(" ");
          }


        
      }
        System.out.println();
        }


        }
    

      }
      

      
    