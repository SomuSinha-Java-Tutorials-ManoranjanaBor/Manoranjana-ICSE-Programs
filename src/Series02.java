public class Series02 
{
	public static void main(String args [])
	{
		int i ;
		double s = 0 ;
		
		for(i = 1 ; i <= 20 ; i ++)
		{
			s = s + ((i*0.1) / ((i+1)*0.1));
			
		}
		System.out.println("THE SUM OF THE NUMBER : "+s);
			
	}
}
