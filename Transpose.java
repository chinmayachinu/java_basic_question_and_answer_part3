//Transpose of a matrix
import java.util.Scanner;
class Matrix
{
	int [][]A,T;
	int i,j,m,n;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a m*n matrix");
		m=sc.nextInt();
		n=sc.nextInt();
		A=new int[m][n];
		T=new int[n][m];
		System.out.println("Enter "+(m*n)+" elements to matrix A");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
	}
	public void transpose()
	{
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				T[j][i]=A[i][j];
			}
		}
	}
	public void display()
	{
		System.out.println("The transpose matrix is");
		for(j=0;j<n;j++)
		{
			for(i=0;i<m;i++)
			{
				System.out.print(T[j][i]+"\t");
			}
			System.out.println();
		}
	}
}
class Transpose
{
	public static void main(String args[])
	{
		Matrix mx=new Matrix();
		mx.input();
		mx.transpose();
		mx.display();
	}
}

