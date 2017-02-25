/*	0 0 0 0 0 0 0 
 * 	0 1 0 0 0 0 0 
 * 	0 0 2 0 0 0 0 
 * 	0 0 0 3 0 0 0 
 * 	0 0 0 0 4 0 0 
 * 	0 0 0 0 0 5 0
 * 	0 0 0 0 0 0 6
 */
public class pattern4 
{
	public static void main(String args [])
	{
		int i,j;
		for(i=0 ; i <= 6 ; i ++)
		{
			for(j = 0 ; j <= 6 ; j++)
			{
				if(i==j)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
