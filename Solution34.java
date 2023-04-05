/*Private methods can not be overridden : Private methods cannot
 be overridden as they are bonded during compile time. Therefore 
 we can’t even override private methods in a subclass.
 Note we can not use Super keyword in Static context. */
class Superc{
    private void Fun(){
        System.out.println("Private method");
    }
    public void Fun1(){
        System.out.print("Public method");
    }
}
 class subc extends Superc{
    private void Fun(){
        System.out.println("Private sub Method");
    }
    @Override
    public void Fun1(){
        System.out.println("Public sub Method");
    }
 }
 public class Solution34 {
    public static void main(String[]args){
        Superc s = new subc();
        //s.Fun();// its not visible here because its private
        s.Fun1();
        
    }
}
