/*Method Overriding= different method have same name as well as same 
 * parameter but different implementation.
 */
class Test{
    public void Property(){
        System.out.println("1 Billian $");
    }
    public void Marry(){
        System.out.println("Rama "+" weds "+"Laxmi");
    }
} 
class Retest extends Test{
    @Override
    public void Marry(){
       System.out.println("Rama "+" weds "+"Seeta");
    }
}
public class Solution28 {
    public static void main(String[]args){
        Retest t = new Retest();
        t.Marry();
    }
}
