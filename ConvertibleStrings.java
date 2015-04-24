import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class ConvertibleStrings
{
	public int leastRemovals(String A, String B)
	{
			
		int[] count = new int[256];
		char[] H = new char[256];
		int ans, len = A.length();
		
		for(int i = 0; i < len; i++)
		{
			if(H[A.charAt(i)] != B.charAt(i))
			{
				if(count[A.charAt(i)] == 0)
				{
					H[A.charAt(i)] = B.charAt(i);
					count[A.charAt(i)]++;
				}
				else
				{
					count[A.charAt(i)]--;
				}
			}
			else
			{
				count[A.charAt(i)]++;
			}
		}
		
		ans = 0;
		
		for(int i = 0; i < len ; i++)
		{
			if(H[A.charAt(i)] != B.charAt(i))
			{
				ans++;
			}
		}
		return ans;

	}
	
	public static void main(String[] args)
	{
		long time;
		int answer;
		boolean errors = false;
		int desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new ConvertibleStrings().leastRemovals("DD", "FF");
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 0;
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		System.out.println("Desired answer:");
		System.out.println("\t" + desiredAnswer);
		if (answer != desiredAnswer)
		{
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		}
		else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new ConvertibleStrings().leastRemovals("AAAA", "ABCD");
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 3;
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		System.out.println("Desired answer:");
		System.out.println("\t" + desiredAnswer);
		if (answer != desiredAnswer)
		{
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		}
		else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new ConvertibleStrings().leastRemovals("AAIAIA", "BCDBEE");
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 3;
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		System.out.println("Desired answer:");
		System.out.println("\t" + desiredAnswer);
		if (answer != desiredAnswer)
		{
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		}
		else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new ConvertibleStrings().leastRemovals("ABACDCECDCDAAABBFBEHBDFDDHHD", "GBGCDCECDCHAAIBBFHEBBDFHHHHE");
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 9;
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		System.out.println("Desired answer:");
		System.out.println("\t" + desiredAnswer);
		if (answer != desiredAnswer)
		{
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		}
		else
			System.out.println("Match :-)");
		System.out.println();
		
		
		if (errors)
			System.out.println("Some of the test cases had errors :-(");
		else
			System.out.println("You're a stud (at least on the test data)! :-D ");
	}

}
//Powered by [KawigiEdit] 2.0!
