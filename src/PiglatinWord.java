/*	INPUT : LONDON 
 *	OUTPUT : ONDONLAY
 *		&
 *	INPUT : London
 *	OUTPUT : ONDONLAY
 */
import java.util.*;
public class PiglatinWord 
{
	public static void main(String args [])
	{
		Scanner in = new Scanner (System.in); 
		System.out.print("ENTER THE WORD in UPPERCASE LETTER TO GET THE WORD CHANGED INTO PIGLATIN : ");
		String s = in.nextLine();
		String s1 = "" ;
		String s2 = "" ;
		int i , p = s.length() , pos = 0 ;
		char ch ,ch1;
		
		for(i = 0 ; i < p ; i ++)
		{
			ch = s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					pos = i ;
					s1 += s.substring(pos , (p));
					break;
				}
				else
				{ 
					
					s2 = s.substring(0, (i+1)) ; 
				}
			}
		}
		System.out.println("THE PIGLATIN FORM OF WORD IS : "+s1+s2+"AY");
	}
}

