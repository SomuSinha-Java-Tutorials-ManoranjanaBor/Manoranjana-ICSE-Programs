/* WRITE A PROGRAM TO FIND THE SMALLEST DIGIT OF AN INTEGER THAT IS INPUT .
 *  SAMPLE INPUT : 6452
 *  SAMPLE OUTPUT : 2
 */
import java.util.*;
public class SmallestEnteredDigit 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER A NUMBER : ");
		int	n = in.nextInt();
		int min=9,d;
		while(n>0)
		{
			d=n%10;
			if(d<min)
			{
				min = d;
			}
			n=n/10;
		}
		System.out.print("the smallest number : "+min);
		
	}
}
		