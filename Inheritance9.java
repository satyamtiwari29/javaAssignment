class PClass 
{
public int a=100;
public void m(int x)
{
System.out.println(x);
}
}


class CClass extends PClass
{
public int a=200;
public void m(int x,int y)
{
super.m(x);
System.out.println(y);
}

public void m(int x,int y,int z)
{
this.m(x,y);
System.out.println(z);
}

public void dis()
{
System.out.println("=======Display=========");
System.out.println(this.a);
System.out.println(super.a);
}
}


public class Inheritance9
{
public static void main(String[] args)
{
CClass ob=new CClass();
ob.m(11,12,13);
ob.dis();

}
}
