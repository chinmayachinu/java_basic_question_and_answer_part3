//Harmonic mean
import java.util.Scanner;
class Harmonic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of data values");
        int n=sc.nextInt();
        double s=0,H;
        int i;
        for(i=1;i<=n;i++)
        {
            s=s+(1.0/i);
        }
        System.out.println("the harmonic mean is "+((double)n/s));
     }
}
