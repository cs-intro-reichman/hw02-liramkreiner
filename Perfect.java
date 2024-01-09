/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// creating sum that i could test if is equal to the number we get and create deviser that follow all the options of the possible deviser
		// #feedback: use camelCase to decalre variable names with more than 1 word.
		int sum = 0 , theDeviser = 1;
		int thePerfectNumber = Integer.parseInt(args[0]);
		String sequence = ""; //creating sequnce that save all the deviser in string
		while (theDeviser<thePerfectNumber)
		{
			if(thePerfectNumber%theDeviser == 0) //checking if the cuurent number is deviser
			{
				sum += theDeviser;
				sequence += theDeviser + " + ";
			}
			theDeviser++;
		}

		if(sum == thePerfectNumber) {//checikng if the number is perfect
			// #feedback: better to not do calculations inside another method call.
			sequence = sequence.substring(0,sequence.length()-3);
			System.out.println( thePerfectNumber+" is a perfect number since " + thePerfectNumber + " = " + sequence ); //printing the sequense without the last + and space
		} else {
			System.out.println(theperfctumber + " is not a perfect number");
		}
	}
}
