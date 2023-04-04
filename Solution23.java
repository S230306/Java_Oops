/*// Java Program to Illustrate Method Overloading
// By Changing the Number of Parameters */
class Product{
    public int Multi(int a,int b){
        int c = a*b;
        return c;
    }
    public int Multi(int a,int b,int c){
        int d = a*b*c;
        return d;
    }
    public int Multi(int a,int b,int c,int f){
        int e = a*b*c*f;
        return e;
    }
}
public class Solution23 {
    public static void main(String[]args){
        Product p = new Product();
        System.out.println(p.Multi(10,20));
        System.out.println(p.Multi(20,30,40));
        System.out.println(p.Multi(20,30,50,10));

    }
}
