import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class TwiceString
{
	public String getShortest(String s)
	{
		int i, k, N = s.length();
		
		for(i = 1; i < N; i++){
			k = 0;
			while(i+k < N && s.charAt(i+k) == s.charAt(k))
				k++;
			if(i+k == N)
				break;
		}
		return s + s.substring(N-i, N);
		
	}
	
	
}
//Powered by [KawigiEdit] 2.0!
