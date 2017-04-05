import java.io.*;
public class SumOddOrEven 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ENTER THE RANGE TILL WHICH THE SUM IS TO BE CALCULATED : ");
		int n = Integer.parseInt(in.readLine());
		int sumodd;
		int sumeven;
		sumeven=sumodd=0;
		int i;
		for(i=1;i<=n;i++)
		{
			if((i%2)!=0)
			{
				sumodd=sumodd+i;
			}
			else
			{
				sumeven=sumeven+i;
			}
		}
		System.out.println("THE SUM OF ALL THE ODD NUMBERS ARE : "+sumodd);
		System.out.println("THE SUM OF ALL THE EVEN NUMBERS ARE : "+sumeven);
	}
}
