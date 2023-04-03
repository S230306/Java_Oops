/*fields to calculate area */
class Area{
    int length;
    
    int breadth;
    Area(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void getArea(){
        int area = length*breadth;
        System.out.print(area);
    }
}
public class Solution9 {
    public static void main(String[]args){
        Area a = new Area(2,4);
        a.getArea();
    }
}
