import java.util.*;
public class FruitJuice
{
	int product_code;
	int pack_size;
	int product_price;
	String pack_type;
	String flavour ;
	
	FruitJuice()
	{
		product_code = 0 ;
		pack_size = 0 ;
		product_price = 0 ;
	    pack_type = "" ;
		flavour = "" ;
	}
	
	void input()
	{
		Scanner in = new Scanner (System.in); 
		System.out.print("ENTER THE PRODUCT CODE : ");
		product_code = in.nextInt() ;
		System.out.print("ENTER THE PACK SIZE : ");
		pack_size = in.nextInt() ;
		System.out.print("ENTER THE PRODUCT PRICE : ");
		product_price = in.nextInt() ;
		System.out.print("ENTER THE PACK TYPE : ");
	    pack_type =in.next() ;
	    System.out.print("ENTER THE FLAVOUR : ");
		flavour = in.next() ;
	}
	
	void discount()
	{
		product_price = product_price - 10 ;
	}
	
	void display()
	{
		System.out.println("PRODUCT CODE \t"+"PRODUCT PRICE \t"+"FLAVOUR \t"+"PACK SIZE \t"+"PACK TYPE \t");
		System.out.println( product_code +"\t\t"+product_price+"\t\t"+flavour+"\t\t"+pack_size+"\t\t"+pack_type+"\t");
	}
	
	public static void main(String args [])
	{
		FruitJuice obj = new FruitJuice();
		obj.input();
		obj.discount();
		obj.display();
	}
}
