//Intialization through method
class Student
{
int rollno;
String name;
void insertrecord(int r,String n)
{
rollno=r;
name=n;
}
void displayinformation()
{
System.out.println(rollno+" "+name);
}  
}
class TestStudent1
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.insertrecord(55,"A");
s2.insertrecord(66,"B");
s1.displayinformation();
s2.displayinformation();
}
}