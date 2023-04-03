/*An abstract class in Java is one that is declared
 with the abstract keyword. It may have both abstract
 and non-abstract methods(methods with bodies).
 An abstract is a java modifier applicable for classes
 and methods in java but not for Variables. In this article,
 we will learn the use of abstract class in java. 
 ==>>
 Abstract class is a class which is not Initiated itselft 
 it needs to be subclassed by another class to use its properties.
 An abstract class is declared using the “abstract” keyword in its
 class definition.
 If a class contains at least one abstract method
 then compulsory should declare a class as abstract */
 import java.util.*;
abstract class Sunstar{//abstract class can't be initiated.
    abstract void printInfo();
}
class Shailendra extends Sunstar{
    void printInfo() {
    int age = 23;
    String name  = "Shailendra";
    String color = "light Fair";
    String degree = "Mechanical Enginnering";
    System.out.println(age);
    System.out.println(name);
    System.out.println(color);
    System.out.println(degree);
    }
}
public class Main2 {
    public static void main(String[]args){
        Shailendra s = new Shailendra();
        s.printInfo();
    }
}
