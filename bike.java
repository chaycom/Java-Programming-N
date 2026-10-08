class campany{

int i = 5;

}

class bajaj extends campany {

  int i = 20;
  
  void ch(){

    System.out.println(i);
    System.out.println(super.i);
  }
  }

public class bike {
  public static void main(String[] args) {
    bajaj b = new bajaj();
    b.ch();
  }
}
