/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int sum = 0 , thedeviser = 1;
		int theperfctumber = Integer.parseInt(args[0]);
		String sequence = "";
		while (thedeviser<theperfctumber)
		{
			if(theperfctumber%thedeviser == 0)
			{
				sum += thedeviser;
				sequence += thedeviser + " + ";
			}
			thedeviser++;
		}

		if(sum == theperfctumber)
		System.out.println( theperfctumber+" is a perfect number since " + theperfctumber + " = " + sequence.substring(0,sequence.length()-3) );
		else System.out.println(theperfctumber + " is not a perfect number");
	}
}
