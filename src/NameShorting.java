import java.util.*;
public class NameShorting 
{
	public static void main(String args [])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a name : ");
		
		String s= in.nextLine(),s1="";
		char ch=s.charAt(0),ch1;
		int i,p =s.length(),pos=0;
		
		for(i=p-1;i>=0;i--)
		{
			ch1 =s.charAt(i);
			
			if(ch1 == ' ')
			{
				pos =i;
				break;
			}
		}
		System.out.print("the shortened name is : "+ch);
		for(i=1;i<pos;i++)
		{
			ch1 = s.charAt(i);
			if(ch == ' ')
			{
				 System.out.print(s.charAt(i+1));
				
			}
		}
		
		
	}
}
