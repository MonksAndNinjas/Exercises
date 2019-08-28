/*
 * URLify: Write a method to replace all spaces in a string with '%20'. You may assume
 * that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string. (Note: if implementing in
 * Java, please use a character array so that you can perform this operation in place.
 * EXAMPLE
 * Input: "Mr John Smith ", 13
 * Output: "Mr%20John%20Smith"
 */

package URLify;

// Start by editing the string starting from the end and working backwards.

public class URLify {
	public static void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		
		index = trueLength + spaceCount * 2;
		
		if (trueLength < str.length) str[trueLength] = '\0'; // End array
		
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
		System.out.print(str);
	}
	
	public static void main(String[] args) {
		String sentence = "Mr John Smith      ";
		
		// string to char array
		char[] charArray = sentence.toCharArray();
		
		replaceSpaces(charArray, 13);
	}
}
