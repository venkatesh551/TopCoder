import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class ComparerInator
{
	private boolean condEquals(int[] A, int[] B, int[] wanted, boolean cond)
	{
		int t, i;
		
		for(i = 0; i < A.length; i++)
		{  					
			if(cond)
				t = A[i] < B[i] ? A[i] : B[i];
			else
				t = A[i] < B[i] ? B[i] : A[i];
		
			if( t != wanted[i])
				break;
		}
		if(i == A.length)
			return true;
		else
			return false;
	
	}
	
	public int makeProgram(int[] A, int[] B, int[] wanted)
	{
		if(Arrays.equals(A,wanted) || Arrays.equals(B, wanted))
			return 1;
		else if(condEquals(A, B, wanted, false) || condEquals(A, B, wanted, true))
			return 7;
		else
			return -1;
		
	}
	
	public static void main(String[] args)
	{
		long time;
		int answer;
		boolean errors = false;
		int desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new ComparerInator().makeProgram(new int[]{1}, new int[]{2}, new int[]{2});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 1;
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
		answer = new ComparerInator().makeProgram(new int[]{1,3}, new int[]{2,1}, new int[]{2,3});
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
		time = System.currentTimeMillis();
		answer = new ComparerInator().makeProgram(new int[]{1,3,5}, new int[]{2,1,7}, new int[]{2,3,5});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = -1;
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
		answer = new ComparerInator().makeProgram(new int[]{1,3,5}, new int[]{2,1,7}, new int[]{1,3,5});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 1;
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
		answer = new ComparerInator().makeProgram(new int[]{1,2,3,4,5,6,7,8,9,10,11}, new int[]{5,4,7,8,3,1,1,2,3,4,6}, new int[]{1,2,3,4,3,1,1,2,3,4,6});
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
		time = System.currentTimeMillis();
		answer = new ComparerInator().makeProgram(new int[]{1,5,6,7,8}, new int[]{1,5,6,7,8}, new int[]{1,5,6,7,8});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 1;
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
