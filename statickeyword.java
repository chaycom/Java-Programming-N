class s{
static String  c =  "chay";

static String d  = "arjun";

static void a (){

  System.out.println("Default satic val");
 

}

static void b (int i){

  System.out.println(i);
 
  System.out.println(c);
  System.out.println("Parameter staic val");
  System.out.println(d);
}


}

public class statickeyword {
  
  public static void main(String[] args) {
    
    s.a();
    s.b(56);// we use class name not objects 
    
  }
}

//static blocls/ medhods are excuted only onces at the time of class loading
//we cannot use not static members or varibels in static blocks
//only static varible in use
//this keyword not used only super keyword used
