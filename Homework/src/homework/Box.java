
package homework;


public class Box  {
   public double length ;
   public double width ;
   public double height ;
   
   
   Box(){
   length = -1 ;
   width = -1 ;
   height = -1 ;
   }
    
    Box(double length , double width , double height){
        this.length = length ;
        this.width = width ;
        this.height = height ;
    }
   // public void values(double length , double width , double height){
      //  this.length = length ;
        //        this.width = width ;
          //             this.height = height ;
    //}
    public double getVolume(){
    double volume = length*width*height ;
    return volume ;
    } 
}
