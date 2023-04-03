/*Abstract method or abstract class */
// Abstract method is use the obtain the Abstraction.
// Abstract method have not any body 
// abstract method is use for the declaration not for implementation the child class is responsible to implements.
// if abstract class not have any abstract method it is not compalssory to make the method as Abstract.
abstract class Vehicles{
    // parents method
    public abstract int getNoWheels();
}
// child class bus
class Bus extends Vehicles{
    public int getNoWheels(){
        return 6;
    }
}
// child class bike
class bike extends Vehicles{
    public int getNoWheels(){
        return 2;
    }
}
public class Main {
    public static void main(String[]args){
        Bus bus = new Bus();
        System.out.println(bus.getNoWheels());
        bike b = new bike();
        System.out.print(b.getNoWheels());
    }
}
