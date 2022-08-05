import java.util.Scanner; 

class Addition
{

public void add(int x,int y)
{
int sum1=x+y;
System.out.println("Sum1"+" "+sum1);
}
public void add(int x,int y,int z)
{
int sum2=x+y+z;
System.out.println("sum2"+" "+sum2);
}
public void add(int x,float y)
{
float sum3 =x+y;
System.out.println("Sum3"+" "+sum3);
}
}
 public class Inheritance8 extends Addition
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
Addition ad=new Addition();
System.out.println("======Choice========");

System.out.println("1.add(int,int)\n 2.add(int,int,float)\n 3.add(int,float)\n");
System.out.println("Enter the choice");
int choice;
choice=s.nextInt();

switch(choice)
{
case 1:
System.out.println("Enter the int number");
 int val1=s.nextInt();
System.out.println("Enter the int number");
int val2=s.nextInt();
ad.add(val1,val2); 
break;


case 2:
 
System.out.println("Enter the int number");
int v1=s.nextInt();
System.out.println("Enter the int number");
int v2=s.nextInt();

System.out.println("Enter the int number");
int v3=s.nextInt();

ad.add(v1,v2,v3);
break;

case 3:

System.out.println("Enter the int number");
int v11=s.nextInt();
System.out.println("Enter the float number");
float v22=s.nextFloat();

ad.add(v11,v22);
break;
default :
System.out.println("Invalid choice........");
}



}
}