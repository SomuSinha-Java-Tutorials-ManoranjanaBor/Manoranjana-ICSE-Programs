import java.util.*;
public class pattern20 
{
	public static void main(String args [])
	{
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER THE NUMBER OF ROWS : ");
		int n = in.nextInt();
		int i , sp , j ;
		
		for(i = 1 ; i <= n ; i ++)
		{
			for(sp=(n-i);sp>0;sp--)
			{
				System.out.print("  ");
			}
			for(j = 1 ; j <= i ; j ++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
