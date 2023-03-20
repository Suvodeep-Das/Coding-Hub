import java.util.*; 
class extract
{
 public static void main(String args[ ])
 {
 String str1, str2;
 int m=0,n=0;
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter String : ");
 str1 = sc.nextLine();
 System.out.println(" String is : "+str1);
 System.out.print("Enter no. of chracters to be extracted from string : ");
 m = sc.nextInt();
 System.out.print("Enter starting index : ");
 n = sc.nextInt();
 str2=str1.substring(n,(m+n));
 System.out.println(" Extracted String is : "+str2);
 }
}
