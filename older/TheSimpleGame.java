import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class TheSimpleGame
{
	boolean isCorner(int x, int y , int n)
	{
		if((x == 1 && y== n) ||(x== n && y == 1) || (x == 1 && y== 1) || (x == n && y == n))
			return true;
		else
			return false;
	
	}
	int findMinDistance(int x, int y, int n)
	{
		int d1 = Math.abs(x-1) + Math.abs(y-1);
		int d2 = Math.abs(x-1) + Math.abs(y-n);
		int d3 = Math.abs(x-n) + Math.abs(y-1);
		int d4 = Math.abs(x-n) + Math.abs(y-n);
		return Math.min(Math.min(d1,d2),Math.min(d3,d4));
	
	}
	
	public int count(int n, int[] x, int[] y)
	{
		int ans = 0;
		for(int i = 0; i < x.length; i++)
		{
			if( !isCorner(x[i], y[i], n))
			{
				ans += findMinDistance(x[i],y[i], n);
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
		answer = new TheSimpleGame().count(4, new int[]{2}, new int[]{3});
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
		answer = new TheSimpleGame().count(3, new int[]{2, 2, 1, 3}, new int[]{2, 2, 3, 1});
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
		answer = new TheSimpleGame().count(7, new int[]{7, 1, 7, 7, 1, 7, 1}, new int[]{7, 1, 1, 1, 1, 7, 7});
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
		
		
		if (errors)
			System.out.println("Some of the test cases had errors :-(");
		else
			System.out.println("You're a stud (at least on the test data)! :-D ");
	}

}
//Powered by [KawigiEdit] 2.0!
