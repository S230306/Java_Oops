/*Encapsulation: it's fundamental concept of OOP. which is refers to 
 * bundling the data member and method in single unit
 * which is class in java. to achieved the encapsulation t declare the
 * instance as a private .thet are not accessible outside of the class
 * to access the data member outside of the class use the public
 * getter and setter method.
 * here the example that demonstrate the Encapsulation
*/
class Person{
    String name;
    int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
public class Solution6 {
    public static void main(String[]args){
        Person p = new Person();
        p.setName("Shailendra");
        p.setAge(24);
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
