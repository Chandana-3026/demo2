//program to find whether a gien character is vowel or not
import java.util.Scanner;
class Test4
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);//object is created for Scanner
char c=scob.next().charAt(0);
if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')||(c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
System.out.println("YES");
else
System.out.println("NO");
}
}