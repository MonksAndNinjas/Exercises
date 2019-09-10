/*
 * Assume you have a method isSubstring which checks if one word is a substring
 * of another. Given two strings, s1 and s2, write code to check if s2 is a rotation
 * of s1 using only one call to isSubstring.
 */

package StringRotation;

public class StringRotation {
	public static boolean isRotation(String s1, String s2) {
		int len = s1.length();
		
		/* Check that s1 and s2 are equal length and not empty */
		if (len == s2.length() && len > 0) {
			/* Concatenate s1 and s1 within new buffer */
			String s1s1 = s1 + s1;
			System.out.print(s1s1);
			
			return true;
		}
		System.out.print("false");
		
		return false;
	}
	
	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
	
		isRotation(s1, s2);
	}
}
