/*we can define static methods in an abstract class
 that can be called independently without an object.  */
abstract class Animal{
    static void fun(){
        System.out.println("this is the Parents class");
    }
}
public class Solution4 {
    public static void main(String[]args){
        Animal.fun();
    }
}
