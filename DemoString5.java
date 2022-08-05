import java.util.Scanner;

public class DemoString5
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the  first String");
String s1=sc.nextLine();

System.out.println("Enter the Second String");
String s2= sc.nextLine();

System.out.println("=========equals()=========");

boolean k=s1.equalsIgnoreCase(s2);

if(k)
{
System.out.println("Strings are equal");
}
else
{
System.out.println("Strings are not equal");
}


System.out.println("=========compareToIgnoreCase================");


int z=s1.compareToIgnoreCase(s2);
if(z==0)
{
System.out.println("String Are equal");

}
else if(z>0){
System.out.println(" s1 is greater than s2");
}
else if(z<0)
{
System.out.println("s1 is less than s2 ");
}

}
}