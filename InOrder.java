/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) 
	{
		int previousnumber = (int)(Math.random()*10);
		System.out.println(previousnumber);
		boolean inorder = true;
		while (inorder)
		{
			int number = (int)(Math.random()*10);
			if (previousnumber<number)
			{
				System.out.println(number);
				previousnumber=number;
			}
			else inorder=false;
		}
		
	}
}
