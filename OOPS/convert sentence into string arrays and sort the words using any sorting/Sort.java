import java.util.*;
public class sort
{
 static void sort(String []str, int n)
 {
 for (int i=1 ;i<n; i++)
 {
 String temp = str[i];
 int j = i - 1;
 while (j >= 0 && temp.length() < str[j].length()){
 str[j+1] = str[j];
 j--;
 }
 str[j+1] = temp;
 }
 }
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the string:");
 String s = sc.nextLine();
 String[] arr=null;
 arr=s.split(" ");
 int len = arr.length;
 sort(arr,len);
 System.out.print("The sorted array is : ");
 for (int i=0; i<len; i++)
 System.out.print(arr[i]+" ");
 }
}
