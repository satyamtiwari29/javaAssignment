import java.util.Scanner;
public class CountVowels
{
public static void main(String[] args)
{

Scanner s=new Scanner(System.in);
System.out.println("Enter The String");
String str=s.nextLine();
int len1=str.length();


int count=0;
for(int i=0;i<=len1-1;i++)
{
char ch=str.charAt(i);
switch(ch)
{
case 'a':
case 'A':count++;
break;

case 'e':
case 'E': count++;
break;

case 'i':
case 'I': count++;
break;

case 'o':
case 'O': count++;
break;

case 'u':
case 'U': count++;
break;

}

}
System.out.println("The vowels count is"+count);
}
}