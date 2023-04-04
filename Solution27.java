/* is Static method is got Overlaoding 
 * Ans Yes. 
 * let's see via the help of the example.
 */
class Test{
    public static void Fun(){
        System.out.println("static method 1");
    }
    public static void Fun(int a){
        System.out.println("static method 2");
    }
}
public class Solution27 {
    public static void main(String[]args){
        Test.Fun();
        Test.Fun(10); 
    }  
}
