/*Invoking overridden method from sub-class : We can call
 *parent class method in overriding method using super keyword.  */
class Test{
    void show(){
        System.out.println("Hello Coder");
    }
}
class Retest extends Test{
    void show(){
        super.show();
        System.out.println("Hii");
    }
}
 public class Solution36 {
   public static void main(String[]args){
     Test t = new Retest();
     t.show();
   } 
}
