/* In Java, just like in C++ an instance of an abstract class
 cannot be created, we can have references to abstract class type
 though. It is as shown below via the clean java program.*/
abstract class Animal{
    abstract void printMethod();
}
class cow extends Animal{
    void printMethod(){
        String name = "Cow";
        String useFor = "Milk Product";
        int nleg = 4;
        int nHorn = 2;
        System.out.println(name);
        System.out.println(useFor);
        System.out.println(nleg);
        System.out.println(nHorn);
    }
}
 public class Solution {
   public static void main(String[]args){
      cow c = new cow();
      c.printMethod();
   } 
}
