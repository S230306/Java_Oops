/*In the below example of inheritance, class Employee is a base class,
  class Engineer is a derived class that extends the Employee class
  and class Test is a driver class to run the program. */
  class Employee{
    int salary = 50000;
  }
  class Engineer extends Employee{
    int Bonus = 7000;
    int total = salary+Bonus;
  }
  public class Solution15{
    public static void main(String[]args){
        Engineer e = new Engineer();
        System.out.println("Salary  "+e.salary);
        System.out.println("Bonus  "+e.Bonus);
        System.out.print("Total Salary  "+e.total);
    }
}