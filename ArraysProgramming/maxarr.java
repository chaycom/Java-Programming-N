public class maxarr {

  public static void main(String[] args) {
    
    int arr [] = {12,15,300,200,1000,5};
    int max = 0;

    for(int i = 0; i<arr.length;i++){

      if(arr[i]>max){

        max = arr[i];
      }
     

    }
     System.out.println(max);
  }
  
}
