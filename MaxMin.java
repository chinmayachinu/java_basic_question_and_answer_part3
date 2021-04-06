import java.util.Scanner;
class MaxMin
{
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 number");
		int N[]=new int[10];
		int i,h,s,p1,p2;
		for(i=0;i<10;i++)
		{
			N[i]=sc.nextInt();
	    }
	    h=s=N[0];
	    p1=p2=0;
	    for(i=1;i<10;i++)
	    {
			if(N[i]>h)
			{
				h=N[i];
				p1=i;
			}
			if(N[i]<s)
			{
				s=N[i];
				p2=i;
			}
		}
		System.out.println("Highest no="+h+" position="+(p1+1));
		System.out.println("Smallest no="+s+"position="+(p2+1));
	}
}
