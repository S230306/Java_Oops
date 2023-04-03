/* A java Program contain any number of class but 
there is only one public class is there more then on public class 
is exists it give the error. */
class a {
    public static void main(String[]args){
        System.out.println("a class main method");
    }
}

class b {
    public static void main(String[]args){
        System.out.println("b class main method");
    }
}
 class c { // if here i am initialze the class with public its give the error because public class must have its own file
    public static void main(String[]args){
        System.out.println("c class main method");
    }
}
class d {
    
    }

/* java source file staructure the source file name should be same
 * as the name the class 
 * class and file name should be same if there is any public class.
 */