import java.util.*;
public class EncodeBy2 
{
	public static void main(String args [])
	{
		Scanner in = new Scanner (System.in) ;
		System.out.print("ENTER A WORD TO GET IT ENCODED BY +2 : ");
		String st= in.nextLine(),st1 = "";
		int i,p=st.length(),n,x;
		char ch,ch1;
		
		for(i=0; i < p; i++)
		{
			ch=st.charAt(i);
			if(ch != ' ')
			{
				n = (int) ch ;
				x = n + 2 ;
				ch1 = (char) x ;
				st1 = st1 + ch1 ;
			}
		}
		System.out.print("THE ENCODED WORD IS : "+st1);
	}
}
