import java.util.*;
public class CountryCap 
{
	public static void main(String args [])
	{
		Scanner in = new Scanner (System.in);
		String coun[] = new String[10];
		String cap[] = new String[10];
		int i,k = 1,a = 0 ;
		for(i = 0 ; i < 10 ; i ++ )
		{
			System.out.print("ENTER THE NAME OF COUNTRY : ");
			coun[i] = in.nextLine() ;
			System.out.print("ENTER THE NAME OF CAPITAL : ");
			cap[i] = in.nextLine() ;
		}
		System.out.print("\t ENTER THE NAME OF COUNTRY : ");
		String c = in.nextLine() ;
		
		for(i = 0 ; i < 10 ; i ++ )
		{
			if(coun[i].equalsIgnoreCase(c))
			{
				k ++ ;
				a = i ;
			}
		}
			if(k == 2)
			{
				System.out.print(" THE NAME OF THE RESPECTIVE CAPITAL IS : "+cap[a]);
			}
			else
			{
				System.out.print(" not present ");
			}
		
	}
}
