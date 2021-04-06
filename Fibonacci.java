import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of term");
		int n=sc.nextInt();
		int F[]=new int[n];
		int i;
		F[0]=0;
		F[1]=1;
		for(i=2;i<n;i++)
		{
			F[i]=F[i-1]+F[i-2];
		}
		System.out.println("First"+n+"terms of fibonacci");
		for(i=0;i<n;i++)
		{
			System.out.println(F[i]+" ");
		}
	}
}


