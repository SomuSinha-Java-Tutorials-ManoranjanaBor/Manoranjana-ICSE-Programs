import java.util.*;
public class Search7Wonders 
{
	public static void main(String args [])
	{
		Scanner in = new Scanner (System.in);
		String won[] = { "CHICHEN ITZA" , "CHRIST THE REDEEMER" , "TAJ MAHAL" , "GREAT WALL OF CHINA" , "MACHU PICHU" , "PETRA" , "COLOSSEUM"};
		String coun[] = {"MEXICO" , "BRAZIL" , "INDIA" , "CHINA" , "PERU" , "JORDAN" , "ITALY"};
		System.out.print("ENTER THE NAME OF COUNTRY : ");
		String c = in.nextLine();
		int i ,k = 1 , a = 0 ; 
		
		for( i = 0 ; i < 7 ;  i ++)
		{
			if(c.equalsIgnoreCase(coun[i]))
			{
				k = k + 1  ;
				a = i  ;
 			}
		}
		if(k == 2)
		{
			System.out.println("THE NAME OF RESPECTIVE WONDER OF THE ENTERED COUNTRY : "+won[a]);
		}
		else
		{
			System.out.println("SORRY !!!! NOT FOUND ........");
		}
	}
}
