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
		int i,j,k=1;
		for(i = 5 ; i >= 1 ; i --)
		{
			for(j = 1 ; j <= i; j++)
			{
				if(k>9)
					System.out.print(k+" ");
				else
					System.out.print(k+"  ");
				k++;
			}
			
			System.out.println();
		}
	}
}
