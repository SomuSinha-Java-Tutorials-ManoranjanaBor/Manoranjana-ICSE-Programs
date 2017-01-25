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
   public static void main(String args[])
   {
	   Scanner in = new Scanner(System.in);
	   int m[] = new int[10];
	   int c=0;
	   int n;
	   int i;
	   int tde=0,tdo=0,s=0,ps=1;
	  
	   for(i=0;i<10;i++)
	   {
		   System.out.print("ENTER "+i+ " VALUES IN ARRAY :");
		 m[i] = in.nextInt();   
	   }
	   
	   for(i=0;i<10;i++)
	   {
		 while(m[i]!=0)
		 {
		  n=m[i]/10;
		   c=0;
		  c++;
		  n++;
		 }
           if(c==2)
           {
          	 if((m[i]%2)==0)
          	 {
          		 tde++;
          	 }
           }
	   
	 while(m[i]!=0)
		 {
		  n=m[i]/10;
          c=0;
		  c++;
		  n++;
		 }
           if(c==3)
           {
          	 if((m[i]%2)!=0)
          	 {
          		 tdo++;
          	 }
           }
	   
		   if(m[i]>50)
		   {
		     if((m[i]%2)==0)
          	 {
          		 s=s+m[i];
          	 }
		   }
       
	   
		 while(m[i]!=0)
		 {
		  n=m[i]/10;
		   c=0;
		  c++;
		  n++;
		 }
           if(c==1)
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



   
   
   