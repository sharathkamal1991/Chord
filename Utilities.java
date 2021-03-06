import java.util.*;
import java.io.*;

/**
 * Some utility functions
 */
public class Utilities
{
	public static final int stabilizationTimeout = 3000;// every 3 seconds
	public static final int fixFingersTimeout = 1000;// every second
	public static final int totalNodes = 8;	
	public static final int m = 3; // 2 ^ 3

	/**
	 * Checks if the key is between a and b.
	 */
	public static boolean checkRange(int key, int a, int b)
	{
		if(key > a && key <= b)
		{
			return true;
		}

		return false;
	}

	public static boolean checkRangeKey(int key,int a,int b)
	{
		// if 
		if(a > b)
		{
			if(key < a && key <=b)
			{
				return true;
			}
			if(key > a)
			{
				return true;
			}
		}

		if(a < b)
		{
			if(key>a && key <=b)
			{
				return true;
			}
		}


		return false;
	}



}