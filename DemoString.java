public class DemoString
{
public static void main(String[] args)
{
String s1="java";
int len1=s1.length();

String s2="program";
int len2=s2.length();

String s3=s1.concat(s2);
int len3=s3.length();

System.out.println("s1:"+ s1);
System.out.println("the length of s1;" +len1);

System.out.println("s2:"+ s2);
System.out.println("the length of s2;" +len2);

System.out.println("s3:"+ s3);
System.out.println("the length of s3;" +len3);

}

}