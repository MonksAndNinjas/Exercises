package ArraysAndStrigs;

public class ArraysAndStrings {

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
