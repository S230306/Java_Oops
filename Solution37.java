/*this KeyWord -->
 * this is refference variables which is reffers the current object.
 */
class Test{
    int a;
    int b;
    Test(int a,int b){
        this.a = a ;
        this.b = b;
    }
    public void display(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class Solution37 {
   public static void main(String[]args){
    Test t = new Test(2,5);
    //System.out.println(t.a);
    //System.out.println(t.b);
    t.display();
   } 
}
