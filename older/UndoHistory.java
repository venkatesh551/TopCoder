import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class UndoHistory
{
	private int largestPrefixLength(String S, String T){
		int i;
		for(i = 0; i < S.length() && i < T.length() && S.charAt(i) == T.charAt(i) ; i++)
			;
		return i;
	}
	
	private boolean isPrefix(String S, String T){
		if(S.length() > T.length())
			return false;
		for(int i = 0; i < S.length(); i++){
			if(S.charAt(i) != T.charAt(i))
				return false;
		}
		return true;
	}
	public int minPresses(String[] lines)
	{
		int result  = lines[0].length() + 1;
		for(int i = 1; i < lines.length; i++){
			if(isPrefix(lines[i-1],lines[i])){
				result += lines[i].length() - lines[i-1].length() + 1;
			}
			else{
				int temp, max = 0;
				for(int j = 0;  j < i; j++){
					temp = largestPrefixLength(lines[j], lines[i]);
					if(temp > max){
						max = temp;
					}
				}
				result +=  max;
			}
			
		}
		return result;
	}
	
	
	public static void main(String[] args)
	{
		long time;
		int answer;
		boolean errors = false;
		int desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new UndoHistory().minPresses(new String[]{"tomorrow", "topcoder"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 18;
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
		answer = new UndoHistory().minPresses(new String[]{"a","b"});
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
		answer = new UndoHistory().minPresses(new String[]{"a", "ab", "abac", "abacus" });
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 10;
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
		answer = new UndoHistory().minPresses(new String[]{"pyramid", "sphinx", "sphere", "python", "serpent"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 39;
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
		answer = new UndoHistory().minPresses(new String[]{"ba","a","a","b","ba"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 13;
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
