public class PClass
{
int a=10;
public void m1()
{
System.out.println("===== PClass m1=======");
System.out.println("The value of a is"+"  "+a);
}
{
System.out.println("===== PClass Instance Block=====");
System.out.println("The value of a"+" "+ a);
}
}

class CChild extends PClass
{
int b=20;
public void m2()
{
System.out.println("========CClass m2=======");
System.out.println("The value of b"+" "+ b);
}
{
System.out.println("======== CChild Instance Block========");
System.out.println("The value of b"+" "+ b);

}
}
class DemoInheritance
{
public static void main(String[] args)
{
CClass ob=new CClass();
ob.m1();
ob.m2();
}
}