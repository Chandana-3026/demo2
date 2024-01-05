class Circle
{
int radius;
void insert(int r)
{
radius=r;
}
void display()
{
System.out.println("Area of circle="+3.14*radius*radius);//3.14*r*r
System.out.println("Perimeter of circle="+2*3.14*radius);//perimeter of 2*3.14*radius
}
}
class TestCircle
{
public static void main(String args[])
{
Circle c1=new Circle();
Circle c2=new Circle();
c1.insert(5);
c2.insert(8);
c1.display();
c2.display();            
}
}
