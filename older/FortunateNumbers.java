import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class FortunateNumbers
{
	private boolean isFortunate(int num)
	{
		do{
			int r = num % 10;
			num /= 10;
			if(r != 5 && r != 8)
				return false;
		}while(num > 0);
		
		return true;
	
	}
	public int getFortunate(int[] a, int[] b, int[] c)
	{
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < b.length; j++)
			{
				for(int k = 0; k < c.length; k++)
				{
					int sum = a[i] + b[j] + c[k];
					if(isFortunate(sum))
						set.add(sum);
				
				}
			}
		}
		return set.size();
	}
	
	public static void main(String[] args)
	{
		long time;
		int answer;
		boolean errors = false;
		int desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new FortunateNumbers().getFortunate(new int[]{ 1, 10, 100 }, new int[]{ 3, 53 }, new int[]{ 4, 54 });
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 2;
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
		answer = new FortunateNumbers().getFortunate(new int[]{ 47 }, new int[]{ 500 }, new int[]{ 33 });
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
		answer = new FortunateNumbers().getFortunate(new int[]{ 100, 1, 10, 100, 1, 1 }, new int[]{ 3, 53, 53, 53, 53, 53, 53 }, new int[]{ 4, 54, 4, 54, 4, 54 });
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 2;
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
		answer = new FortunateNumbers().getFortunate(new int[]{ 500, 800 }, new int[]{ 50, 80 }, new int[]{ 5, 8 });
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
		answer = new FortunateNumbers().getFortunate(new int[]{ 30000, 26264 }, new int[]{ 30000, 29294 }, new int[]{ 30000, 29594 });
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
		
		
		if (errors)
			System.out.println("Some of the test cases had errors :-(");
		else
			System.out.println("You're a stud (at least on the test data)! :-D ");
	}

}
//Powered by [KawigiEdit] 2.0!
