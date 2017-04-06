import java.io.*;
public class BinarySearch 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new	BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[10];
		int i=0,j=0,t=0;
		
		for(i=0;i<10;i++)
		{
			System.out.print("ENTER ARRAY ELEMENTS:");
			arr[i]=Integer.parseInt(in.readLine());
		}
		for(i=0;i<9;i++)
		{
			for(j=0;i<(9-i);j++)
			{
				if(arr[j]>arr[j+1])
				{
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for(i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		}
		
		/*int lb=0,ub=arr.length-1,mid;
		mid=(lb+ub)/2;
		int ns=Integer.parseInt(in.readLine());
		while(lb<=ub)
		{
			if(arr[mid]>ns)
			{
				ub=mid-1;
			}
			else if(arr[mid]<ns)
			{
				lb=mid+1;
			}
			
		}
		
		if(arr[mid]==ns)
		{
			System.out.println("number found");
		}
		else
		{
			System.out.println("number not found.");
		}*/
	}
}
