/************************************`
 * program.java
 * Author: Iwabuchi Ken				*
 * Date: 20120302_093458
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

public class program {
	public  static void main(String[] args) {
		/* arguments?		*/
		if (args.length < 1) {
			System.out.println("We need arguments.");
			System.exit(1);
		}
		
		/* set initial values		*/
		int	max	= Integer.parseInt(args[0]);
		int	min	= Integer.parseInt(args[0]);
		int	tmp	= 0;

		for (int i = 1; i < args.length; i++) {
			/* set the arg value to tmp		*/
			tmp = Integer.parseInt(args[i]);
			
			/* judge		*/
			if (max < tmp) {
				max = tmp;
			}
			if (min > tmp) {
				min = tmp;
			}
			
		}//for (int i = 1; i < args.length; i++)
		
		/* show the result		*/
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		
	}//public  static void main(String[] args)	
}//public class program
