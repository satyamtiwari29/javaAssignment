public class DemoString11
{
public static void main(String[] args)
{
String s1="java";
int len1=s1.length();

String s2="progarmmimg";
int len2=s2.length();


String s3=s1.concat(s2);
int len3=s3.length();

System.out.println("s1"+s1);

System.out.println("s1 length"+ len1);

System.out.println("s2"+s2);
System.out.println("s2 length"+ len2);

System.out.println(s3.toString());
System.out.println("s3 length"+ len3);
}
}