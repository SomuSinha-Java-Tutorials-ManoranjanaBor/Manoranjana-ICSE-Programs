/*	1  2  3  4  5
 * 	6  7  8  9 
 *  10 11 12
 *  13 14 
 *  15
 */
public class Series2 
{
	public static void main(String args[])
	{
		int i,j,k=0;
		for(i = 5 ; i >= 1 ; i --)
		{
			for(j = 1 ; j <= i; j++)
			{
				System.out.print(j);
			}
			
			for(k = (i+j);k<=5;k++)
				{
					System.out.print(k);
				}
			
					System.out.println();
		}
	}
}
