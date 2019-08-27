//Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.

package CheckPermutation;

public class CheckPermutation {

	// Do the two strings have the same characters, but in different order?

	public static String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.parallelSort(content);

		String strContent = new String(content);
		System.out.print(strContent);
		return strContent;
	}

	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			System.out.print("false");
			return false;
		}
		return sort(s).equals(sort(t));
	}

	// Run program

	public static void main(String[] args) {
		String strOne = "yes";
		String strTwo = "sey";

		permutation(strOne, strTwo);
	}
}
