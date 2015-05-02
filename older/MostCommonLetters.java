import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class MostCommonLetters
{
	public String listMostCommon(String[] text)
	{
		int[] alphaCount = new int[128];
		int max;
		String ans = "";
		for(int i = 0; i < text.length; i++)
		{
			for(int j= 0 ; j < text[i].length(); j++)
			{
				char c = text[i].charAt(j);
				alphaCount[c]++;
			}
		
		}
		max = 0;
		for(char i = 'a' ; i <= 'z'; i++)
		{	
			if(alphaCount[i] > max)
			{
				max = alphaCount[i];
			}
		}
		for(char i = 'a' ; i <= 'z'; i++)
		{	
			if(alphaCount[i] == max)
			{
				ans += i;
			}
		}
		return ans;
	}
	
	public static void main(String[] args)
	{
		long time;
		String answer;
		boolean errors = false;
		String desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new MostCommonLetters().listMostCommon(new String[]{"abc a"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "a";
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
		answer = new MostCommonLetters().listMostCommon(new String[]{"abc", "ab"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "ab";
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
		answer = new MostCommonLetters().listMostCommon(new String[]{"qwerty", "abc", "qwe", "a"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "aeqw";
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
		answer = new MostCommonLetters().listMostCommon(new String[]{"english is a west germanic language originating", "in england and is the first language for most", "people in the united kingdom the united", "states canada australia new zealand ireland", "and the anglophone caribbean it is used", "extensively as a second language and as an", "official language throughout the world", "especially in commonwealth countries and in", "many international organizations"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "a";
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
		answer = new MostCommonLetters().listMostCommon(new String[]{"amanda forsaken bloomer meditated gauging knolls", "betas neurons integrative expender commonalities", "latins antidotes crutched bandwidths begetting", "prompting dog association athenians christian ires", "pompousness percolating figured bagatelles bursted", "ninth boyfriends longingly muddlers prudence puns", "groove deliberators charter collectively yorks", "daringly antithesis inaptness aerosol carolinas", "payoffs chumps chirps gentler inexpressive morales"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "e";
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
