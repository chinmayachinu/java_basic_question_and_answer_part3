//count negative and positive
import java.util.Scanner;
class Count2
{
public static void main(String args[])
{
System.out.println("enter the number of elements");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int N[]=new int[a];
int i=0;
System.out.println("the numbers are");
for(i=0;i<a;i++)
{
N[i]=sc.nextInt();
}
int p=0,n=0;
for(i=0;i<a;i++)
{
  if(N[i]<0)
     n++;
  if(N[i]>=0)
     p++;
}
System.out.println("positive no.="+p+" negative no.="+n);
}
}