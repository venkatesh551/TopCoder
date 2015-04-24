import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class EllysDirectoryListing
{
	public String[] getFiles(String[] files)
	{
		int length = files.length;
		int lastPos = length-1;
		String temp;
		
		for(int i = 0; i < length - 2; i++)
		{
			if(files[i].equals(".") || files[i].equals(".."))
			{ 
				temp =files[lastPos];
				files[lastPos] = files[i];
				files[i] = temp;
				lastPos--;
				if(files[i].equals("..")|| files[i].equals(".") )
				{
					i--;
				}
				
			}
	
		}
		return files;
	}
	
	
}
//Powered by [KawigiEdit] 2.0!
