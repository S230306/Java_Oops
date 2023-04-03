// use the geeter and setter method.
class Name{
    private int age;// hinding the data so we have to make private
    public int getAge(){// getter
        return age;
    }
    public void setAge(int age){//setter
        this.age = age;
    }
}
public class Solution11 {
   public static void main(String[]args){
    Name n = new Name();
    n.setAge(24);
    System.out.println("The age of the person is:"+n.getAge()+" Years");
   } 
}
