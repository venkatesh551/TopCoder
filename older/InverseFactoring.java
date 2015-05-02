import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class InverseFactoring
{
	public int getTheNumber(int[] factors)
	{
	
			int min = 1000000, max = 0;
			for(int i = 0; i < factors.length; i++)
			{
				if(min > factors[i])
					min = factors[i];
				if(max  < factors[i])
					max = factors[i];
			
			}
			return min * max;
		
	}
	
	
}
//Powered by [KawigiEdit] 2.0!
