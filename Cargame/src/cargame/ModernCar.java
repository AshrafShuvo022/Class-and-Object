 
package cargame;

//to make a child class we have to use a keyword 'extends'
//after extending the classs we are able to acess any public variable or methods of parent class
public class ModernCar extends BasicCar  {
    //it is a child class
    //its parent class is Basiccar
    //this car havesome new poperty or facility 
    
    public String cvplayer = "cD player of car";
    public String backcamera = "Back camera of car";
    public String airbag = "Airbag of Car";
    public String radio = "Radio of Car" ;
    public String ac = "AC of Car" ;
                
    // here in oop method stands for the power of doing something or functionality
    public void jumpcar (){
        System.out.println("This car can jump");
    }
     //now we are going to override method
    //whwn we write ecxatly same method without changing anything called method overrding
 
    // we do override method in a different class
    //by overiding method we are modifing the method as our need for new class
       @Override
    public void breakcar (){
        System.out.println("This car can break at any time with safety");
    }@Override
    public void whistle (){
            System.out.println("This Car can whistle at a hearable limit");
    }@Override
    public void runcar (float speed){
    if(speed <= 150 ){
        System.out.println("This car can run.speed of this car is " +speed);
    } 
    else
                System.out.println("speed is above 150 so the car can't run");
    }
    
    
    
}
