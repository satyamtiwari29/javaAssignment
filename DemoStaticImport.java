import java.util.Scanner;
import static java.lang.Math.*;
public class DemoStaticImport
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");

double value=sc.nextDouble();
double result= sqrt(value);
System.out.println("The sqrt of "+value + "is"+result);
sc.close();
}


}
