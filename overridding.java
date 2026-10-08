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
  
void tire(){ // when child class immpliments its own version that already present in parent class is called medhod overridding it is decided at run time by intance or obj time
      System.out.println("Mention tire name bmw");
 }
}


public class overridding {
  public static void main(String[] args) {
    
    car b = new bmw();
    b.tire();
  }
}
