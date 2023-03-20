import java.util.*;
public class Complex{
public static class complexnumber
{
 double real;
  double imaginary;
  complexnumber(){}
  complexnumber(double real,double imaginary)
{
  this.real=real;
  this.imaginary=imaginary;
}
}

public static complexnumber sum(complexnumber x, complexnumber y)
{
  complexnumber obj= new complexnumber();
  obj.real=x.real+y.real;
  obj.imaginary=x.imaginary+y.imaginary;
  return obj; 
}

 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  complexnumber num1=new complexnumber();
  complexnumber num2=new complexnumber();
  System.out.println("Enter the first real part of complex number: ");
  num1.real=sc.nextDouble();
  System.out.println("Enter the first imaginary part of complex number: ");
  num1.imaginary=sc.nextDouble();
  System.out.println("Enter the second real part of complex number: ");
  num2.real=sc.nextDouble();
  System.out.println("Enter the second imaginary part of complex number: ");
  num2.imaginary=sc.nextDouble();
  complexnumber ans= sum(num1,num2);
  System.out.println("The addition of two complex number is: "+ans.real+"+"+ans.imaginary+"i"); 
}
}