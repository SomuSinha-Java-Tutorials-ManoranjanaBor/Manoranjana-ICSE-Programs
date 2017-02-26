/*	
 * 	PROGRAM TO TAKE N AS INPUT FOR THE NUMBER OF STUDENTS IN AN ARRAY .
 *	ROLL NO , NAME , MARKS OF THREE SUBJECTS, THERE AVERAGE AND PRINT ACCORDINGLY....
 *
 */
import java.util.*;
public class Remark 
{
	public static void main(String args [])
	{
		Scanner in = new Scanner(System.in);
		System.out.print(" ENTER THE NUMBER OF STUDENTS : ");
		int n = in.nextInt() , i;
		
		int rno[] =new int[n];
		String name[] =new String[n];
		int m1[] =new int[n];
		int m2[] =new int[n];
		int m3[] =new int[n];
		int avg = 0;
		
		for(i = 0 ; i < n ; i ++)
		{
			System.out.println(" ENTER THE DETAILS OF THE STUDENT : ");
			rno[i] = in.nextInt() ;
			name[i] = in.nextLine() ;
			m1[i] = in.nextInt() ;
			m2[i] = in.nextInt() ;
			m3[i] = in.nextInt() ;
		}
		
		for(i = 0 ; i < n ; i ++)
		{
			avg = (int)((m1[i] + m2[i] + m3[i])/3.0);
			if((avg >= 85)&&(avg <= 100))
			{
				System.out.println("EXCELLENT ....");
			}
			else if((avg >= 75)&&(avg <= 84))
			{
				System.out.println("DISTINCTION ....");
			}
			else if((avg >= 60)&&(avg <= 74))
			{
				System.out.println("FIRST CLASS ....");
			}
			else if((avg >= 40)&&(avg <= 59))
			{
				System.out.println("PASS ....");
			}
			else
			{
				System.out.println("POOR ....");
			}
		}
		
	}
}
