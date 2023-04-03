/* In Java, we can have an abstract class without any
   abstract method. This allows us to create classes
   that cannot be instantiated but can only be inherited.
   It is as shown below as follows with help of a clean
   java program. */
abstract class Animal{
    void fun(){
        System.out.println("This is the parents class");
    }
}
class dog extends Animal{
    @Override
    void fun(){
        System.out.println("This is the child class of the parents");
    }
}
public class Solution2 {
   public static void main(String[]args){
    dog d = new dog();
    d.fun();
   } 
}
