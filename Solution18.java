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

