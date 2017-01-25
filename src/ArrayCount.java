/*WAP to create an array of 30 elements then count and display the following :
* (a) Number of two digit even.
* (b) Number of three digit odd.
* (c) sum of all evens above 50.
* (d) product of all single digit numbers.
*
*/
import java.util.*;
public class ArrayCount
{

	public static int countDigit(int a)
	{
		int c=0;
		while(a>0)
		{
			a=a/10;
			c++;
		}
	return c;
	}
   public static void main(String args[])
   {
	   Scanner in = new Scanner(System.in);
	   int m[] = new int[10];
	   int i,tdo=0,tde=0,s=0,ps=1;
	   
	   for(i=0;i<10;i++)
	   {   
		   System.out.print("ENTER "+i+"TH THE VALUES : ");
		   m[i]=in.nextInt();
	   }
	   for(i=0;i<10;i++)
	   {
		   if(countDigit(m[i])==2)
		   {
			   if((m[i]%2)==0)
			   {
				   tde++;
			   }
		   }
	   }
	   for(i=0;i<10;i++)
	   {
		   if(countDigit(m[i])==3)
		   {
			   	if((m[i]%2)!=0)
			   	{
			   		tdo++;
			   	}
		   }
	   }
	   for(i=0;i<10;i++)
	   {
		   if(m[i]>50)
		   {
			   s=s+m[i];
		   }
	   }
	   for(i=0;i<10;i++)
	   {
		   if(countDigit(m[i])==1)
		   {
			  ps=ps*m[i];
			  
		   }
	   }
		   
	   System.out.println("number of two digit even:"+tde);
	   System.out.println("number of three digit odd:"+tdo);
	   System.out.println("sum of all even above 50:"+s);
	   System.out.println("product of all single digit number:"+ps);
   }
}
