import java.util.*;
public class SumOfDigit 
{
    public static int sumDigit (int a)
    {
    	int s=0,d;
    	while(a>0)
    	{
    		d = a % 10 ;
    		s=s+d;
    		a=a/10;
    		a++;
    	}
    	return s;
    }
    
    public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
    	System.out.print("ENTER A NUMBER : ");
    	int n = in.nextInt();
    	int sum = sumDigit(n);
    	System.out.println("SUM OF DIGIT : "+sum);
    	
    }
}
