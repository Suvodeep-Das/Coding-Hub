import java.util.*;
class pass
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the first name: ");
 String s = sc.nextLine();
 System.out.println("enter the middle name: ");
 String a = sc.nextLine();
 System.out.println("enter the last name: ");
 String p = sc.nextLine();
 System.out.println("enter the roll no: ");
 int r = sc.nextInt();
 while(a!=" ")
 {
 char f=s.charAt(0);
 char m=a.charAt(0);
 char l=p.charAt(0);
 String x=" ";
 String c1=x+f+m+l;
 System.out.print("The password is:");
 int digit=r%10000;
 String str=c1+""+digit;
 System.out.print(str);
 break;
 }
 }
}
