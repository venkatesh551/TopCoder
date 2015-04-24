import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class TeamsSelection
{
	public String simulate(int[] preference1, int[] preference2)
	{
		int len = preference1.length;
		boolean[] player = new boolean[len+1];
		char[] ans = new char[len];
		for(int i = 0, j = 0, k = 0; i < len; i++)
		{
			if(i%2 == 0)
			{
				while(j < len && player[preference1[j]] == true)	
					j++;
				if(j < len)
				{
					player[preference1[j]] = true;
					ans[preference1[j] - 1] = '1';
				}			
			}
			else
			{
				while(k < len && player[preference2[k]] == true)	
						k++;
					if(k < len)
					{
						player[preference2[k]] = true;
						ans[preference2[k] - 1] = '2';
					}			
						
			}	
		
		}
		return new String(ans);
		
	}
	
	public static void main(String[] args)
	{
		long time;
		String answer;
		boolean errors = false;
		String desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new TeamsSelection().simulate(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "1212";
		System.out.println("Your answer:");
		System.out.println("\t\"" + answer + "\"");
		System.out.println("Desired answer:");
		System.out.println("\t\"" + desiredAnswer + "\"");
		if (!answer.equals(desiredAnswer))
		{
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		}
		else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new TeamsSelection().simulate(new int[]{3, 2, 1}, new int[]{1, 3, 2});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "211";
		System.out.println("Your answer:");
		System.out.println("\t\"" + answer + "\"");
		System.out.println("Desired answer:");
		System.out.println("\t\"" + desiredAnswer + "\"");
		if (!answer.equals(desiredAnswer))
		{
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		}
		else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new TeamsSelection().simulate(new int[]{6, 1, 5, 2, 3, 4}, new int[]{1, 6, 3, 4, 5, 2});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "212211";
		System.out.println("Your answer:");
		System.out.println("\t\"" + answer + "\"");
		System.out.println("Desired answer:");
		System.out.println("\t\"" + desiredAnswer + "\"");
		if (!answer.equals(desiredAnswer))
		{
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		}
		else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new TeamsSelection().simulate(new int[]{8, 7, 1, 2, 4, 5, 6, 3, 9}, new int[]{7, 2, 4, 8, 1, 5, 9, 6, 3});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "121121212";
		System.out.println("Your answer:");
		System.out.println("\t\"" + answer + "\"");
		System.out.println("Desired answer:");
		System.out.println("\t\"" + desiredAnswer + "\"");
		if (!answer.equals(desiredAnswer))
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
