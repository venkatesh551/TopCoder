import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class EllysRoomAssignmentsDiv2
{

	private int binSearch (int[] list, int item)
	{
	  int bottom = 0;
	  int top = list.length - 1;
	  int middle;
	  boolean found = false;
	  int location = -1;
	
	  while (bottom <= top && !found) {
	        
	    middle = (bottom + top) / 2;
	 
	    if(list[middle] == item) {            
	      found = true;
	      location = middle;
	    } else if (list[middle] < item) {  
	      bottom = middle + 1;
	    } else {
	      top = middle - 1;
	    }
	  }
	  return location;
	}
	public double getProbability(String[] ratings)
	{
		int N, R, ellysRating, loc;
		int arr[] ;
		int i, j, k;
		String ratingList = "";
		for(i = 0; i < ratings.length; i++){
			ratingList += ratings[i];
		}
		String[] listOfNum = ratingList.split(" ");
		arr =  new int[listOfNum.length];
		for(i = 0; i < listOfNum.length; i++){
			arr[i] = Integer.parseInt(listOfNum[i]);
		}
		ellysRating = arr[0];
		N = listOfNum.length;
		R = N/20;
		if(N % 20 != 0){
			R++;
		}

		Arrays.sort(arr);
		if(R == 1 || arr[N-1] == ellysRating)
			return 1.0;
		loc = binSearch(arr, ellysRating);
		if(loc >=  N-R-1)
			return 0.0;
		else
			return 1.0/R;
		
	}
	
	
}
//Powered by [KawigiEdit] 2.0!
