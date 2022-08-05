import java.util.*;
class DemoArray3
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of String");
int n=Integer.parseInt(s.nextLine());

String a[]=new String[n];

System.out.println("Enter the String");
for(int i=0;i<a.length;i++)
{
a[i]=s.nextLine();
}
System.out.println("====Display using old for loop===");
for(int j=0;j<a.length;j++)
{
System.out.print(a[j].toString()+" ");
}

System.out.println("\n====Display using for each loop===");
for( String k: a)
{
System.out.print(k.toString()+" ");
}

System.out.println("\n ===Display using Spliterator=====");
Spliterator sp=Arrays.spliterator(a);
sp.forEachRemaining((z)->
{
System.out.print(z.toString()+" ");
});
}
}