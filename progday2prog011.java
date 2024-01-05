class Employee
{
int rollno;
String name;
String dept;
void insertrecord(int r,String n,String d)
{
rollno=r;
name=n;
dept=d;
}
void displayinformation()
{
System.out.println(rollno+" "+name+" "+dept);
}  
}
class TestEmployee
{
public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
Employee e4=new Employee();
Employee e5=new Employee();
e1.insertrecord(3003,"Yashu","AI&DS");
e2.insertrecord(3008,"Nadiya","AI&DS");
e3.insertrecord(3026,"Chandana","AI&DS");
e4.insertrecord(544,"Geethika","CSE");
e5.insertrecord(505,"Roshini","CSE");
e1.displayinformation();
e2.displayinformation();
e3.displayinformation();
e4.displayinformation();
e5.displayinformation();
}
}
