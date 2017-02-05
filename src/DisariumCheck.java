import java.util.*;
public class DisariumCheck 
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
		Scanner in = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER TO CHECK WHETHER IT IS DISARIUM NUMBER : ");
		int n = in.nextInt();
		int nnum = n ;
		int s = 0 , d , nod;
		while(n != 0)
		{
			d = n % 10 ;
			nod = countDigit(n);
			s += (int)Math.pow(d,nod);
			n = n / 10 ;
		}
		if(s == nnum)
		{
			System.out.print("THE NUMBER IS DISARIUM NUMBER ...");
		}
		else
		{
			System.out.print("THE NUMBER IS NOT A DISARIUM NUMBER ...");
		}
	}
}
