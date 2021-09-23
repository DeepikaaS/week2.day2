package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here is the input
		String text = "feeling good";

		// Build the logic to find the count of each
		// Pseudo Code: 1
		// a) Convert the String to character array
		char[] charArray = text.toCharArray();
		// a) Find the length of the string
		int length = text.length();
		System.out.println(length);
		// b) Traverse through each character (using loop in reverse direction)
		// System.out.print(charArray[11]);
		// Traverse through each index from length-1 -> 0 (using loop in reverse
		// direction)
		for (int i = text.length() - 1; i > 0; i--) {
			// Find the character of the String using its index
			// Print the character (without newline -> like below
			System.out.print(charArray[i]);
		}

	}

}
