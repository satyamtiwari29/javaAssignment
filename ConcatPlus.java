public class ConcatPlus
{
public static void main(String[] args)
{
String s1= "java";
String s2="is progaramming";
String s3="language";


System.out.println("=====Using Conacat method=========");
String s4=s1.concat(s2).concat(s3);


System.out.println("By the concat method result is"+"  "+s4);

System.out.println("========Using Plus Symbol=======");
String s5=(s1+"  "+s2+"  "+s3);

;
System.out.println("By the plus symbol result is"+"  "+ s5);
}
}