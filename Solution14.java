interface A{
    public void fun();
}
interface B {
    public void fun();
}
interface C extends A,B{
}

public interface Solution14 {
    public static void main(String[]args){
    System.out.print("Multiple Inheritence"); 
    }
}
