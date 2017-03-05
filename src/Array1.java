/*	Question 7
	Write a program to create an array to store 10 integers and print the largest integer and
	the smallest integer in that array. 
 */
import java.util.*;
public class Array1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE VALUES IN THE ARRAY : ");
		int arr[]=new int[10];
		int i,j,t;
		
		for(i=0;i<10;i++)
		{
			arr[i]=in.nextInt();
		}
		for(i=0;i<9;i++)
		{
			for(j=0;j<(9-i);j++)
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
			System.out.println("values are : "+arr[i]);
		}
		System.out.println("THE LARGEST INTEGER IN THE GIVEN ARRAY IS : "+arr[9]);
		System.out.println("THE SMALLEST INTEGER IN THE GIVEN ARRAY IS : "+arr[0]);
	}
}
