import java.util.*;
public class series01
{
	public static void main(String args [])
	{
		Scanner in =  new Scanner (System.in);
		System.out.print("ENTER n : ");
		int n = in.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			j = (i*i)-1 ;
		
		System.out.print(j+",");
		}
	}
}
