/* Method Overloading allows different methods to have the same name,
   but different signatures where the signature can differ by the
   number of input parameters or type of input parameters,
   or a mixture of both. 

  Method overloading is also known as Compile-time Polymorphism,
  Static Polymorphism, or Early binding in Java.
  In Method overloading compared to parent argument,
  child argument will get the highest priority. */
class Test{
    public void m1(int num){
        System.out.println("Integer "+num);
    }
    public void m1(double d){
        System.out.println("Double "+d);
    }
    public void m1(String s){
        System.out.println("String "+s);
    }
}
public class Solution21 {
   public static void main(String[]args){
      Test t = new Test();
      t.m1(10);
      t.m1(10.65);
      t.m1("Shailendra");
   } 
}
