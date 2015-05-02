import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class PalindromicSubstringsDiv2
{
	
	private String getConcatenatedString(String[] S1)
	{
		String res = "";
		for (int i = 0; i < S1.length; i++)
		{
			res += S1[i];
		}
		return res;
	}
	private boolean isPal(String x)
	{
		int len = x.length();
		
		for (int i = 0, j = len -1; i < j; i++, j--)
		{
			if (x.charAt(i) != x.charAt(j))
			{
				return false;
			}
		}
		return true;
	}
	public int count(String[] S1, String[] S2)
	{
		String S = getConcatenatedString(S1) + getConcatenatedString(S2);
		int len = S.length();
		int ans = len;
		
		for (int i = 2; i <= len ; ++i)
		{
			for (int j = 0; j < len-i+1; ++j)
			{
				String x = S.substring(j, j+i);
				if (isPal(x))
				{
					ans++;
				}
			
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
		answer = new PalindromicSubstringsDiv2().count(new String[]{"a","a",""}, new String[]{"a"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 6;
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
		answer = new PalindromicSubstringsDiv2().count(new String[]{"zaz"}, new String[]{});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 4;
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
		answer = new PalindromicSubstringsDiv2().count(new String[]{"top"}, new String[]{"coder"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 8;
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
		answer = new PalindromicSubstringsDiv2().count(new String[]{}, new String[]{"daata"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 7;
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
