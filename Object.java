/*Object is a Real world entity. 
it is an intance of the class. */
import java.util.*;
public class Object {
     // declare the attributes.
     int x;
     String name;
     String color;
     int weight;
     // declare the constructor.
     public Object(int x,String name,String color,int weight){
       // this keybord is use to refer the current Object.
       // it's a reffernce variables.

        this.x=x;
        this.name=name;
        this.color=color;
        this.weight=weight;
     }
    public static void main(String[]args){
        // declare the Object.
        Object obj = new Object(5,"Shailendra","Black Fair",62);
        System.out.println(obj.x);
        System.out.println(obj.name);
        System.out.println(obj.color);
        System.out.println(obj.weight);
    }
}
