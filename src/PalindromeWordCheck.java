import java.util.*;
public class PalindromeWordCheck 
{
	public static void main(String args[])
	{
		 Scanner in = new Scanner (System.in);
		 System.out.print("ENTER THE WORD TO CHECK WHETHER IT IS PALINDROME WORD OR NOT : ");
		 String s = in.next(),s1="";
		 char ch ;
		 int i, p = s.length();
		 for(i = (p-1) ; i >= 0 ; i --)
		 {
			 ch = s.charAt(i);
			 s1 = s1 + ch ;
		 }
		 if(s.equals(s1))
		 {
			 System.out.print("THE WORD IS PALINDROME WORD .");
		 }
		 else
		 {
			 System.out.print("THE WORD IS NOT PALINDROME WORD . ");
		 }
	}
}
