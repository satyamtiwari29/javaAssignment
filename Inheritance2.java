import java.util.Scanner;
class Product
{
public String PCode,PName;
public float pPrice;
public int PQty;
public void getProduct()
{
System.out.println("=======Product Detail=======");
System.out.println("PCode"+ PCode);
System.out.println("PName"+PName);
System.out.println("pPrice"+pPrice);
System.out.println("PQty"+PQty);
}
}
class Read extends Product
{
public void Read(Scanner s)
{
System.out.println("Enter the PCode");
super.PCode= s.nextLine();
System.out.println("Enter the PName ");
super.PName=s.nextLine();
System.out.println("Enter the pPrice");
super.pPrice=s.nextFloat();
System.out.println("Enter the PQty ");
super.PQty=s.nextInt();

}
}
class Display extends Read
{
public void dis()
{
super.getProduct();
}
}
public class Inheritance2
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
Display d=new Display();
d.Read(s);
d.dis();
}
}