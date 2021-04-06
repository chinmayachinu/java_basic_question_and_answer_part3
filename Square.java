//sum of the square of n numbers
import java.util.Scanner;
class Square
{
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("to how many terms u want to do");
		int n=sc.nextInt();
		int i,s=0;
		for(i=1;i<=n;i++)
		{
			s=s+(i*i);
	    }
        System.out.println("the sum of the square of "+n+" numbers="+s);
    }
}