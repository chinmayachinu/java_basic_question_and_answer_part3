//find the average of n number
import java.util.Scanner;
class Average
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter how many number u want to average");
         int n=sc.nextInt();
         int i,s=0,number;
         for(i=1;i<=n;i++)
         {
            number=sc.nextInt();
            s=s+number;
         }
         double avg;
         avg=(double)s/n;
         System.out.println("the value of avg="+avg);
      }
 }