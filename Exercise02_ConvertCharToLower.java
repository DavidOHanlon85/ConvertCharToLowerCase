/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise02_ConvertCharToLower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		convertCharToLowerCase('a');
		convertCharToLowerCase('B');
		convertCharToLowerCase('c');
		convertCharToLowerCase('D');

	}

	/** 
	 * A Method that convert any upper case input characters into lower case characters
	 * @param inputChar - Input character to be changed to lower case if necessary
	 */
	public static void convertCharToLowerCase(char inputChar) {

		if (Character.isLowerCase(inputChar)) {
			System.out.println(inputChar + " is already in lower case.");
		} else {
			inputChar = Character.toLowerCase(inputChar);
			System.out.println(inputChar + " has been converted to upper case.");

		}

	}

}
