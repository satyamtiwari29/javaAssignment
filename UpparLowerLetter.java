import java.util.*;
public class UpparLowerLetter
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println(" Enter the String ");
String s=sc.nextLine();
int len=s.length();



int v=0,l=0,n=0;
for(int i=0; i<=len-1;i++)
{
char ch=s.charAt(i);
{
switch(ch)
{
case 'a':
case 'A': v++;
break;

case 'e':
case 'E': v++;
break;

case 'i':
case 'I': v++;
break;

case 'o':
case 'O': v++;
break;

case 'u':
case 'U': v++;
break;

}
int k=(int)ch;

if( (k>=65&& k<90) ||(k>=97&&k<=122))
{
l++;
}
if(k>=48 && k<=57)
{
n++;
}

}

}
System.out.println(" Count of consonants: "+(l-v));
System.out.println(" Counts of Vowels:"+ v);
System.out.println(" Count of Numbers:"+n);

}
}