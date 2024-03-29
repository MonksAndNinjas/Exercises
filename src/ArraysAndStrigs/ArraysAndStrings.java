// Problem 1: Is Unique: Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures?

package ArraysAndStrigs;

public class ArraysAndStrings {

/*
	// Assumes ASCII string
	// Time Complexity is O(n)
	// Could argue the time complexity is O(1), since for loop will never iterate through more
	// than 128 characters
*/
	
	 public static boolean isUniqueChars(String str) {
		 	if (str.length() > 128) return false;

			boolean[] char_set = new boolean[128];
			for (int i = 0; i < str.length(); i++) {
				int val = str.charAt(i);
				if (char_set[val]) { // Already found this char in string
					System.out.print("false");
					return false;
				}
				char_set[val] = true;
			}
			System.out.print("true");
			return true;
		}

	 public static void main(String[] args) {
		 String abc = "yes";

	 	 isUniqueChars(abc);
	 }
}
