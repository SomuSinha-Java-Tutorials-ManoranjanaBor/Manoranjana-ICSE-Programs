import java.util.*;
public class NelsonCheck 
{
	public static int countDigit(int a)
	{
		int c = 0 ;
		while(a>0)
		{
			a=a/10;
			c++;
		}
		return c;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER A NUMBER TO CHECK WHETHER IT IS NELSON OR NOT : ");
		int n = in.nextInt(),d=0,r=0,m=0,cc=0,i;
		int new_num = n ;
		while((n>0)&&(countDigit(n)>=3))
		{
			d = n % 10 ;
			if(countDigit(n)>=3) 
			{
				cc = countDigit(n);
				
				for(i = (cc-1);i>=0;i--)
				{	
					m = (int) Math.pow (10,(i));
					r = d*m + r;
					System.out.println(r+","+m);
				}
			}
			n = n / 10 ;
		}
		if((r == new_num)&&(countDigit(r)>=3))
		{
			System.out.println("the number is nelson number. "+r+","+new_num);
		}
		else
		{
			System.out.println("the number is not nelson number. "+r+","+new_num+","+d);
		}
	}
}
