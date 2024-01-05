//Intialization through method
class Student
{
int rollno;
String name;
void display(int r,String n)
{
rollno=r;
name=n;
}
void print()
{
System.out.println(rollno+" "+name);
}  
}
class TestStudentt
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.display(55,"yes");
s2.display(66,"no");
s1.print();
s2.print();
}
}