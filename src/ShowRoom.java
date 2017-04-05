import java.io.*;
public class ShowRoom 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ENTER THE TOTAL COST : ");
		int price = Integer.parseInt(in.readLine());
		int discount,ActualCost;
		
		if(price<=2000)
		{
			discount = price*5/100;
		}
		else if(price>=2001&&price<=5000)
		{
			discount=price*25/100;
		}
		else if(price>=5001&&price<=10000)
		{
			discount=price*35/100;
		}
		else
		{
			discount=price*50/100;
		}
		ActualCost=price-discount;
		
		System.out.println("ACTUAL COST AFTER A DISCOUNT : "+ActualCost);
	}
}
