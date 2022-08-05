import java.util.Scanner;
public class DemoArray1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println(" Enter the Number of Integer object");
int n=sc.nextInt();
Integer a[]=new Integer[n];
System.out.println("Enter"+n+"Integer");

for(int i=0;i<a.length;i++)
{
a[i]=new Integer(sc.nextInt());
}
System.out.println("=======Display using Old loop====== ");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i].toString()+" ");
}
System.out.println("=======Display Using inhanced loop====== ");
for(Integer k :a)
{
System.out.print(k.toString()+" ");
}
System.out.println("========Display using Spliterator======= ");
spliterator<Integer>sp= Arrays.spliterator(a);
sp.forEachRemaining((z)->
{
System.out.println(z.toString()+" ");
});
}
}