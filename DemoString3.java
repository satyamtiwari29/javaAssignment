import java.util.Scanner;
class DemoString3
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the String");

String str= sc.nextLine();
int len1=str.length();
int count=0;
for(int i=0; i<=len1-1; i++)
{
char ch=str.charAt(i);

switch(ch)
{
case 'a':
case 'A': count++;
break;

case 'e':
case 'E': count++;
break;


case 'i':
case 'I':count++;
break;

case 'o':
case 'O':count++;
break;

case 'u':
case 'U': count++;
break;
}

}
System.out.println(count);
sc.close();
}
}