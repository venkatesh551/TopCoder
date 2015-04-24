import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class BichromeBoard
{
	public String ableToDraw(String[] b)
	{
		int n = b.length;
		int m = b[0].length();
		char [][]board = new char[n][m];
		for (int i = 0; i < n; ++i)
		{
			board[i] = b[i].toCharArray();
		}
		int row_no = -1;
		for (int i = 0; i < n; ++i)
		{
			for (int j = 0; j < m; ++j)
			{
				if (board[i][j] == 'B')
				{
					board[i][j] = 0;
				}
				else if (board[i][j] == 'W')
				{
					board[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < n; ++i)
		{
			int j;
			for (j = 0; j < m; ++j)
			{
				if (board[i][j] != '?')
				{
					char cur = board[i][j], prev = cur;
					for (int k = j-1; k >=0; k--)
					{
						prev = (char)(1-prev);
						if (board[i][k] == '?')
						board[i][k] = prev;
					}
					prev = cur;
					for (int k = j+1; k < m; ++k)
					{
						prev = (char)(1-prev);
						if (board[i][k] == '?')
						board[i][k] = prev;
					}
					row_no = i;
					break;
				}
			}
			if (j < m)
				break;
		}
		if (row_no == -1)
		{
			return "Possible";
		}
		for (int i = row_no-1; i >= 0; --i)
		{
			for (int j = 0; j < m; ++j)
			{
				board[i][j] = (char)(1-board[i+1][j]);
			}
		}
		for (int i = row_no+1; i < n; ++i)
		{
			for (int j = 0; j < m; ++j)
			{
				board[i][j] = (char)(1 - board[i-1][j]);
			}
		}
		// Validation
		for (int i = 0; i < n; ++i)
		{
			for (int j = 0; j < m; ++j)
			{
				if ( (i+1) < n && board[i+1][j] == board[i][j])
				{
					return "Impossible";
				}
				if ( (j+1) < m && board[i][j+1] == board[i][j])
				{
					return "Impossible";
				}
			}
		}
		return "Possible";
	}
	
	public static void main(String[] args)
	{
		long time;
		String answer;
		boolean errors = false;
		String desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new BichromeBoard().ableToDraw(new String[]{"W?W", "??B", "???"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Possible";
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
		answer = new BichromeBoard().ableToDraw(new String[]{"W??W"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Impossible";
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
		answer = new BichromeBoard().ableToDraw(new String[]{"??"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Possible";
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
		answer = new BichromeBoard().ableToDraw(new String[]{"W???", "??B?", "W???", "???W"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Possible";
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
		answer = new BichromeBoard().ableToDraw(new String[]{"W???", "??B?", "W???", "?B?W"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Impossible";
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
		answer = new BichromeBoard().ableToDraw(new String[]{"B"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Possible";
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
