/*The program to access variables of the class
 EncapsulateDemo is shown below:   */
class Encapsulate{
    private String name;
    private String color;
    private String caste;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getCaste(){
        return caste;
    }
    public void setCaste(String caste){
        this.caste = caste;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
public class Solution10 {
    public static void main(String[]args){
        Encapsulate e = new Encapsulate();
        e.setName("Shailendra");
        e.setColor("fair");
        e.setCaste("Rajak");
        e.setAge(24);
        System.out.println(e.getName());
        System.out.println(e.getColor());
        System.out.println(e.getCaste());
        System.out.println(e.getAge());
    }
}
