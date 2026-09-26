class con{

con(){
//everytime you create an object it will call constructor, even n of object creation , constructor same name as class name
System.out.println("chay");

}
 //parameters constructor
con(int c){
   System.out.println(c);
  }

  con(String abc){
  
    System.out.println(abc);

  }

}
public class constructor {
  public static void main(String[] args) { //heap area 
    

    con a = new con();

    con b = new con();
    
    con d = new con(56);

    con f = new con("bob");

  }
}
