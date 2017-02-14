/* Special words are those words which starts and ends with the same letter.
 * for example - comic,window.
 */
import java.util.*;
public class SpecialWordCheck 
{
	public static void main(String args [])
	{
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER A WORD TO CHECK WHETHER IT IS SPECIAL OR NOT : ");
		String s = in.next(); 
		int i,p = s.length();
		char ch,ch1;
		ch = s.charAt(0);
		ch1 = s.charAt(p-1);
		
		if(ch == ch1)
		{
			System.out.println("THE WORD IS SPECIAL...");
		}
		else
		{
			System.out.println("THE WORD IS NOT SPECIAL.... ");
		}
	}
}
