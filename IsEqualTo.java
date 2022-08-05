public class IsEqualTo
{
public static void main(String[] args)
{
String s1="java";
String s2="java";
String s3=new String("java");
String s4=new String("java");

System.out.println("========Using String literal Process=========");
if(s1==s2)
{
System.out.println("s1 is equal to s2");
}
else
{
System.out.println("s1 is not equal to s2");
}

System.out.println("========Using equal to operator=========");
if (s3==s4)
{
System.out.println("s1 is equal to s2");
}
else
{
System.out.println("s1 is not equal to s2");
}
}
}