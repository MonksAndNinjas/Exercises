/*
 * One Away: There are three types of edits that an be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if 
 * they are one edit (or zero edits) away.
 */

package OneAway;

public class OneAway {
	public static boolean oneEditAway(String first, String second) {
		// Length checks
		if (Math.abs(first.length() - second.length()) > 1) {
			return false;
		}
		
		// Get shorter and longer string
		String s1 = first.length() < second.length() ? first : second;
		String s2 = first.length() < second.length() ? second: first;
		
		int index1 = 0;
		int index2 = 0;
		boolean foundDifference = false;
		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				// Ensure that this is the first difference found
				if (foundDifference) {
					System.out.print("false");
					return false;
				}
				foundDifference = true;
				
				if (s1.length() == s2.length()) {
					// On replace, move shorter pointer
					index1++;
				}
			} else {
				index1++; // If matching, move shorter pointer
			}
			index2++; // Always move pointer for longer string
		}
		System.out.print("true");
		return true;
	}
	
	public static void main(String[] args) {
		String s1 = "same";
		String s2 = "blame";
		
		oneEditAway(s1, s2);
	}
}
