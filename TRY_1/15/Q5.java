/************************************`
 * Q5.java
 * Author: Iwabuchi Ken				*
 * Date: 20120302_093458
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

public class Q5 {
	public  static void main(String[] args) {
		/* variables		*/
		String		moji;
		int			mojisu;
		
		/* set values		*/
		while (true) {
			if (args.length < 2) {
				System.out.println("Two arguments needed.");
				System.exit(1);
			} else  {
				break;
			}
		}//while (1)
		
		moji		= args[0];
		mojisu	= Integer.parseInt(args[1]);
		
		//debug
//		System.out.println("mojisu=" + mojisu);
//		System.exit(0);
		
		/* show: rectangle	*/
		for (int i = 1; i <= mojisu; i++) {
			for (int j = 1; j <= mojisu; j++) {
				System.out.print(moji);
				System.out.print(" ");
			}//for (int j = 1; j <= mojisu; j++)
			System.out.println();
		}//for (int i = 0; i <= mojisu; i++)
		
		/* show: triangle: asend	*/
		for (int i = 1; i <= mojisu; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(moji);
				System.out.print(" ");
			}//for (int j = 1; j <= mojisu; j++)
			System.out.println();
		}//for (int i = 0; i <= mojisu; i++)
		
		/* show: triangle: descend	*/
		for (int i = 1; i <= mojisu; i++) {
			for (int j = mojisu; j >= i; j--) {
				System.out.print(moji);
				System.out.print(" ");
			}//for (int j = 1; j <= mojisu; j++)
			System.out.println();
		}//for (int i = 0; i <= mojisu; i++)
		
	}//public  static void main(String[] args)
}//public class Q5
