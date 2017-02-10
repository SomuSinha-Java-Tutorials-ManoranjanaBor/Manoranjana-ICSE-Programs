import java.util.*;
public class EncodeBy2withArray 
{
	public static void main(String args [])
	{
		Scanner in = new Scanner (System.in) ;
		System.out.print("ENTER A WORD TO GET IT ENCODED BY +2 : ");
		String st= in.nextLine(),st1 = "";
		int i,p=st.length(),n,x=0;
		char ch,ch1=0;
		char charsetSmall[] = new char[26];
		char charsetBig[] = new char[26];
		
		for(i=0;i<=25;i++)
		{
			charsetSmall[i]=(char)(97+i);
			charsetBig[i]=(char)(65+i);
		}
		
		for(i=0; i < p; i++)
		{
			ch=st.charAt(i);
			if(ch != ' ')
			{
				n = (int) ch ;
				if(n>=65&&n<=90)
				{
					x = (n-65+2)%26;
					ch1 = charsetBig[x];
				}
				else if(n>=97&&n<=122)
				{	
					x = (n-97+2)%26;
					ch1 = charsetSmall[x];
				}
				st1 = st1 + ch1 ;
			}
		}
		System.out.print("THE ENCODED WORD IS : "+st1);
	}
}
