//Union of set
import java.util.Scanner;
class DemoSet
{
	int i,j,m,n;
	int []A,B;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements of set A");
		m=sc.nextInt();
		A=new int[m];
		System.out.println("Enter no of elements of set B");
		n=sc.nextInt();
		B=new int[n];
		System.out.println("Enter elements to set A");
		for(i=0;i<m;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("Enter elements to set B");
		for(j=0;j<n;j++)
		{
			B[j]=sc.nextInt();
		}
	}
	public void union()
	{
		int c=0;
		System.out.println("A U B ");
		for(i=0;i<m;i++)
		{
			System.out.println(A[i]);
		}
		for(j=0;j<n;j++)
		{
			c=0;
			for(i=0;i<m;i++)
			{
				if(A[i]==B[j])
					c++;
			}
			if(c>=1)
				continue;
			else if(c==0)
				System.out.println(B[j]);
		}
	}
}
class UnionSet
{
	public static void main(String args[])
	{
		DemoSet ds=new DemoSet();
		ds.input();
		ds.union();
	}
}
