/*Question 8
Write a program to calculate the sum of all the prime numbers between the range of
1 and 100. 
 * 
 */
import java.util.*;
public class SumPrime
{
	public static int prime(int a)
	{
		int flag = 0 , j ;
		for( j = 2 ; j < a ; j++)
		{
			if((a%j)==0)
			{
				flag = 1 ; 
			}
		}
		return flag ;
	}
	
	public static void main(String args [])
	{
		Scanner in = new Scanner (System.in);
		int n = 100;
		int i , sum = 0 ;
		System.out.println(prime(5));
		for( i = 1 ; i <= n ; i++)
		{
			if(prime(i) == 0 )
			{
				sum = sum + i ;
			}
		}
		System.out.println("THE SUM OF THE PRIME NUMBER BETWEEN 1 TO 100 : " + sum);
	}
}
