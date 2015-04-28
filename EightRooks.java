import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class EightRooks
{
	public String isCorrect(String[] board)
	{
		int r = board.length;
		int c = board[0].length();
		boolean [] rows = new boolean[r];
		boolean [] cols = new boolean[c];
		int cnt = 0;
		for (int i = 0; i < r; ++i)
		{
			for (int j = 0; j < c; ++j)
			{
				if (board[i].charAt(j) == 'R')
				{
					if (!rows[i]  && !cols[j])
					{
						rows[i] = true;
						cols[j] = true;
						cnt++;
					}
					else
					{
						System.out.println(i + " " + j);
						return "Incorrect";
					}
				}
			}
		}
		if (cnt == 8)
			return "Correct";
		else
			return "Incorrect";
	}
	
	public static void main(String[] args)
	{
		long time;
		String answer;
		boolean errors = false;
		String desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new EightRooks().isCorrect(new String[]{"R.......", ".R......", "..R.....", "...R....", "....R...", ".....R..", "......R.", ".......R"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Correct";
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
		answer = new EightRooks().isCorrect(new String[]{"........", "....R...", "........", ".R......", "........", "........", "..R.....", "........"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Incorrect";
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
		answer = new EightRooks().isCorrect(new String[]{"......R.", "....R...", "...R....", ".R......", "R.......", ".....R..", "..R.....", ".......R"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Correct";
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
		answer = new EightRooks().isCorrect(new String[]{"......R.", "....R...", "...R....", ".R......", "R.......", ".......R", "..R.....", ".......R"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Incorrect";
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
		answer = new EightRooks().isCorrect(new String[]{"........", "........", "........", "........", "........", "........", "........", "........"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Incorrect";
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
