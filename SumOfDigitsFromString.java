package week2.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le79af65";
	//	int sum = 0;
		String digits = text.replaceAll("\\D", "");
		System.out.println(digits);
		Integer a=Integer.valueOf(digits);
		System.out.println(a);
		
		
		//for()
		/*
		 * Method 1
		 * Pseudo Code
		 
		 * Declare a String text with the following value
			
		   Declare a int variable sum
			
		 * a) using replaceAll(), replace all the non-digits into ""
		 * b) Now, convert the String into array
		 * c) Iterate over the array and get each character
		 * d) Using Character.getNumericValue(), Change the char into int
		 * e) Add the values to sum & print
		 * 
		 */
		
		/*
		 * Method 2
		 * Pseudo Code
		 * Declare a String text with the following value
			String text = "Tes12Le79af65";
		   Declare a int variable sum
			int sum = 0;
		 * a) Iterate an  array over the String
		 * b) Get each character and check if it is a number using Character.isDigit()
		 * c) Now covert char to int using Character.getNumericValue() and add it to sum
		 * d) Now Print the value
		 */
	}

}
