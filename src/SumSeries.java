import java.io.*;
public class SumSeries 
{
	public static void main(String args [])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE VALUE OF X AND N : ");
		int x , n ;
		x = Integer.parseInt(in.readLine());
		n = Integer.parseInt(in.readLine());
		int i ;
		double sum = 0.0 ;
		
		for(i = 1 ; i <= n ; i ++)
		{
			if(( i % 2 ) == 0 )
			{
				System.out.println("i = " + i);
				sum = sum -((double)( x / i)) ;
			}
			else
			{
				System.out.println("i = " + i);
				sum = sum +((double)( x / i ));
			}
		}
		System.out.println("THE SUM OF THE SERIES : "+ sum );
	}
}
