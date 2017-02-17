/*	6 6 6 6 6 6
 * 	5 5 5 5 5
 * 	4 4 4 4 
 *  3 3 3
 *  2 2  
 * 	1
 */
public class PatternRow1
{
	public static void main(String args [])
	{
		int i,j ;
		for(i=6;i>=0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
