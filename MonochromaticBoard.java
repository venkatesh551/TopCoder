import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class MonochromaticBoard
{
	int cntNoOfRows(String[] board)
	{
		int cnt = 0, i, j;
		for(i = 0; i < board.length; i++){
			for( j = 0; j < board[i].length() && board[i].charAt(j) == 'B' ; j++)
						;
			if(j == board[i].length())
				cnt++;
			
		}
		return cnt;
	
	}
	
	
	int cntNoOfCols(String[] board)
	{
		int cnt = 0, i, j;
		for(j = 0; j < board[0].length() ; j++){
			for( i = 0; i <  board.length && board[i].charAt(j) == 'B' ; i++)
						;
			if(i == board.length)
				cnt++;
			
		}
		return cnt;
	
	}
	
	public int theMin(String[] board)
	{
		int rCount = cntNoOfRows(board);
		int cCount = cntNoOfCols(board);
		int R =  board.length ;
		int C = board[0].length();
		
		if(rCount ==  R && cCount == C)
		{
			if(R < C)
				return R;
			else
				return C;	
		}else{
			return rCount + cCount;
		}
	}
	
	public static void main(String[] args)
	{
		long time;
		int answer;
		boolean errors = false;
		int desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new MonochromaticBoard().theMin(new String[]{"WBWBW", "BBBBB", "WBWBW", "WBWBW"});
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
		answer = new MonochromaticBoard().theMin(new String[]{"BBBB", "BBBB", "BBBB"});
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
		answer = new MonochromaticBoard().theMin(new String[]{"BBBBB", "BBBBB", "BBBBB", "BBBBB", "BBBBB", "BBBBB", "BBBBB", "BBBBB"});
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
		answer = new MonochromaticBoard().theMin(new String[]{"WW", "WW"});
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
		answer = new MonochromaticBoard().theMin(new String[]{"BBBBBBBB", "BBBBBBBB", "BBBBBBBB", "WBWBBBWB", "BBBBBBBB"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 9;
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
