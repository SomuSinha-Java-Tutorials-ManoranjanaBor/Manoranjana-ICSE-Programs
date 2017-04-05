
public class Change 
{
	public static void main(String args[])
	{
		String st="August 15 is celebrated as the Independence day of India";
		String word;
		char c;
		int p=0,len=st.length();
		for(int i = 0;i<len;i++)
		{
			c=st.charAt(i);
			if(c==' ')
			{
				word=st.substring(p,i);
				if(word.equals("15"))
				{
					System.out.print("26 ");
				}
				else if(word.equals("August"))
				{
					System.out.print("January ");
				}
				else if(word.equals("Independence"))
				{
					System.out.print("Republic ");
				}
				else
				{
					System.out.print(word+" ");
				}
				p=i+1;
			}
		}
	}
}
