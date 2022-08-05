class PClass
{
public static int a=10;
public static void m1()
{
System.out.println("================PClass m1============");
System.out.println("The value of a"+ a);
}

static
{
System.out.println("===============Static Block=========");
System.out.println("The value of a"+a);
}
}

class CClass extends PClass
{
public static int b=20;
public static void m2()
{
System.out.println("==============CClass m2===============");
System.out.println("The value of b"+" "+b);
}
static
{
System.out.println("================= Static Block =====================");
System.out.println("The value of b"+" "+b);
}
}

public class Inheritance5
{
public static void main(String[] args)
{

System.out.println("==============Display using Class name");
CClass.m1();
CClass.m2();

System.out.println("===============Display using Object Reference");
CClass ob=new CClass();
ob.m1();
ob.m2();
}

}