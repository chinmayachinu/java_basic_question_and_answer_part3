//sum of n number
import java.util.Scanner;
class Summation
{
	static int sum(int x,int y,int z)
	{
		int s;
		s=x+y+z;
		return s;
	}
	public static void main(String args[])
	{
		System.out.println("enter 3 number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int h=sum(a,b,c);
		System.out.println("the sum is="+h);
	}
}