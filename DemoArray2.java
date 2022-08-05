import java.util.*;
public class DemoArray2
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of Integer ");
int n=s.nextInt();


Integer a[]=new Integer [n];
System.out.println("Enter the Integer Object");


for(int i=0;i<a.length;i++)
{
a[i]=new Integer(s.nextInt());
}
System.out.println("==========Display using old loop======");
for(int j=0;j<a.length;j++)
{
System.out.print(a[j].toString()+" ");
}

System.out.println("\n=======Display using for each loop======");
for(Integer k:a)
{
System.out.print(k.toString()+" ");
}

System.out.println("\n======Display using spliterator=======");
Spliterator <Integer> sp=Arrays.spliterator(a);
sp.forEachRemaining((z)->
{
System.out.println(z.toString()+" ");
});
}
}