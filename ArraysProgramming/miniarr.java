public class miniarr {

  public static void main(String[] args) {
  int arr[] = {12, 15, 300, 200, 1000, 5};

        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum number: " + min);
    }
}
