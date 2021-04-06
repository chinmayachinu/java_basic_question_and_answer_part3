//area of scalar triangle
import java.util.Scanner;
class Area
{
    public static void main(String args[])
      {
              Scanner sc=new Scanner(System.in);
              System.out.println("enter three sides");
              double a=sc.nextDouble();
              double b=sc.nextDouble();
              double c=sc.nextDouble();
              double s,area;
              s=(a+b+c)/2;
              area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
              System.out.println("area="+area);
      }
}