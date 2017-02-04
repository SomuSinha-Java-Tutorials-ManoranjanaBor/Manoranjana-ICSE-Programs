/* 
 * 1 3 5 7 9 
 * 3 5 7 9 1
 * 5 7 9 1 3 
 * 7 9 1 3 5 
 * 9 1 3 5 7 
 */
public class SeriesNum 
{
	public static void main (String args[])
	{
		int i,j,k;
		for(i=1;i<=9;i+=2)
		{
			for(j=i;j<=9;j+=2)
			{
				System.out.print(j+" ");
			}
			for(k=1;k<=i-2;k+=2)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}