package programs;

import java.util.Arrays;

public class Anogram {
	public static void main(String[]args) {
		
		String s1="car";
		String s2="arc";
				
		boolean checkAnagrams= isAnagrams(s1,s2);
		if(checkAnagrams)
			System.out.println("it is anagrams");
		else 
			System.out.println("it is not anagrams");
		
	}

	private static boolean isAnagrams(String s1, String s2) {
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.toString(c1).equals(Arrays.toString(c2)))
			return true;
		
		return false;
	}

}







