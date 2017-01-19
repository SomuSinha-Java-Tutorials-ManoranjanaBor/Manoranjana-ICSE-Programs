import java.util.*;
public class Series
{
  public static void main(String args[])
  {
      Scanner in= new Scanner(System.in);
      System.out.print("Enter a number : ");
      int n=in.nextInt();
      double s=1.0;
      int i;
      double p=1.0;
      double S=0.0; 
      for(i=2;i<=n;i++)
      {
          s=s+i;
          p=p*i;
          S=s/p;
      }
      System.out.print(S);
    }
}
     