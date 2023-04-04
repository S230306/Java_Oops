/*Automatic Pramotion in Overloading 
 * byte --> short
 * short --> int
 * char  --> int 
 * int   --> long
 * long  --> float
 * float --> double
 * Double is not pramoted by any data type if you try pramote double its give the CE
 * 
*/
class Test{
    void m1(int t){
        System.out.println("this is integer");
    }
    void m1(double d){
        System.out.println("this is m2 double");
    }
    void m1(float f){
        System.out.println("this is m3 float");
    }
}
public class Solution19 {
   public static void main(String[]args){
      Test t = new Test();
      t.m1(10);
      t.m1(9.5);
      t.m1(7.8f);
      t.m1('a');// automatic pramotion in overloading
   } 
}
