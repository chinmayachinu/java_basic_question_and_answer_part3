//Dynamic initialization of irregualr array
import java.util.Scanner;
class Array
{
	int A[][],i,j,c,r;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows");
		r=sc.nextInt();
		A=new int[r][];
		for(i=0;i<r;i++)
		{
			System.out.println("Enter the no of column for row"+(i+1));
			c=sc.nextInt();
			A[i]=new int[c];
			System.out.println("Enter "+c+" elements of row "+(i+1));
			for(j=0;j<c;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
	}
	public void display()
	{
		for(i=0;i<r;i++)
		{
			for(j=0;j<A[i].length;j++)
			{
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
class IrregularArray
{
	public static void main(String args[])
	{
		Array a=new Array();
		a.input();
		a.display();
	}
}

