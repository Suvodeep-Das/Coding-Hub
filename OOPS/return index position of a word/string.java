class string
{
 static int isSubstring(String s1, String s2)
 {
 return s2.indexOf(s1);
 }
 public static void main( String args[])
 {
 String s1="Tech";
 String s2="University of Technology";
 int res=isSubstring(s1,s2);
 if(res==-1)
 System.out.println("It is not present.");
 else
 System.out.println("Present at index "+res);
 }
}