/*to take two numbers as input then count number of evens present within those two numbers
 *  where display will be done in main() method
 * Using following method prototype:
 *   int evenCount()
 */
import java.util.*;
public class EvenCount
{
	public static int evenCount(int n)
	{   int flag = 0 ;
		int d;
	
	    while(n!=0)
	    { 	
	    	d = n % 10 ;
	    	if((d % 2) == 0)
	    	{
	    		flag = 1 ;
	    	}
		n=n/10;
	    }
		return flag;
	}
	public static void main(String args[])
	{ 
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int n = in.nextInt();
		int e;int ec=0;
		
		while(n!=0)
		{
			e = n % 10 ;
			if(evenCount(e) == 1 )
			{
				ec++;
			}
			e=n/10;
		}
		System.out.println("number of even digits found : "+ec );
	}
}
