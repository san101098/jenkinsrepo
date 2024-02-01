package package3;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
	public static void main(String args[])
	{
		String str = "abdcebabc";
		char[] chars = str.toCharArray();
		List<Character> result = new ArrayList<Character>();
		int i =0;
		result.add(chars[0]);
		for(int k=1;k<chars.length-1;k++)                               
		{
			result.add(chars[k]);
			result.forEach(System.out::println);
			for(int j=0; j<i-1;j++)
			{
				if(chars[k]==result.get(j))
				{
					result.clear();
					System.out.println(result.get(i));
					break;
				}
			}
		}
		/*
		 * for(char c: result) { System.out.println(c); }
		 */
	}
}
