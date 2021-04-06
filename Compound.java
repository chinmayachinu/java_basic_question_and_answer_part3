//compound interest
class Compound
{
    public static void main(String args[])
       {
          double p=7500,r=4.5,a,ci;
          int t=5;
          a=p*Math.pow(1+(r/100),t);
          ci=a-p;
          System.out.println("compound interest="+ci);
          System.out.println("amount="+a);
        }
}