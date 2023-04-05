/* Static methods can not be overridden(Method Overriding vs
   Method Hiding) : When you define a static method with same
   signature as a static method in base class, it is known as
   method hiding. The following table summarizes what happens
   when you define a method with the same signature as a method
   in a super-class.Superclass Instance Method	*/
class Parents{
    static void m1(){
        System.out.println("Parents M1");
    }
    public void m2(){
        System.out.println("Parents M2");
    }
}
class child extends Parents{
    
    static void m1(){
        System.out.println("Child M1");
    }
    @Override
    public void m2(){
        System.out.println("Child M2");
    }
}
public class Solution32 {
    public static void main(String[]args){
        Parents d = new child();
        d.m1();
        d.m2();
    }
}
