import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class AlphabetPath
{
	public String doesItExist(String[] letterMaze)
	{
		
		int i = 0, j = 0;
		int R = letterMaze.length;
		int C = letterMaze[0].length();
		char[][] mat= new char[R][];
		char nextLetter;
		for(i = 0; i < R; i++){
			mat[i] = letterMaze[i].toCharArray();
		}
		
		for(i = 0; i < R; i++){
			for(j = 0; j < C; j++){
				if(mat[i][j] == 'A')
					break;
			}
			if(j < C)
				break;
		}
		nextLetter = 'B';
		while(nextLetter <= 'Z')
		{
			
			if(j+1 < C && mat[i][j+1] == nextLetter)
				j++;
			else if(j-1 >= 0 && mat[i][j-1] == nextLetter)
				j--;
			else if(i+1 < R && mat[i+1][j] == nextLetter)
				i++;
			else if(i-1 >= 0 && mat[i-1][j] == nextLetter)
				i--;
			else
				break;
			
			nextLetter++;
		}
		if(nextLetter > 'Z')
			return "YES";
		else
			return "NO";
	}
	
	public static void main(String[] args)
	{
		long time;
		String answer;
		boolean errors = false;
		String desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new AlphabetPath().doesItExist(new String[]{"ABCDEFGHIJKLMNOPQRSTUVWXYZ"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "YES";
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
		answer = new AlphabetPath().doesItExist(new String[]{"ADEHI..Z", "BCFGJK.Y", ".PONML.X", ".QRSTUVW"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "YES";
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
		answer = new AlphabetPath().doesItExist(new String[]{"ACBDEFGHIJKLMNOPQRSTUVWXYZ"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "NO";
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
		answer = new AlphabetPath().doesItExist(new String[]{"ABC.......", "...DEFGHIJ", "TSRQPONMLK", "UVWXYZ...."});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "NO";
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
		answer = new AlphabetPath().doesItExist(new String[]{"..............", "..............", "..............", "...DEFGHIJK...", "...C......L...", "...B......M...", "...A......N...", "..........O...", "..ZY..TSRQP...", "...XWVU.......", ".............."});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "YES";
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
