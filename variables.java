public class variables {
 static int a = 8; 

 int b = 9;
  public static void main(String[] args) {
    
    int a = 10;
    long b =  100000000;
    
    System.out.println(a);//local variable --- variable declared inside the main medhod only 
    System.out.println(variables.a); //static we use static key word, we acess static varible using class name***git reset 


   variables obj =  new variables();
  
   System.out.println(obj.b);
    
    //a medhod decalred inside the class but outside the medthod this called non static medhod we dont use static key word in non static, using object creation we can call non static variable 
  }
}
