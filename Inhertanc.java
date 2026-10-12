class library{

  void book(){
    String name =   "The  last king";
    
    System.out.println(name);
  }
}
class school extends library {

   void book(){
    String name =   "sun";
    
    System.out.println(name);
  }
  void student(){
    
    String stdname =  "sham";
    
    System.out.println(stdname);
  }
}


public class Inhertanc {
  public static void main(String[] args) {
    
    library b =  new school();
    school s = (school) b; // 
    b.book();
    s.student();
    
  }
}
