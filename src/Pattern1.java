/*	1 2 3 4 5     
 *  2 2 3 4 5
 *  3 3 3 4 5
 *  4 4 4 4 5
 *  5 5 5 5 5 
 */
public class Pattern1 
{
	public static void main(String args [])
	{
		int i,j,sp;
		
		for(i = 1; i <= 5 ;i ++)
		{
			
			for(j=1;j<=5;j++)
			{
				if(i>=j)
				{
					System.out.print(i+" ");
				}
				else
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}
