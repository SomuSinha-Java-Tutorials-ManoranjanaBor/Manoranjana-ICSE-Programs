/*	I
 * 	I C
 * 	I C S
 * 	I C S E
 */	
import java.util.*;
public class ICSEpattern 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER THE WORD : "); 
		String s = in.next();
		int i , p = s.length() ;
	
		
		for(i = 0 ; i < p ; i ++)
		{
			System.out.println(s.substring(0,i+1));
		}
		
	}
}
