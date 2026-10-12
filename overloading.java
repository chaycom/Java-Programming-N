class calculator{
//overlading -  method having same name but diffrent parameter is called method overloading it is choose at compile time
  void add(int i , int j){
  System.out.println(i+j);
  }

  void add(int i , int j, int k){
    System.out.println(i+j+k);
  }

  void add(long i , int j){
 System.out.println(i+j);
  }

}

public class overloading {
  public static void main(String[] args) {
    
    calculator b = new calculator();
    b.add(10,20,30);
  }
}
