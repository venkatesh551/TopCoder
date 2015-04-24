import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class PlatypusPaternity
{
	private int findFamilySize(String A, String B, String C)
	{
		int count = 0;
		
		for(int i = 0; i < A.length(); i++)
		{
			if((A.charAt(i) == 'N' || B.charAt(i) == 'N' ) && C.charAt(i) == 'Y')
				return 0;
		}

		for(int i = 0; i < C.length(); i++)
		{
			if(C.charAt(i) == 'Y') 
				count++;
		}
		return count;
	
	}
	
	
	
	public int maxFamily(String[] femaleCompatibility, String[] maleCompatibility, String[] siblingGroups)
	{
		int ans = 0;
		for(int i = 0; i < femaleCompatibility.length; i++)	
		{
			for(int j = 0; j < maleCompatibility.length; j++)
			{
				for(int k = 0; k < siblingGroups.length; k++)
				{
					int size = findFamilySize(femaleCompatibility[i], maleCompatibility[j], siblingGroups[k]);
					ans = Math.max(ans, size);
				
				}			
			}
		}
		return ans == 0? 0: ans + 2;
	}
	
	
	public static void main(String[] args)
	{
		long time;
		int answer;
		boolean errors = false;
		int desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new PlatypusPaternity().maxFamily(new String[]{"YYYY", "YYYY"}, new String[]{"NNYN", "YYYN"}, new String[]{"YYYN", "NNNY"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 5;
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
		answer = new PlatypusPaternity().maxFamily(new String[]{"NNYYY"}, new String[]{"YYNNN"}, new String[]{"YYNNN", "NNYYY"});
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
		answer = new PlatypusPaternity().maxFamily(new String[]{"YYYYYYYYN"}, new String[]{"YYYYYYYYY"}, new String[]{"YNYNYNYNY", "NNNYNYNNN", "NYNNNNNYN"});
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
		answer = new PlatypusPaternity().maxFamily(new String[]{"YY"}, new String[]{"YY"}, new String[]{"YN", "NY"});
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
		answer = new PlatypusPaternity().maxFamily(new String[]{"YYNNYYNNYYNN", "YNYNYNYNYNYN", "YYYNNNYYYNNN"}, new String[]{"NYYNNYYNNYYN", "YYNYYYNYYYNY", "NNNNNNYYYYYY"}, new String[]{"NYNNNYNNNNNN", "NNNNNNNNYNNN", "NNYNNNNNNNYN", "YNNNNNNYNNNN", "NNNNNNNNNYNY", "NNNYYNYNNNNN"});
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
		
		
		if (errors)
			System.out.println("Some of the test cases had errors :-(");
		else
			System.out.println("You're a stud (at least on the test data)! :-D ");
	}

}
//Powered by [KawigiEdit] 2.0!
