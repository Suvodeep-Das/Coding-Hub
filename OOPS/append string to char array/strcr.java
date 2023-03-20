import java.util.*;
class strcr 
{
 public static void main(String args[])
 { 
 int i;
 String s, sp;
 String str = "Student";
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter a string");
 s=sc.nextLine();
 sp=s.concat(str);
 char ch[] = new char[sp.length()];
 for (i = 0; i <= sp.length(); i++) 
 {
 ch[i] = sp.charAt(i);
 System.out.println(ch[i]);
 }
 }
}
