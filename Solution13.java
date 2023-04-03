/*/ Java program to illustrate the
// concept of inheritance */
class A{
    public void m1(){
        System.out.println("m1 method which available in Parents class");
    }
    public void m2(){
        System.out.println("m2 method it's also available in Parents class");
    }
}
class B extends A{
    public void m3(){
        System.out.println("m3 is a child of A");
    }
}
public class Solution13 {
    public static void main(String[]args){
        //A a =new A();
        // a.m1();
        // a.m2();
        B b =new B();
        b.m1();
        b.m2();
        b.m3();
    }
}
