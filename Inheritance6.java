class PClass
{
public  void calculate(int x)
{
System.out.println("===========PClass calculate()======");
System.out.println("Cube"+ Math.pow(x, 3));
}

}

class CClass extends PClass
{
public void calculate(int x)
{
System.out.println("===========CChild calculate=========");
System.out.println("Sqare"+ Math.sqrt(x));
}
}

class Inheritance6
{
public static void main(String[] args)
{
CClass ob=new CClass();
ob.calculate(25);
}
}