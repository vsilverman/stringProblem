/**
Define a Java class to solve this problem:
Given a String and a Character, remove all instances of the Character in the String

Solve this two ways:
1. Iterate through the String, one character at a time
2. Find a method in the String class that can solve this in one line

Write methods for each solution.

Afterwards, write a TestNG or JUnit class for each solution which tests these methods.
Include both positive and negative cases for validations.
 */

/**
 * @author Vlad
 *
 */
public class RemoveCharFromString {

	public static String str = "Apple interview";
	public static char ch = 'p';
	
	public String RemCharMethod1(String s, char c) {
		if (s == null)
			return null;
		String res = "";
	    char[] chstr = s.toCharArray();
	    for (char celem : chstr) {
	    	if (celem != c)
	    		res += celem;
	    }
		return res;
	}

	public String RemCharMethod2(String s, char c) {
		if (s == null)
			return null;
		String res = "";
		res = s.replace(String.valueOf(c), "");
		return res;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 2)
			System.out.println("Using default params");
		else {
			str = args[0];
			ch = args[1].charAt(0);
		}
		System.out.println("Original string = " + str);
		RemoveCharFromString rcfs = new RemoveCharFromString();
		System.out.println("Result for method 1 = " + rcfs.RemCharMethod1(str, ch));
		System.out.println("Result for method 2 = " + rcfs.RemCharMethod2(str, ch));
		
	}

}
