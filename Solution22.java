/*// Java program to demonstrate working of method
// overloading in Java */
class Test{
    public int m1(int x,int y){
        return x+y;
    }
    public String m1(String str){
        return str;
    }
    public double m1(double d){
        return d;
    }
    public boolean m1(double x,int y){
        return x>y?true:false;
    }
}
public class Solution22 {
    public static void main(String[]args){
        Test t = new Test();
        System.out.println(t.m1(10,20));
        System.out.println(t.m1("Shailendra"));
        System.out.println(t.m1(9.8));
        System.out.println(t.m1(9.4,10));
    }
}
