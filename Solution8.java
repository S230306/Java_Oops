/* Encapsulation is defined wrapping the data in single unit*/
class student{
    String name;
    int ts;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getTs(){
        return ts;
    }
    public void setTs(int ts){
        this.ts = ts;
    }
}
public class Solution8 {
    public static void main(String[]args){
        student s = new student();
        s.setName("Dr kn modi institute of Engineering and technology");
        s.setTs(34);
        System.out.println(s.getName());
        System.out.println(s.getTs());

    }
}
