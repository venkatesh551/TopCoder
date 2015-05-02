import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class SimpleWordGame
{
	public int points(String[] player, String[] dictionary)
	{
		Set<String> wrds = new HashSet<String>();
		Set<String> dict = new HashSet<String>();
		
		for(int i = 0; i < player.length; i++)
			wrds.add(player[i]);
		for(int i = 0; i < dictionary.length; i++)
			dict.add(dictionary[i]);
		int ans  = 0;
		Iterator<String> iterator = wrds.iterator();
    	while(iterator.hasNext()) {
       	 	String ele = iterator.next();
     		if(dict.contains(ele))
     			ans += ele.length() * ele.length();
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
		answer = new SimpleWordGame().points(new String[]{ "apple", "orange", "strawberry" }, new String[]{ "strawberry", "orange", "grapefruit", "watermelon" });
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 136;
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
		answer = new SimpleWordGame().points(new String[]{ "apple" }, new String[]{ "strawberry", "orange", "grapefruit", "watermelon" });
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
		answer = new SimpleWordGame().points(new String[]{ "orange", "orange" }, new String[]{ "strawberry", "orange", "grapefruit", "watermelon" });
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 36;
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
		answer = new SimpleWordGame().points(new String[]{ "lidi", "o", "lidi", "gnbewjzb", "kten",  "ebnelff", "gptsvqx", "rkauxq", "rkauxq", "kfkcdn"}, new String[]{ "nava", "wk", "kfkcdn", "lidi", "gptsvqx",  "ebnelff", "hgsppdezet", "ulf", "rkauxq", "wcicx"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 186;
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
