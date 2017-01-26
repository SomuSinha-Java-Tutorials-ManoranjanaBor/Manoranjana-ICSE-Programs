import java.util.*;
public class HighLowDifference 
{
		int a,b,c,i,j,t;
		static int diff;
		HighLowDifference(int p,int q,int r)
		{
			a=p;
			b=q;
			c=r;
		}
		void get()
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Enter first number : ");
			a=in.nextInt();
			System.out.print("Enter second number : ");
			b=in.nextInt();
			System.out.print("Enter third number : ");
			c=in.nextInt();
		}
		static void number(int a,int b,int c)
		{
			int arr[]=new int[3];
			arr[0]=a;
			arr[1]=b;
			arr[2]=c;
			int i,j,t;
			for(i=0;i<2;i++)
			{
				for(j=0;j<arr.length-1-i;j++)
				{
					if(arr[j]>arr[j+1])
					{
						t=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=t;
					}
				}
			}
			
			System.out.println("highest"+arr[2]);
			System.out.println("middle"+arr[1]);
			System.out.println("lowest"+arr[0]);
			diff = arr[2]-arr[0];
			System.out.println("Difference between Highest and lowest number:"+diff);
						
		}
		public static void main(String args[])
		{
			HighLowDifference num = new HighLowDifference(0,0,0);
			num.get();
			HighLowDifference .number(0,0,0);
		}
	}

