
class Student
{
int id;
String name;
}
class TestStudent4
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.id=4;
s1.name="Amit";
s2.id=14;
s2.name="Raj";
System.out.println(s1.id+""+s1.name);
System.out.println(s2.id+""+s2.name);
}
}
