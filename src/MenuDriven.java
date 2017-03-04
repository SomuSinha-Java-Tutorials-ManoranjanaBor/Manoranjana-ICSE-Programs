/*Question 5
Write a menu driven program to find the sum of the following series depending on the
user choosing 1 or 2
1. S=1/4+1/8+1/12.........upto n terms
2. S=1/1!-2/2!+3/3!.......upto n terms
where ! stands for factorial of the number and the factorial value of a number is the
product of all integers from 1 to that number, e.g. 5! = 1 2 3 4 5.
(use switch-case).
 * 
 */

import java.util.*;
public class MenuDriven 
{
	public static int fact(int a)
	{
		int f = 1 , i ;
		for(i = 1 ; i <= a ; i ++)
		{
			f = f * i ;
		}
		return f ;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("ENTER THE VALUE OF n : ");
		int n = in.nextInt();
		System.out.print("ENTER THE CHOICE BETWEEN 1 & 2 : ");
		int choice = in.nextInt();
		int i ;
		double sum = 0.0 ;
		
		switch(choice)
		{
			case 1 :
				for(i = 4 ; i <= n ; i = i + 4 )
				{
					 sum +=  1.0 / i*0.1 ;
				}
				System.out.println("Sum of series1 : "+sum);
			break ;
			
			case 2 :
				for(i = 1 ; i <= n ;i ++)
				{
					sum += i*0.1/(fact(i)*0.1) ;
				}
				System.out.print("Sum of the series2 : "+sum);
			break;
			
			default:
				System.out.println("WRONG INPUT ....");
				
		}
	}
}
