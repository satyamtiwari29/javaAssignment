import java.util.Scanner;
public class CompareString
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);

System.out.println("Enter The String1");
 String s1=s.nextLine();

System.out.println("Enter the String2");
String s2=s.nextLine();

System.out.println("======equals()===========");

boolean k=s1.equalsIgnoreCase(s2);

if(k)
{
System.out.println("Strings are equal");
}
else
{
System.out.println("Strings are not equals");
}


System.out.println("======compareTo()===========");
int z=s1.compareToIgnoreCase(s2);
if(z==0)
{
System.out.println("s1 is equal to s2");
}
else if(z<0)
{
System.out.println("s1 is less than s2");
}
else if(z>0)
{
System.out.println("s1 is greater than s2");
}
}
}