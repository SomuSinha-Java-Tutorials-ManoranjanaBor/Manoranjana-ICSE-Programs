/*	
 * 	PROGRAM TO TAKE N AS INPUT FOR THE NUMBER OF STUDENTS IN AN ARRAY .
 *	ROLL NO , NAME , MARKS OF THREE SUBJECTS, THERE AVERAGE AND PRINT ACCORDINGLY....
 *
 */
import java.io.*;
public class Remark 
{
	public static void main(String args [])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(" ENTER THE NUMBER OF STUDENTS : ");
		int n = Integer.parseInt(in.readLine()) ;
		int i;
		
		int rno[] =new int[n];
		String name[] =new String[n];
		int m1[] =new int[n];
		int m2[] =new int[n];
		int m3[] =new int[n];
		int avg = 0;
		
		for(i = 0 ; i < n ; i ++)
		{
			System.out.println(" ENTER THE DETAILS OF THE STUDENT : ");
			rno[i] = Integer.parseInt(in.readLine()) ;
			name[i] = in.readLine() ;
			m1[i] = Integer.parseInt(in.readLine()) ;
			m2[i] = Integer.parseInt(in.readLine()) ;
			m3[i] = Integer.parseInt(in.readLine()) ;
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
