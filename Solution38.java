/*Using this() to invoke current class constructor */
class Test{
    int a;
    int b;
    // default constructor
    Test(){
        this(10,20);
        System.out.println("This is Default constructor");
    }
    Test(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+"  "+b);
    }
}
public class Solution38 {
    public  static void main(String[]args){
        Test t = new Test();

    }
}
