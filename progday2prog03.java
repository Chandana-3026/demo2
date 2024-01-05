import java.util.Scanner;
class Test5
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);//object is created for Scanner
char c=scob.next().charAt(0);
if((c>= 'A' && c<='Z')||(c>='a' && c<='z'))
{
System.out.println("ALPHABET");
}
else
{
System.out.println("NOT ALPHABET");
}
if((c=='!')||(c=='@')||(c=='#')||(c=='%')||(c=='*')||(c=='(')||(c==')')||(c=='+')||(c=='-')||(c=='<'))
{
System.out.println("SYMBOL");
}
else if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')||(c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
{
System.out.println("VOWEL");
}
else if
{
System.out.println("Consonant");
}
else
{
System.out.println("consonant");
}
}