 /*A number is said to be special number when the sum of factorial of its digits is equal to the number itself. 
  * Example- 145 is a Special Number as 1!+4!+5!=145.
  */
import java.util.*;
public class SpecialNumber 
{
	public static int fact(int a)
	{
		int f=1,i;
		for(i = 1 ; i <= a ; i++ )
		{
			f=f*i;
		}
		return f ;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("ENTER A NUMBER TO CHECK WHETHER IT IS SPECIAL OR NOT : ");
		int n = in. nextInt();
		int  d , s = 0 ;
		int nnum = n ;
		while(n>0)
		{
			d = n % 10 ;
			s = s + fact(d);
			n = n / 10 ;
		}
		if(nnum == s)
		{
			System.out.println("THE NUMBER IS SPECIAL ... ");
		}
		else
		{
			System.out.println("THE NUMBER IS NOT SPECIAL ... ");
		}
	}
}
