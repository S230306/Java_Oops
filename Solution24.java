class Test{
    public int M1(int a,int b){
        return a+b;
    }
    public double M1(double x,int y){
        return x+y;
    }
    public String M1(String s){
        return s;
    }
}
public class Solution24 {
    public static void main(String[]args){
        Test t = new Test();
        System.out.println(t.M1(10,20));
        System.out.println(t.M1(9.5,45));
        System.out.println(t.M1("Shailendra"));
    }
}
