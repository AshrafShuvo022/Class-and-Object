
package cargame;

public class BasicCar {
    //poperties of the basic car
    // string allows us to access class's any variable or object without creating a object under the class
    //we can directly accesss static type data just putting a dot after classs name
    static String details = "There are some property in this class"
            + "they are car's Wheel , dashbord , steering , seat , mirror ,bonnet"
            + "there are also some method "
            + "runcar,whistle,breakcar,moveleftright,turnonbacklight when break" ;
    public String Wheel = "Wheel 0f car " ;
     public String dashboard = "Dashboard 0f car " ;
      public String steering = "Steerng 0f car " ;
      public String seat = "Seat 0f car " ;
       public String mirror = "Mirror 0f car " ;
         public String bonnet = "Bonnet 0f car " ;
         
         public void runcar (float speed){
         if(speed <= 120){
             System.out.println("Speed of this car is " +speed);
         }
         else 
                 System.out.println("Speed is 120 up cannot run this car");
         }
         public void moveleftright (String leftright){
             System.out.println("This car can turn " +leftright);
         }
         public void breakcar (){
             System.out.println("This car can break");
         }
         public void whistle (){
             System.out.println("This car can whistle");
         }
         public void turnonbacklightwhenbreak (){
             System.out.println("The car can turn on back light when break");
         }
}
