
package main;

public class GamerID {
    
    public String name ;
    public int id ;
    public double rank;
    public String type ;
   
GamerID(){
  
    // constructior is one kind of method
      name = null ;
      id = 0 ;
      rank = -1 ;
      type = null ; 
      //if we overload constructor then we should inatialize 
      //our class's property's difult value manually like that
      //naie constructor overload hole default value thakbe na
      
     }

  GamerID(String name , int id , double rank , String type ){
    this.name = name ;
    this.id = id ;
    this.rank =  rank ;
    this.type = type ;
   }
  
  // creating a method named gamerinfo
  // initializing values through the method
  public void gamerinfo(String name , int id , double rank , String type)
  {
    this.name = name ;
    this.id = id ;
    this.rank = rank ;
    this.type =type ;
    // this method is for intializing beacuse its type is void
    // that's mean this method can not return any value
 }
  
  public int grade ()
  {
 if("noob".equals(type)){
     return 1 ;
        }
    
     if("medium".equals(type)){
        return 2; 
     }
    if("pro".equals(type)){
        return 3 ;
     }
     else
         return 0 ;
 }
  // same work we can also do with switch
      public int grade1 ()
  {
      switch(type) {
      
          case "pro" :
              return 3 ;
          case "medimum" :
              return 2 ;
          case "noob":
              return 1 ;
          default :
              return 0 ;
      }
     }
}
      
   
 
  

  
  
