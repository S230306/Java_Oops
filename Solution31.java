/*Method Override */
class Parents{
    public void Show(){
        System.out.println("Dear Sukesh Please show your Assigment marks");
    }
}
class Child extends Parents{
    @Override
    public void Show(){
        System.out.println("Dad my marks is not Good");
    }
}
public class Solution31 {
    public static void main(String[]args){
        Parents o = new Child();
        o.Show();
    }
}
