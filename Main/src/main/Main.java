
package main;

public class Main {
    
    public static void main(String[] args) {
     
        int level ;
        //value iniatializing through constructor
       GamerID Shuvo = new GamerID("Ashraf Shuvo" , 200104144 , 144 , "noob" ) ;
        Shuvo.name = "Ashraf Shuvo" ; 
        Shuvo.id = 200104144 ;
        Shuvo.rank = 144 ;
         // direct inatializing object's poperty's value 
        GamerID Shuvo1 = new GamerID() ;
        
        // below line is just initializing data through method called "gamerinfo"
        Shuvo.gamerinfo("Ashraf Shuvo", 2635735 , 144 , "noob");
        // we cannot print gamerinfo method directly bcz it in not a returning type method
       
        System.out.println("Gamer Name is : " + Shuvo.name );
        System.out.println("Gamer ID is : " + Shuvo.id );
        System.out.println("Gamer rank is : " + Shuvo.rank );
        //direct printing a method
        System.out.println("Gamer level : " + Shuvo.grade());
        System.out.println("Name : " + Shuvo1.name);
    }
    
}
