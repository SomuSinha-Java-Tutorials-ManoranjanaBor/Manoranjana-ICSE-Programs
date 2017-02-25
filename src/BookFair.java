import java.io.*;
public class BookFair
{
	String Bname ;
	double price ;
	
	public BookFair()
	{
		Bname = "" ;
		price = 0.0 ;
	}
	
	public void Input()throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ENTER THE NAME OF THE BOOK : ");
		Bname = in.readLine();
		System.out.print("ENTER THE PRICE OF THE BOOK : ");
		price = Double.parseDouble(in.readLine());
	}
	
	public void calculate()
	{
		if(price <= 1000.0)
		{
			price = price - (price * (2.0/100.0));
		}
		if((price > 1000.0)&&(price <= 3000.0))
		{
			price = price - (price * (10.0/100.0));
		}
		if(price > 3000.0)
		{
			price = price - (price * (15.0/100.0));
		}
	}
	
	public void display()
	{
		System.out.println("BOOK NAME\t\tPRICE");
		System.out.println(Bname+"\t"+price);
	}
	
	public static void main(String args [])throws IOException
	{
		BookFair book = new BookFair();
		book.Input();
		book.calculate();
		book.display();
		
	}
}
