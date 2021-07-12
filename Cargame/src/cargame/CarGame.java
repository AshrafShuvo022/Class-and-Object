
package cargame;


public class CarGame {
// in this pogramme we worked on some specific thing
    // we created 2 class under the main classs
    //maked one parent classs and one child class
    // we showed how we can access variables or use or modify method from another cls 
    // we can learn from here method overriding 
   
    public static void main(String[] args) {
       //now we are checking basiccar class's details without creating any object in this class
        System.out.println("it will show every details " +BasicCar.details);
        //and after creating object
        BasicCar ferrari = new BasicCar();
        ferrari.breakcar();
       
        System.out.println(""+ferrari.mirror);
        ModernCar lambo = new ModernCar() ;
        lambo.runcar(140);
        lambo.breakcar();
        lambo.jumpcar();
        lambo.whistle();
        ferrari.whistle();
    }
    
}
