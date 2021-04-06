//counting of passed student
import java.util.Scanner;
class Count1
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the no of students");
      int n=sc.nextInt();
      int student[]=new int[n];
      System.out.println("marks");
      int i=0;
      for(i=0;i<n;i++)
      {
        student[i]=sc.nextInt();
      }
      int c=0;
      for(i=0;i<n;i++)
      {
        if(student[i]>=50)
            c++;
      }
      System.out.println("student passed="+c);
      double r;
      r=((double)c/n)*100;
      System.out.println("pass rate percentage="+r);
    }
 }