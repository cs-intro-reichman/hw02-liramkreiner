/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args)
	{
		String revstring = "";
		String strorigin = args[0];
		for(int i = strorigin.length() - 1; i > -1; i --)
		{
			revstring = revstring + strorigin.charAt(i);		
		}

		System.out.println(revstring);
		System.out.println("The middle character is " + strorigin.charAt((strorigin.length()-1)/2));








	}
}
