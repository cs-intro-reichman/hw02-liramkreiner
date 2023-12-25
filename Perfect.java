/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// creating sum that i could test if is equal to the number we get and create deviser that follow all the options of the possible deviser
		int sum = 0 , thedeviser = 1;
		int theperfctumber = Integer.parseInt(args[0]);
		String sequence = ""; //creating sequnce that save all the deviser in string
		while (thedeviser<theperfctumber)
		{
			if(theperfctumber%thedeviser == 0) //checking if the cuurent number is deviser
			{
				sum += thedeviser;
				sequence += thedeviser + " + ";
			}
			thedeviser++;
		}

		if(sum == theperfctumber) //checikng if the number is perfect
		System.out.println( theperfctumber+" is a perfect number since " + theperfctumber + " = " + sequence.substring(0,sequence.length()-3) ); //printing the sequense without the last + and space
		else System.out.println(theperfctumber + " is not a perfect number");
	}
}
