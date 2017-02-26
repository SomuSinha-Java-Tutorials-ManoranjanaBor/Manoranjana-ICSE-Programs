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
		System.out.print("ENTER THE WORD TO GET THE WORD CHANGED INTO PIGLATIN : ");
		String s = in.nextLine();
		String s1 = "" ;
		String s2 = "" ;
		int i , p = s.length() ;
		char ch ,ch1;
		
		for(i = 0 ; i < p ; i ++)
		{
			ch = s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					s1 += s.substring(i , (p-1));
					System.out.println(s1);
					
				}
			/*	else
				{
					s2 += ch ; 
				}
				System.out.println("THE PIGLATIN FORM OF WORD IS : "+s1+s2+"ay");
			}
			if(Character.isLowerCase(ch))
			{
				ch1 = Character.toUpperCase(ch);
				
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					s1 += s.substring(i , (p-1));
					break ;
				}
				else
				{
					s2 += ch ; 
				}
			}*/
		}
	}
}
}
