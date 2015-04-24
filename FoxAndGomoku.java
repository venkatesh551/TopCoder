import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class FoxAndGomoku
{

	boolean rowTraverse(String[] board)
	{
		int R = board.length;
		
		for(int i = 0; i < R; i++)
		{
			int count = 0, max = 0;
			
			for(int j = 0; j < R; j++)
			{
				if(board[i].charAt(j) == 'o')
				{
					count++;
				}
				else
				{
					max = Math.max(max, count);
					count = 0;
				}
			}
			if(max >= 5)
				return true;
		
		}
		return false;
		
	}
	
	boolean colTraverse(String[] board)
	{
		int R = board.length;
		
		for(int i = 0; i < R; i++)
		{
			int count = 0, max = 0;
			
			for(int j = 0; j < R; j++)
			{
				if(board[j].charAt(i) == 'o')
				{
					count++;
				}
				else
				{
					max = Math.max(max, count);
					count = 0;
				}
			}
			if(max >= 5)
				return true;
		
		}
		return false;
		
	}
	
	boolean diagTraverse(String[] board)
	{
		int R = board.length;
		
		for(int i = 0; i < R; i++)
		{
			int count = 0, max = 0;
			
			for(int k = i, j = 0; j <= i; j++, k--)
			{
				if(board[k].charAt(j) == 'o')
				{
					count++;
				}
				else
				{
					max = Math.max(max, count);
					count = 0;
				}
			}
			if(max >= 5)
				return true;
		
		}
		for(int i = R-1, j = 1; j < R; j++)
		{
			int count = 0, max = 0;
			
			for(int f= i, k = j; k < R; k++, f--)
			{
				if(board[f].charAt(k) == 'o')
				{
					count++;
				}
				else
				{
					max = Math.max(max, count);
					count = 0;
				}
			}
			if(max >= 5)
				return true;
		
		}
		for(int i = 0; i < R; i++)
		{
			int count = 0, max = 0;
			
			for(int k = i, j= 0; j < R; j++, k++)
			{
				if(board[k].charAt(j) == 'o')
				{
					count++;
				}
				else
				{
					max = Math.max(max, count);
					count = 0;
				}
			}
			if(max >= 5)
				return true;
		
		}
		
		for(int i = 0, j = 1; j < R; j++)
		{
			int count = 0, max = 0;
			
			for(int f= i, k = j; k < R; k++, f++)
			{
				if(board[f].charAt(k) == 'o')
				{
					count++;
				}
				else
				{
					max = Math.max(max, count);
					count = 0;
				}
			}
			if(max >= 5)
				return true;
		
		}
		return false;
	
	}
	
	
	public String win(String[] board)
	{
		int R = board.length;
		if(rowTraverse(board) || colTraverse(board) || diagTraverse(board))
			return "fou"
	}
	
	public static void main(String[] args)
	{
		long time;
		String answer;
		boolean errors = false;
		String desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new FoxAndGomoku().win(new String[]{"....o.", "...o..", "..o...", ".o....", "o.....", "......"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "found";
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
		answer = new FoxAndGomoku().win(new String[]{"oooo.", ".oooo", "oooo.", ".oooo", "....."} );
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "not found";
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
		answer = new FoxAndGomoku().win(new String[]{"oooo.", ".oooo", "oooo.", ".oooo", "....o"} );
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "found";
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
		answer = new FoxAndGomoku().win(new String[]{"o.....", ".o....", "..o...", "...o..", "....o.", "......"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "found";
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
		answer = new FoxAndGomoku().win(new String[]{"o....", "o.o..", "o.o.o", "o.o..", "o...."});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "found";
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
		answer = new FoxAndGomoku().win(new String[]{"..........", "..........", "..oooooo..", "..o.......", "..o.......", "..oooooo..", ".......o..", ".......o..", "..oooooo..", ".........."} );
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "found";
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
		answer = new FoxAndGomoku().win(new String[]{"..........", "..........", "..oooo.o..", "..o.......", "..o.......", "..o.oooo..", ".......o..", ".......o..", "..oooo.o..", ".........."});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "not found";
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
		answer = new FoxAndGomoku().win(new String[]{"ooooo", "ooooo", "ooooo", "ooooo", "ooooo"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "found";
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
		answer = new FoxAndGomoku().win(new String[]{".....", ".....", ".....", ".....", "....."});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "not found";
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
