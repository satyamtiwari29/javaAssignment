import java.util.Scanner;


class DisplayPrimeNum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the Number");
int n=sc.nextInt();
System.out.println("Prime Number is:");


if(n>0)
{
for(int i=1;i<=n;i++)
{
int count=0;

for(int j=1;j<=n; j++)
{
 if(i%j==0)
{
count++;
}

}

if(count==2)
{
System.out.print(i +" ");
}

}} 
else{
System.out.println("Invalid Number");

}
}
}