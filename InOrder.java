/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) 
	{
		int previousnumber = (int)(Math.random()*10); //genrate number from 0 to 10
		System.out.println(previousnumber); //print the first number
		boolean inorder = true;
		while (inorder) 
		{
			int number = (int)(Math.random()*10); 
			if (previousnumber<number) //check if the number that we genrate is grater than the previous number and print him
			{
				System.out.println(number);
				previousnumber=number; // set the number to be the previous number
			}
			else inorder=false;
		}
		
	}
}
