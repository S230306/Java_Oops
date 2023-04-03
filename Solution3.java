/*Abstract class have final keywords that can't be Overridden. */
abstract class Animal{
    final void fun(){
        System.out.println("This is the parents class");
    }
}
class dog extends Animal{
   
}
public class Solution3 {
   public static void main(String[]args){
    dog d = new dog();
    d.fun();
   } 
}
