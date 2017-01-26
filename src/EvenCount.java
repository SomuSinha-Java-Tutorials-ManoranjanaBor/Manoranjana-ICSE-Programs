/*to take two numbers as input then count number of evens present within those two numbers
 *  where display will be done in main() method
 * Using following method prototype:
 *   int evenCount()
 */
import java.util.*;
public class EvenCount
{
	public static void evenCount(int a,int b)
	{
		int i,ec=0;
		for(i=a;i<=b;i++)
		{
			if((i % 2) == 0)
			{
				ec++;
			}
		}
		System.out.println("the number of evens found within "+a+"and"+b+" is : "+ec);
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("ENTER THE STARTING NUMBER : ");
		int m =in.nextInt();
		System.out.print("ENTER THE ENDING NUMBER : ");
		int n =in.nextInt();
		int i;
		for(i=m;i<=n;i++)
		{
					
		}
		evenCount(m,n);	
		
	}
}
