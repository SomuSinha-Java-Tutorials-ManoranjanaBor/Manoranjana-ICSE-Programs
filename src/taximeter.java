/*Question 4
Define a class taximeter having the following description:
Data members/instance variables
int taxino - to store taxi number
String name - to store passenger's name
int km - to store number of kilometres travelled
Member functions:
taximeter() -- constructor to initialize taxino to 0, name to “ ”and b to 0.
input() - to store taxino,name,km
calculate() - to calculate bill for a customer according to given conditions
kilometers travelled(km) Rate/km
1 km Rs 25
1 km 6 Rs 10
6 < km 12 Rs 15
12 < km 18 Rs 20
>18 km Rs 25
 display()- To display the details in the following format
Taxino Name Kilometres travelled Bill amount
 - - - -
Create an object in the main method and call all the above methods in it*/
import java.io.*;
public class taximeter
{
	int taxino;		// to store taxi number
	
	String name;	 // to store passenger's name
	
	int km; 		 //to store number of kilometers travelled
	
	int b;
	
	taximeter()
	{
		taxino=0;
		name="";
		b=0;
		km=0;
	}
	
	void input()throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ENTER THE TAXI NUMBER : ");
		taxino=Integer.parseInt(in.readLine());
		
		System.out.print("ENTER THE NAME OF THE CUSTOMER : ");
		name=in.readLine();
		
		System.out.print("ENTER THE NUMBER OF KILOMETERS : ");
		km=Integer.parseInt(in.readLine());
	}
	
	void calculate()
	{
		if(km<=1)
		{
			b=25;
		}
		
		else if(km>1&&km<=6)
		{
			b=25+(km-1)*10;
		}
		
		else if(km>6&&km<=12)
		{
			b=25+5*10+(km-6)*15;
		}
		
		else if(km>12&&km<=18)
		{
			b=25+5*10+6*15+(km-12)*20;
		}
		
		else
		{
			b=25+5*10+6*15+6*20+(km-18)*25;
		}
		
	}
	
	void display()
	{
		System.out.println("TAXINO\tNAME\tKILOMETERS TRAVELLED\tBILL AMOUNT\t");
		
		System.out.println(taxino+"\t"+name+"\t"+km+"\t\t\t"+b);
	}
	
	public static void main(String args[])throws IOException
	{
		taximeter taxi = new taximeter();
		
		taxi.input();
		taxi.calculate();
		taxi.display();
		
	}
}
