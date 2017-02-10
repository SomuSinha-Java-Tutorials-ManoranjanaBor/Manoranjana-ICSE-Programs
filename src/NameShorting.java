import java.util.*;
public class NameShorting 
{
	public static void main(String args [])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a name : ");
		
		String s= in.nextLine(),s1="";
		char ch=s.charAt(0),ch1;
		int i=0,p=s.length(),pos=0;
		
		int noWords = (returnLetter(s)).len;
		char arr[] = (returnLetter(s)).letter;
		
		if(noWords>=3)
		{
			for(i=0;i<arr.length&&arr[i]!=0;i++)
				System.out.print(arr[i]+" ");
		}		
	}
	
	static returnWords returnLetter(String str)
	{
		int noWords=0;
		int pos=0;
		char arr[]= new char[10];
		int idx=0;
		while(pos!=str.length()+1)
		{
			arr[idx++]=str.charAt(pos);
			pos=str.indexOf(' ', pos);
			if(pos==-1)
				pos=str.length();
			noWords++;
			pos++;
		}
		return new returnWords(noWords, arr);
	}
}

class returnWords 
{
	int len;
	char letter[];
	returnWords(int a, char b[])
	{
		len=a;
		letter=b;
	}
}
