import java.util.Scanner;
class ReverseNum
{ 
public static void main(String[] args)
{
System.out.println("Enter the Number");
Scanner sc=new Scanner(System.in);

int num=sc.nextInt();
int r=0;
while(num>0)
{
int c=num%10;
r=r*10+c;
num=num/10;
} 
System.out.println("The Reverse num" +"  " +r);
}

}
