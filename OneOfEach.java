
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args)
	{
		int count = 0;
		boolean boy = true, girl = true; //checking if i have both girl and boy
		while (boy || girl)
		{	

			double isgender = Math.random();
			if(isgender > 0.5)
			{
				System.out.print(" g ");
				girl = false;
			}
				
			else
			{
				System.out.print(" b ");	
				boy = false;
			} 	
			count ++;
		}
		System.out.println("");
		System.out.print("You made it... and you now have " + count + " children.") ;
	}
}
