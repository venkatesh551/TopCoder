import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class GameOfSegments
{
	public int winner(int N)
	{
		int x =  N + N - 3;
		
		if ((x & 1) == 0)
		{
			return 2;
		}
		else
		{
			return 1;
		}
	}
	
	public static void main(String[] args)
	{
		long time;
		int answer;
		boolean errors = false;
		int desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new GameOfSegments().winner(3);
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
		answer = new GameOfSegments().winner(4);
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
		answer = new GameOfSegments().winner(15);
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
		answer = new GameOfSegments().winner(191);
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
		
		
		if (errors)
			System.out.println("Some of the test cases had errors :-(");
		else
			System.out.println("You're a stud (at least on the test data)! :-D ");
	}

}
//Powered by [KawigiEdit] 2.0!
