import java.util.*;
public class EncodeBy2 
{
	public static void main(String args [])
	{
		Scanner in = new Scanner (System.in) ;
		System.out.print("ENTER A WORD TO GET IT ENCODED BY +2 : ");
		String st= in.nextLine(),st1 = "";
		int i,p=st.length(),n,x=0;
		char ch,ch1;
		
		for(i=0; i < p; i++)
		{
			ch=st.charAt(i);
			if(ch != ' ')
			{
				n = (int) ch ;
				if(n>=65&&n<=90)
					x = 65+ (n-65+2)%26;
				else if(n>=97&&n<=122)
					x = 97+ (n-97+2)%26;
				
				/**
				 * Character 	:	A	B	C	D	..	X	Y	Z
				 * Index 		:	0	1	2	3	..	23	24	25
				 * 
				 * n-65 gives us an index in the series of A-Z. We add +2 for the encoding. This value mod 26 gives us the actual letter we need, which we then 
				 * add to 65 to get the character from the index.
				 */
				
				ch1 = (char) x ;
				st1 = st1 + ch1 ;
			}
		}
		System.out.print("THE ENCODED WORD IS : "+st1);
	}
}
