/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int damkanumber= Integer.parseInt(args[0]); 
		for (int i = 0;i<damkanumber;i++)
		{
			for (int j = 0 ; j < damkanumber; j ++) //using for in for to print both line and queue
			{
				if(i % 2 == 0) //check if he is evan line to order the *
				System.out.print("* ");
			else System.out.print(" *");
			}
				
				System.out.println(""); 
		}
	}
}
