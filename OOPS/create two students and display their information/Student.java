class Student
{
    String name,stream,college;
    char grade;
    int roll;
    public Student(String n,String s,String c,char g,int r)
    {
        name=n;
        stream=s;
        college=c;
        grade=g;
        roll=r;
    }
    public void display()
    {
     System.out.println("NAME : "+this.name); 
     System.out.println("ROLL_NO : "+this.roll); 
     System.out.println("STREAM : "+this.stream); 
     System.out.println("COLLEGE : "+this.college); 
     System.out.println("GRADE : "+this.grade);
    }
    public static void main(String args[])
    {
       Student s1=new Student("Suvodeep Das","CSE","IEM",'B',90);
       Student s2=new Student("Amlan Das","IT","IEM",'A',95); 
       s1.display();
       s2.display(); 
        
    }
}
