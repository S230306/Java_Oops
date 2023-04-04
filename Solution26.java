/*Automatic Pramotion in java Method OverLoading concept */
class Test{
    public int M1(int x){
        return x;
    }
    public String  M1(String s){
        return s;
    }
}
public class Solution26 {
    public static void main(String[]args){
        Test t = new Test();
        System.out.print(t.M1('c'));
    }
}
