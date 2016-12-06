import java.io.*;
class ArmstrongNumber
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int n,rem,sum=0,number=0;
System.out.println("Number:");
n=Integer.parseInt(in.readLine());
number=n;
while(n!=0)
{
rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(sum==number)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not an Armstrong Number");
}
}
catch(Exception e)
{
}
}
}
