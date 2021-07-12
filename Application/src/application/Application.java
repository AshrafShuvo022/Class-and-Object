
package application;


public class Application {

    public static void main(String[] args) {
        
        Smartphone obj1 = new Smartphone();
    Smartphone obj2 = new Smartphone();
    
    obj1.company = "Samsung" ;
    obj1.os = "Android";
    obj1.modelNo =  27824 ;
    
        System.out.println("company = " +obj1.company);
        System.out.println("OS = " +obj1.os);
        System.out.println("Moel No = " +obj1.modelNo);
        
        obj2.values("Apple", "IOS", 67748);
        System.out.println(" company = " +obj2.company);
        System.out.println(" OS = " +obj2.os);
        System.out.println(" Model No = " +obj2.modelNo);
        
       //we can direct print our result. see below. but for direct printing the method, the method shouil be in int 
       // we can not print void method direct in main.class . because void methode doesn't have any return value
        
    }
    
}
