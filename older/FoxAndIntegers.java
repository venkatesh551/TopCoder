import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class FoxAndIntegers
{
	public int[] get(int AminusB, int BminusC, int AplusB, int BplusC)
	{
		int A, B, C;
		
		int temp = AplusB - AminusB;
		B = temp /2;
		C = BplusC - B;
		A = AplusB - B;
		if(A-B == AminusB && B-C == BminusC && A+B == AplusB && B+C == BplusC)
			return new int[]{A, B, C};
		else
			return new int[0];
		
	}
	
	
}
//Powered by [KawigiEdit] 2.0!
