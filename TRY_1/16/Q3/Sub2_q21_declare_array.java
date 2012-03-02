/************************************`
 * Sub2_q21_declare_array.java
 * Author: Iwabuchi Ken				*
 * Date: 20120302_093458
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

public class Sub2_q21_declare_array {
	public  static void main(String[] args) {
		/* variables			*/
		String		a1[]	= {"abc", "def"};		/* array of strings		*/
		String[]		a2		= {"abc", "def"};		/* array of strings		*/
//		String[2]		a3	= {"abc", "def"};		/* array of strings		*/
		//=> ï∂Ç≈ÇÕÇ†ÇËÇ‹ÇπÇÒÅB
//		String		a2[2]	= {"abc", "def"};		/* array of strings		*/
		//=> ï∂Ç≈ÇÕÇ†ÇËÇ‹ÇπÇÒÅB
		
		/* show values	*/
		for (int i = 0; i < a1.length; i++) {
			System.out.printf("a1[%d]=%s\n", i, a1[i]);
		}
		
		for (int i = 0; i < a2.length; i++) {
			System.out.printf("a2[%d]=%s\n", i, a2[i]);
		}
		
//		System.out.println("<a3>" + a3.toString());
//		for (int i = 0; i < a3.length; i++) {
//			System.out.printf("a3[%d]=%s\n", i, a3[i]);
//		}
		
	}//public  static void main(String[] args)
}//public class Sub2_q21_declare_array
