 import java.util.*;
class Product
{
 public String pCode,pName;
public float pPrice;
public int pQty;
public Product(String pCode,String pName,float pPrice,int pQty)
{
this.pCode=pCode;
this.pName=pName;
this.pPrice=pPrice;
this.pQty=pQty;
}
public String toString()
{
return pcode+"\t"+pName+"\t"+pPrice+"\t"+pQty;
} 


}

public class DemoArray4
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);

System.out.println("Enter the number of Products");
int n=Integer.parseInt(s.nextLine);
Product p=new Product[n];
System.out.println("Enter n product ");
for(int i=0;i<p.length;i++)
{
System.out.println("Enter the pCode");
String pC=s.nextLine();

System.out.println("Enter the pName ");
String pN=s.nextLine();

System.out.println("Enter the pPrice ");
float pP=Float.parseFloat();

System.out.println("Enter the pQty ");
int pQ=Integer.parseInt(s.nextLine());
p[i]=new Product(pC,pN,pP);
}
System.out.println("=====Display Using For loop===");
for(int i=0;i<p.length;i++)
{
System.out.println(p[i].toString()+" ");
}

}
}