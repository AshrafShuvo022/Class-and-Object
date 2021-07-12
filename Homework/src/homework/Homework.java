
package homework;

public class Homework {

    public static void main(String[] args) {
        Book education = new Book("Physics" , "Aminul");
        education.height = 2 ;
        education.length = 4 ;
        education.width = 3 ;
        Box blue = new Box( 5 , 5 ,  5);
        
        System.out.println("Volume of the blue box is " +blue.getVolume());
        System.out.println("Book name is " +education.name);
        System.out.println("Book's writer is " +education.writter);
        System.out.println("Book's height is " +education.height);
        System.out.println("Book's width is " +education.width);
    
    }
    
}
