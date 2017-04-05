import java.util.*;
public class student 
{
	String name;
	int roll;
	int p,c,b;
	double S;
	
	student()
	{
		name="";
		roll=0;
		p=0;
		c=0;
		b=0;
		S=0.0;
	}
	
	public void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("ENTER THE NAME OF THE STUDENT : ");
		name=in.nextLine();
		System.out.print("ENTER THE ROLL NUMBER OF THE STUDENT : ");
		roll=in.nextInt();
		System.out.print("ENTER THE PHYSICS MARKS OF THE STUDENT : ");
		p=in.nextInt();
		System.out.print("ENTER THE CHEMISTRY MARKS OF THE STUDENT : ");
		c=in.nextInt();
		System.out.print("ENTER THE BIOLOGY MARKS OF THE STUDENT : ");
		b=in.nextInt();
	}
	
	public void calculate()
	{
		S=(p+b+c)/3.0;
	}
	
	public void display()
	{
		System.out.println("Name\t\tRoll\tScience Marks");
		System.out.println(name+"\t"+roll+"\t"+S);
	}
	
	public static void main(String args[])
	{
		student icse=new student();
		icse.input();
		icse.calculate();
		icse.display();
	}
}
