/*1. Single Inheritance
In single inheritance, subclasses inherit the features of one superclass.
In the image below, class A serves as a base class for the derived class B.
              A
              ^
              |
              |
              B
*/
class A{
    int salary = 5000;
    int bonus  = 2000;
    int tc =   200;
}
class B extends A{
    int hike = 2000;
    int total  = salary+bonus+tc+hike;
}
public class Solution16 {
    public static void main(String[]args){
       B b = new B();
       System.out.println(b.salary);
       System.out.println(b.bonus);
       System.out.println(b.tc);
       System.out.println(b.hike); 
       System.out.println(b.total);
    }
}
