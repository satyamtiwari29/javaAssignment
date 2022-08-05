class PClass
{
public PClass()
{
System.out.println("=====PClass===========");
}
}
class CChild extends PClass
{
public CChild()
{
System.out.println("========CChild======");
}
}
class Inheritance4
{
public static void main(String[] args)
{
CChild ob =new CChild();
}
}
