/*Java Program to check automorphic number. Write a program in java to accept a number from user and check 
 * if it is an automorphic number or not. An automorphic number is a number whose square ends in the same digits as the number
 *  itself. For example, 6 = 36, 5 = 25, 25 = 625 are automorphic numbers.
 */
import java.util.*;
public class AutomorphicNumber 
{
	public static int countDigit(int a)
	{
		int c = 0 ;
		while(a > 0)
		{
			a = a / 10 ;
			c ++;
		}
		return c;
	}
	public static void main (String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER A NUMBER : ");
		int n = in.nextInt(),d=0;
		int new_num = n ;
		int nod = countDigit(n);
		int sq = n * n ;
		double k;
		k = sq % ((int) Math.pow (10.0 , nod)) ;
		d=(int)k;
		if(d==new_num)
		{
			System.out.println("THE NUMBER IS AUTOMORPHIC NUMBER .......... ");
		}
		else
		{
			System.out.println("THE NUMBER IS NOT AUTOMORPHIC NUMBER .......... ");
		}
		
	}
}
