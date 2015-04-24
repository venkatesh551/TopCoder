import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class IDNumberVerification
{

	private boolean isLeapYear(int year) 
	{
		if(year %4 == 0 && year %100 != 0  || (year % 400 == 0))
			return true;
		else
			return false;
	
	}
	private boolean isBirthdayValid(String bDay) 
	{
	      int[]  daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	      int year = Integer.parseInt(bDay.substring(0, 4));
	      int month = Integer.parseInt(bDay.substring(4, 6));
	      int day = Integer.parseInt(bDay.substring(6, 8));
	      if(isLeapYear(year))
	      	daysInMonth[2]++;
	      if(year < 1900 || year > 2011 || month < 1 || month > 12 || day < 1 || day > daysInMonth[month])
	      {
	      	return false;
	      }
	      else
	      {
	      	return true;
	      }
	}
	
	private boolean isRegionCodeValid(String rCode, String[] codes) 
	{
	    for(int i = 0; i < codes.length; i++)
	    {
	    	if(rCode.equals(codes[i]))
	    		return true;
	    }
	    return false;
	}
	private boolean isCheckSumCodeValid(String id)
	{
		int result = 0, base = 2;
		
		for(int i = 16; i >= 0; i--)
		{
			int temp = ((id.charAt(i) - '0') * base ) % 11;
			result = (result + temp ) % 11;
			base = (base * 2) % 11;
		}
		int lastD= id.charAt(17) -'0';
		switch(result)
		{
			case 0: 
			case 1: if(1 - result == lastD)
						return true;
					break;
			case 2: if(id.charAt(17) == 'X')
						return true;
					break;
			default: if(12 -result == lastD)
						return true;
		
		}
		return false;
	
	}
	public String verify(String id, String[] regionCodes)
	{
		String rCode = id.substring(0,6);
		String bDay = id.substring(6,14);
		String seqCode = id.substring(14, 17);
		
		if(isRegionCodeValid(rCode, regionCodes)  &&  isBirthdayValid(bDay) && !seqCode.equals("000") && isCheckSumCodeValid(id))
		{
			int sCode = Integer.parseInt(seqCode);
			if(sCode % 2 == 0)
				return "Female";
			else
				return "Male";
		}
		return "Invalid";
	}
	
	public static void main(String[] args)
	{
		long time;
		String answer;
		boolean errors = false;
		String desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new IDNumberVerification().verify("530326191602290964", new String[]{"530326"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Female";
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
		answer = new IDNumberVerification().verify("62012319240507058X", new String[]{"620123"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Female";
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
		answer = new IDNumberVerification().verify("321669197204300886", new String[]{"610111","659004"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Invalid";
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
		answer = new IDNumberVerification().verify("230231198306900162", new String[]{"230231"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Invalid";
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
		answer = new IDNumberVerification().verify("341400198407260005", new String[]{"341400"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Invalid";
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
		answer = new IDNumberVerification().verify("520381193206090891", new String[]{"532922","520381"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = "Invalid";
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
