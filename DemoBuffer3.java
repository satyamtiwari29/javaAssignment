public class DemoBuffer3
{
public static void main(String[] args)
{
StringBuffer sb=new StringBuffer("nit");
System.out.println("sb"+ sb.toString());
System.out.println("Capacity "+ sb.capacity());
System.out.println("Length"+sb.length());

sb.append("jre");
System.out.println("sb"+sb.toString());
System.out.println("Capacity"+sb.capacity());
System.out.println("Length"+ sb.length());
}
}