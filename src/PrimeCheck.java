import java.util.*;
public class PrimeCheck 
{
	int m,i,flag;
	PrimeCheck (int n)
	{
		m=n;
		flag=0;
	}
	void getVal()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is prime or not : ");
		m=in.nextInt();
	}
	void checking()
	{
		for(i=2;i<=(m-1);i++)
		{
			if((m % i)==0)
			{
				flag = 1;
			}
		}
	}
	void display()
	{
		if(flag==1)
		{
			System.out.println("the number is not prime");
		}
		else
		{
			System.out.println("the number is prime");
		}
	}
	public static void main(String args[])
	{
		PrimeCheck num = new PrimeCheck(0); 
		num.getVal();
		num.checking();
		num.display();
	}
}
