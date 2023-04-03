/*In Multilevel Inheritance, a derived class will be inheriting 
a base class, and as well as the derived class also acts as the 
base class for other classes. In the below image, class A serves as
a base class for the derived class B, which in turn serves as
a base class for the derived class C. In Java, a class cannot 
directly access the grandparent’s members. */
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
class C extends A{
    public void fun3(){
        System.out.println("class C");
    }
}
class D extends A{
    public void fun4(){
        System.out.println("class D");
    }
}
public class Solution17 {
    public static void main(String[]args){
        B b = new B();
        b.fun1();
        b.fun2();
        C c = new C();
        c.fun1();
        c.fun3();
        D d = new D();
        d.fun1();
        d.fun4();
    }
}
