import java.util.*;
class length
{
 public static void main(String args[])
 {
 String str;
 int len=0;
 int l=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the string:");
 str=sc.nextLine();
 len=str.length();
 System.out.println("The length of the string with spaces is "+len);
 str=str.replaceAll("\\s","");
 l=str.length();
 System.out.println("The length without space is "+l);
 }
}