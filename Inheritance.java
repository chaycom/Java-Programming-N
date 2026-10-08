class car{

//medhod it is  mandatory to give medhod name and return type
  void tire(){
      System.out.println("Mention tire name mrf");
 }
 //varible mention when return type 
   String color (){

    return "color of the car is red";
  }
  

}
class bmw extends car {
 
  void price(){

    System.out.println("Rs : 80l");
  }
  
void tire(){ // when child class immpliments its own version that already present in parent class is called medhod overridding.
      System.out.println("Mention tire name bmw");
 }
}
public class Inheritance {
  public static void main(String[] args) {
   //intance type and object type 
    car b = new bmw(); //this is called out casting when we create super class refrence and sub class object this called outcasting 
    bmw a = (bmw) b; //downcasting creating super class reference to subtype is know as downcasting it is  explict
    System.out.println(b.color());
    b.tire();
    a.price(); 
  
  }
}
