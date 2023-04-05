/*// A Simple Java program to demonstrate
// method overriding in java */
class Animal{
    public void Fun(){
        System.out.println("Monkey is showing the happy face.");
    }
}
class Dog extends Animal{
    @Override
    public void Fun(){
        System.out.println("Dog is against to Monkey.");
    }
}
public class Solution29 {
    public static void main(String[]args){
        Animal p = new Dog();
        p.Fun();
    }
}
