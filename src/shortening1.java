/*Question 6
Write a program to accept a sentence and print only the first letter of each word of the
sentence in capital letters separated by a full stop.
Example :
INPUT SENTENCE : “This is a cat”
OUTPUT : T.I.A.C.
 * 
 */
import java.util.*;
public class shortening1
{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.print("ENTER THE SENTENCE : ");
        String s = in.nextLine();
        int p = s.length();
        int i;
        System.out.print(s.charAt(0)+".");
        for(i=0;i<p;i++)
        {
            char x = s.charAt(i);
            if(x == ' ')
            {
                char y = s.charAt(i+1);
                System.out.print(y+".");
            }
        }
    }
}
