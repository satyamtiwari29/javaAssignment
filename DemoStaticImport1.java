import java.util.Scanner;
import static java.lang.Math.*;

public class DemoStaticImport1
{
public static void main(String[] args)
{

 Scanner sc=new Scanner(System.in);


System.out.println("Enter the number");

double val=sc.nextDouble();

double result=sqrt(val);

System.out.println("the sqrt of the"+val+"is"+result);
sc.close();

}
}