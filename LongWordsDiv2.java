import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class LongWordsDiv2
{
	private boolean consecutive(String s)
	{
		int len = s.length();
		
		for (int i = 1; i < len; i++)
		{
			if (s.charAt(i) == s.charAt(i-1))
			{
				return true;
			}
		
		}
		return false;
	
	}
	private boolean subsequence(String s)
	{
		int len = s.length();
		int map[] = new int[128];
		int cnt = 0;
		
		for (int i = 0; i < len ; ++i)
		{
			int x = s.charAt(i);
			
		}
		if (cnt >= 2)
			return true;
		else
			return false;
	
	}
	

	public String find(String word)
	{
		if (consecutive(word) || subsequence(word))
		{
			return "Dislikes";
		}
		else
		{
			return "Likes";
		}
	}

}
//Powered by [KawigiEdit] 2.0!
