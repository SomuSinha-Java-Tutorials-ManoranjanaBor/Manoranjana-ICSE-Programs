/*
 * Harshad Number also called Niven Number is a number that is divisible by the sum of its digits.
 *  Example: Number 200 is a Harshad Number because sum of digits 2 and 0 and 0 is 2(2+0+0) and 200 is divisible by 2. 
 */
import java.util.*;
public class NivenCheck 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER A NUMBER TO CHECK WHETHER IT IS NIVEN NUMBER OR NOT : ");
		int n = in.nextInt();
		int s = 0 , d ;
		int nnum = n ;
		
		
		while(n>0)
		{
			d = n % 10 ;
			s = s + d ;
			n = n / 10 ;
		}
		if((nnum % s ) == 0)
		{
			System.out.println("THE NUMBER IS A NIVEN NUMBER ....");
		}
		else
		{
			System.out.println("THE NUMBER IS NOT A NIVEN NUMBER ....");
		}
	}
}
