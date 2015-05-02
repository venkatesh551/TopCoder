import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class SoccerLeagues
{
	public int[] points(String[] matches)
	{
		
		int[] result = new int[matches.length];
		int R, C;
		R = C = matches.length ;
		 
		for(int i = 0; i < R; i++)
		{
			for(int j = 0; j < C; j++)
			{
				switch(matches[i].charAt(j))
				{
					case 'W' : result[i]+= 3; break;
					case 'L' : result[j]+= 3; break;
					case 'D' : result[i]++; 
							   result[j]++; 
							   break;
				
				}
				
			}		
		}
		
		return result;
	}
	
	
}
//Powered by [KawigiEdit] 2.0!
