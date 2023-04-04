/*// Java Program to Illustrate Method Overloading
// By changing the Order of the Parameters */
class Test{
    public void M1(int a,String s){
        System.out.println("Integer  "+a+","+"String  "+s);
    }
    public void M1(String str,double d){
        System.out.println("String  "+str+","+"double  "+d);
    }
    public void M1(double d1,double d2){
        System.out.println("double  "+d1+","+"double  "+d2);
    }
}
public class Solution25 {
    public static void main(String[]args){
        Test t = new Test();
        t.M1("Shailendra",10.0);
        t.M1(10,"Shailendra");
        t.M1(4.5,30.0);
    }
}
