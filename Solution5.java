/*Abstraction : Only essential part are Visible trible
 and non essential part or not visible*/
abstract class Animal{
    public abstract void fun();
    public void speed(){
        System.out.println("Zzz");
    }
}
class pig extends Animal{
    public void fun(){
        System.out.println("Pig says wee wee");
    }
}
public class Solution5 {
    public static void main(String[]args){
        pig o = new pig();
        o.speed();
        o.fun();
    }
}
