public class DemoStringBuffer
{
public static void main(String[] args)
{
StringBuffer sb=new StringBuffer();
System.out.println("Default Capacity"+sb.capacity());
System.out.println("Default length"+sb.length());

sb.append("java");
System.out.println(" sb"+ sb.toString());
System.out.println("Capacitiy"+sb.capacity());
System.out.println("Length"+sb.length());

sb.append("program");
System.out.println("sb"+sb.toString());
System.out.println("Capacity"+sb.capacity());
System.out.println("length"+ sb.length());

sb.append("language");
System.out.println("sb"+sb.toString());
System.out.println("Capacity"+sb.capacity());
System.out.println("Length"+sb.length());

sb.insert(4 ,"version 17 by 2021");
System.out.println("sb"+sb.toString());
System.out.println("Capacity "+sb.capacity());
System.out.println("length"+sb.length());

sb.delete(4,22);
System.out.println("sb"+sb.toString());
System.out.println("Capacity "+sb.capacity());
System.out.println(" length"+sb.length());

System.out.println("================String Reverse========");

System.out.println(" Reverse" +sb.reverse());
}
}