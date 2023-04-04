/* Hierarchical Inheritance
In Hierarchical Inheritance, one class serves as a superclass 
(base class) for more than one subclass. In the below image,
 class A serves as a base class for the derived classes B, C,
  and D. */
class A{
    public void fun1(){
        System.out.println("class A");
    }
}
class B extends A{
    public void fun2(){
        System.out.println("class B");
    }
}
class C extends B{
    public void fun3(){
        System.out.println("class C");
    }
}
class D extends C{
    public void fun4(){
        System.out.println("class D");
    }
}
public class Solution18 {
    public static void main(String[]args){
        D d = new D();
        d.fun1();
        d.fun2();
        d.fun3();
        d.fun4();
    }
}

