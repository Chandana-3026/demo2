import java.util.Scanner;
class If_Else_example
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int i=scob.nextInt();
int j=scob.nextInt();
if(j==0)
{
System.out.println("Division by zero");
}
else
{
System.out.println(i+"divided by"+j+"is"+(i/j));
i=i+j;
}
}
}