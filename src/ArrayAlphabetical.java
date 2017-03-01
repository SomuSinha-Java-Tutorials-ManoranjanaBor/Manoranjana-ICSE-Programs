/*Question 9
Write a program to store 10 names in an array. Arrange these in alphabetical order by
sorting. Print the sorted list. Take single word names, all in capital letters,
e.g. SAMSON, AJAY, LUCY, etc.
 * 
 */
import java.util.*;
public class ArrayAlphabetical
{
	public static void main(String args [])
	{
		Scanner in = new Scanner (System.in);
		System.out.println("ENTER THE NAMES IN THE ARRAY : ");
		String name[] = new String[10] ;
		String t ;
		int i , j ;
		
		for(i = 0 ; i < 10 ; i ++)
		{
			name[i] = in.nextLine();
		}
		for(i = 0 ; i < 9 ; i ++)
		{
			for(j = 0 ; j < (9-i) ; j ++)
			{
				if(name[j].compareTo(name[j+1])>0)
				{
					t = name[j];
					name[j] = name[j+1];
					name[j+1] = t ;
				}
				
			}
		}
		System.out.println("THE SORTED ARRAY : ");
		for(i = 0 ; i < 10 ; i ++)
		{
			System.out.println(name[i]);
		}
	}
}
