/*Like C++, an abstract class can contain constructors in Java.
 And a constructor of an abstract class is called when an instance
 of an inherited class is created. It is as shown in the program
 below as follows:  */
abstract class Animal{
    Animal(){
        System.out.println("this is Animal class");
    }
    abstract void printInfo();
}
class cow extends Animal{
   void printInfo(){
    System.out.print("this is animal child class");
   }     
}
public class Solution1 {
    public static void main(String[]args){
        cow c = new cow();
        c.printInfo();
    }
}
