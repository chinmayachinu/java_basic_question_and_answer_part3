import java.util.Scanner;
class Common
{
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		int A[]=new int[10];
		int B[]=new int[10];
		int i,j;
		System.out.println("enter the elements to array");
		for(i=0;i<=9;i++)
		{
			A[i]=sc.nextInt();
		}
		for(j=0;j<10;j++)
		{
			B[j]=sc.nextInt();
		}

		System.out.println("the common array elements are");
		for(i=0;i<10;i++)
		{
			for(j=0;j<=9;j++)
			{
				if(A[i]==B[j])
				   	System.out.println(A[i]);
			}
		}
	}
}

