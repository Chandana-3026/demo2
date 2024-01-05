//program to find a given character is digit or not
import java.util.Scanner;
class Test3
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
if((c=='0')||(c=='1')||(c=='2')||(c=='3')||(c=='4')||(c=='5')||(c=='6')||(c=='7')||(c=='8')||(c=='9'))
System.out.println("YES");
else
System.out.println("NO");
}
}
//In this it considers only first digit or first alphabet and gives us either it is yes or no(ex:y2-no,2y-yes)