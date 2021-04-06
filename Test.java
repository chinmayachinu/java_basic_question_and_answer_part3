//test whether wired or not
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		if(n%2!=0)
			System.out.println("weired");
		else
			{
				if(n>2 && n<5)
					System.out.println("not weired");
				if(n>6 && n<20)
					System.out.println("weired");
				if(n>20)
					System.out.println("not weired");
			}
	}
}