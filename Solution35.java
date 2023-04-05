/*The overriding method must have same return type (or subtype)
 : From Java 5.0 onwards it is possible to have different
  return type for a overriding method in child class, but child’s
   return type should be sub-type of parent’s return type. 
   This phenomena is known as covariant return type. */
    class Test{
     int x =9;
     public int fun(int x ){
        return x;
     }
     public void fun1(){
        System.out.println("Hey");
     }
   }
   class retest extends Test{
    @Override
     public int fun(int x){
        return x;
     }
     @Override
     public void fun1(){
        System.out.println("Hello");
     }
   }
   public class Solution35 {
    public static void main(String[]args){
        retest p = new retest();
        System.out.println(p.fun(4));
        p.fun1();
    }
}
