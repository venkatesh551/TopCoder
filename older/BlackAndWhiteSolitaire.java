import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class BlackAndWhiteSolitaire
{
	public int minimumTurns(String cardFront)
	{
		int[] evenpos = new int[2];
		int[] oddpos =  new int[2];
		for(int i = 0; i < cardFront.length(); i+=2){
			if(cardFront.charAt(i) == 'B')
				evenpos[0]++;
			else
				evenpos[1]++;
		}
		for(int i = 1; i < cardFront.length(); i+=2){
			if(cardFront.charAt(i) == 'B')
				oddpos[0]++;
			else
				oddpos[1]++;
		}
		if(evenpos[0] > oddpos[0])
			return evenpos[1] + oddpos[0];
		else
			return evenpos[0] + oddpos[1];
	}
	
	public static void main(String[] args)
	{
		long time;
		int answer;
		boolean errors = false;
		int desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new BlackAndWhiteSolitaire().minimumTurns("BBBW");
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
		answer = new BlackAndWhiteSolitaire().minimumTurns("WBWBW");
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
		answer = new BlackAndWhiteSolitaire().minimumTurns("WWWWWWWWW");
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
		answer = new BlackAndWhiteSolitaire().minimumTurns("BBWBWWBWBWWBBBWBWBWBBWBBW");
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
		
		
		if (errors)
			System.out.println("Some of the test cases had errors :-(");
		else
			System.out.println("You're a stud (at least on the test data)! :-D ");
	}

}
//Powered by [KawigiEdit] 2.0!
