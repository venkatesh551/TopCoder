import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class HugeGraph
{
	public long countComponents(long n, long[] d)
	{
		long[] P = new long[n];
		long[] R = new long[n];
		Arrays.sort(d);
		make_sets(P, R, n);
		for (long i = 0; i < n; ++i)
		{
			for (long j = 0; j < d.length; ++j)
			{
				long temp = i + d[j];
				if (temp < n)
				{
					join(P, R, i, temp);
				}
				
			}
		}
		return 0;
	}
	private void make_sets(long P[], long R[], long n)
	{
		long i;
	
		for (i = 1; i <= n; i++)
		{
			P[i] = i;
			R[i] = 0;
		}
	}
	
	private long find(long P[], long x)
	{
		if (x == P[x])
		{
			return x;
		}
		else
		{
			return find(P, P[x]);
		}
	}
	
	private void join(long P[], long R[], long x, long y)
	{
		long px = find(P, x);
		long py = find(P, y);
	
		if (px == py)
		{
			return;
		}
		if (R[px] > R[py])
		{
			P[py] = px;
		}
		else if (R[px] < R[py])
		{
			P[px] = py;
		}
		else
		{
			P[px] = py;
			R[py]++;
		}
	}
		
	public static void main(String[] args)
	{
		long time;
		long answer;
		boolean errors = false;
		long desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new HugeGraph().countComponents(5L, new long[]{2L});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 2L;
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
		answer = new HugeGraph().countComponents(6L, new long[]{2L, 3L});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 1L;
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
		answer = new HugeGraph().countComponents(10L, new long[]{6L, 8L, 9L});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 3L;
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
		answer = new HugeGraph().countComponents(100L, new long[]{10L, 20L, 30L, 40L, 50L, 60L, 70L, 80L, 90L});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 10L;
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
		answer = new HugeGraph().countComponents(33L, new long[]{30L, 29L, 26L, 15L});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 5L;
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
		answer = new HugeGraph().countComponents(808L, new long[]{195L, 774L, 788L, 781L, 723L});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 71L;
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
		answer = new HugeGraph().countComponents(47933736652472L, new long[]{47932970752927L, 47933439462262L, 2570167893116L, 47933306684356L, 47931823444952L});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 2566761627725L;
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
		answer = new HugeGraph().countComponents(45466964736857613L, new long[]{33250482667239488L, 37822264384529608L, 40095838646694298L, 43479356281340667L, 35203783529829951L, 40580747920061306L, 43377164971019776L, 39064579296221318L, 40001593684678420L, 33451277901601382L, 40995812050106167L, 37014304154501058L, 17759267713188789L, 36704554868973353L});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 3274732884432575L;
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
		answer = new HugeGraph().countComponents(927386907126310589L, new long[]{748147148561484840L, 701393167746858761L, 769696254000454180L, 704972921953280463L, 759946249333871738L, 884450289438010670L, 746985782208205106L, 774136608403627034L, 340934288037171102L, 842771692796482305L, 781200159564662404L, 714890479593837724L, 692135607544998078L, 869198777483846839L, 857427314409450650L, 769959320733418646L, 834561823397164073L, 859931184678488658L, 772342405210344280L, 884209280453229287L, 742707070877737742L, 713634305824576668L, 885018270712907537L, 774793793947310152L, 742703922481466469L, 903242244337866282L, 891008000483677106L, 811279910869615440L, 741113236129095213L, 739459726110363505L, 762358705144212813L, 830373753788440496L, 908779619221983459L, 887664283422679667L, 759617794878713552L, 910640611592949081L, 783409949952075625L, 863540471792847786L, 927341859483997999L, 836772868602095563L, 698935183681576178L, 862350615052508395L, 878270753526059153L, 702073460709372995L, 699733226194776258L, 695875778245571985L, 827812810943605830L, 873126653781760917L, 889807390074772165L, 897362441882835952L});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 95415956985202718L;
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
