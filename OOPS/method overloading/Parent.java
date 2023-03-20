import java.util.*;
public class Parent {
 Scanner sc = new Scanner(System.in);
 int id;
 String name;
 String address;
 Parent() {
 System.out.println("enter name");
 this.name = sc.next();
 System.out.println("enter address");
 this.address = sc.next();
 System.out.println("enter id");
 this.id = sc.nextInt();
 }
 void display() {
 System.out.println("name is " + name);
 System.out.println("the address is " + address);
 System.out.println("the id is " + id);
 }
 public static void main(String[] args) {
 System.out.println("---parent---");
 Parent p = new Parent();
 p.display();
 System.out.println("---ChildOne---");
 ChildOne c1 = new ChildOne(80);
 c1.display();
 System.out.println("---ChildTwo---");
 ChildTwo c2 = new ChildTwo();
 c2.display();
 }
}
class ChildOne extends Parent {
 Scanner sc = new Scanner(System.in);
 float marks;
 ChildOne(float m) {
 super();
 System.out.println("enter marks");
 this.marks = m;
 }
 void display() {
 super.display();
 System.out.println("the marks is " + marks);
 }
}
class ChildTwo extends Parent {
 Scanner sc = new Scanner(System.in);
 String qualification;
 double salary;
 ChildTwo() {
 super();
 System.out.println("enter qualification");
 this.qualification = sc.next();
 System.out.println("enter salary");
 this.salary = sc.nextDouble();
 }
 void display() {
 super.display();
 System.out.println("qualification is " + qualification);
 System.out.println("salary is " + salary);
 }
}