import java.util.*;
public class PalindromeOrSpecial 
{
	public static void main(String args [])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("ENTER THE WORD TO CHECK WHETHER IT IS PALINDROME OR SPECIAL WORD : ");
		String s = in.nextLine(),s1 = "" ;
		int i , p ;
		int k = 1 ;
		p = s.length();
		char ch ;
		System.out.print("ENTER YOUR CHOICE  (BETWEEN 1 AND 2 ) : ");
		int m = in.nextInt();
		switch(m)
		{
			case 1 :
				if(s.charAt(0)==s.charAt(p-1))
				{
					System.out.println("THE WORD IS A SPECIAL WORD ....");
				}
			break ;
			
			case 2 :
				for(i = (p-1) ; i >= 0 ; i --)
				{	
					
					ch 	= s.charAt(i);
					s1 += ch ;
					if(s == s1)
					{
						k++ ;
					}
				}
					if(k == 2)
					{
						System.out.println("THE WORD IS PALINDROME . ");
					}
					else
					{
						System.out.println("THE WORD IS NOT PALINDROME . ");
					}
			break;
			default:
				System.out.print("OOPS !!! WRONG CHOICE ... TRY AGAIN ... SORRY ... THNK U ... ");
		}
	}
}
