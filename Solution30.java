/*Final method can not be Overridden*/
class Test{
    final void Show(){
        System.out.println("Hey can u show your marks");
    }
}
class retest extends Test{
     void Show(){
        System.out.println("Yes ! why not");// its not override 
    }
}
public class Solution30 {
    public static void main(String[]args){

    }
}
