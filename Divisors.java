/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args)
	 {
		int number = Integer.parseInt(args[0]);
		int devisor = 1 ; //set the devisor on one and check all the devisers that could be
		while (devisor<number + 1)
		{
			if(number % devisor == 0) //check if the number is devisor and print him 
				System.out.println(devisor);
			devisor ++;
		}
	}
}
