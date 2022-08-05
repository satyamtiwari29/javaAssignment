class PClass
{
public PClass (int x)
{
System.out.println(x);
}
public PClass (int x,int y)
{
this(x);
System.out.println(y);
}
}


class CClass extends PClass
{
public CClass (int x,int y,int z);
{
super(x,y);
System.out.println(z);
}
public CClass(int x,int y,int z,int p)
{
this(x,y,z);
System.out.println(p);
}
}

public class Inheritance10
{
public static void main(String[] args)
{
CClass ob=new CClass();
CClass(11,12,13,14);
}
}