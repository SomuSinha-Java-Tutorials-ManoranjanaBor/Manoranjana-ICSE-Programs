/*	1
 * 	3 1
 * 	5 3 1 
 * 	7 5 3 1 
 * 	9 7 5 3 1
 */
public class Series1 
{
	public static void main(String args [])
	{
		int i , j ;
		
		for(i = 1 ; i <= 9 ; i += 2)
		{
			
			for(j = i ; j >= 1 ; j -= 2)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}