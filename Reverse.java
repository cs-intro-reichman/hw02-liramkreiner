/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args)
	{
		String revstring = "";//define a new string to be the reverse
		String strorigin = args[0];
		for(int i = strorigin.length() - 1; i > -1; i --)//getting from the last char to the first one
		{
			revstring = revstring + strorigin.charAt(i);//run from the last char of the origin string and add it to new string		
		}

		System.out.println(revstring);
		System.out.println("The middle character is " + strorigin.charAt((strorigin.length()-1)/2));//printing the middle char








	}
}
