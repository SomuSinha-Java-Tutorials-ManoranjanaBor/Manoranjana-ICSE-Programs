import java.util.*;
public class FrequencyOfWords 
{
	public static void main(String args [])
	{
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER THE STATEMENT : ");
		String st = in.nextLine();
		System.out.print("ENTER THE WORD TO COUNT ITS NUMBER OF OCCURENCE : ");
		String st1 = in.nextLine(),st2="";
		
		int i , p , c = 0 , sp = 0;
		char ch ;
		p = st.length() ;
		
		for(i = 0 ; i < p ; i ++)
		{
			ch = st.charAt(i);
			if((ch == ' ')||(ch == '.'))
			{	
				st2 = st.substring(sp,i);
				if(st1.equals(st2))
				{
					c++;
				}
				
				sp =i+1 ;
			}
		}
		System.out.println("THE NUMBER OF WORDS FOUND IS : "+c);
	}
}
