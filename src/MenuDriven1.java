import java.util.*;
public class MenuDriven1 
{
	public static int fact(int a)
	{
		int i,f=1;
		for(i=1;i<=a;i++)
		{
			f=f*i;
		}
		return f;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("ENTER THE VALUE OF n : ");
		int n=in.nextInt();
		System.out.print("ENTER YOUR CHOICE BETWEEN 1 AND 2 : ");
		int c=in.nextInt();
		int i ;
		double s=0.0;
		
		switch(c)
		{
		case 1 :
			for(i=2;i<=n;i+=2)
			{
				s=(1.0/i);
			}
			System.out.println(s);
			break;
		case 2 :
			int x = in.nextInt();
			double p=0.0;
			for(i=2;i<=n;i+=3)
			{
				p=Math.pow(x, i)/fact(i);
				s=s+p;
			}
			System.out.println(s);
			break;
		default:
			System.out.println("WRONG CHOICE ...");
		
		}
	}
}
