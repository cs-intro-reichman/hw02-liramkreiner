/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args)
	{
		int numberoffamily = Integer.parseInt(args[0]);
		int countotalchildern = 0 , count2ch = 0 , count3ch = 0 , count4ch = 0 ;
		for (int i=0;i<numberoffamily;i++)
		{
		int countlocalchild = 0;
		boolean boy = true, girl = true; //checking if i have both girl and boy
			while (boy || girl)
			{	

				double isgender = Math.random();
				if(isgender > 0.5)
				{
					girl = false;
				}
				
				else
				{	
					boy = false;
				} 	
				countlocalchild ++;
				countotalchildern ++;

			}

			if (countlocalchild == 2 )
					count2ch++;
			if (countlocalchild == 3 )
					count3ch++;
			if (countlocalchild > 3 )
					count4ch++;	
		}
		double numberoffamilydouble = 0.0 + numberoffamily;
		System.out.println("Average: "+ countotalchildern/numberoffamilydouble +" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+count2ch);
		System.out.println("Number of families with 3 children: "+count3ch);
		System.out.println("Number of families with 4 or more children: "+count4ch);
		int commonfamily = Math.max( (Math.max(count2ch,count3ch)),count4ch);
		if (commonfamily == count2ch)
			System.out.println("The most common number of children is 2");
			else if (commonfamily == count3ch)
					System.out.println("The most common number of children is 3");
						else if (commonfamily == count4ch)
						System.out.println("The most common number of children is 4 or more");


	}
}
