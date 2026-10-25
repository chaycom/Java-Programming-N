abstract class car{

  abstract void start();
   
  
  void stop(){

  }
}
class bmw extends car{

  void start(){

    System.out.println("Bmw car started");
  }
  
  // void stop(){

  //   System.out.println("Bmw car stoped");
  // }
}




public class newcar {
  public static void main(String[] args) {
    
    driver d  =  new driver();

    d.driving(new bmw());
    d.driving(new Benz());

  }
}
