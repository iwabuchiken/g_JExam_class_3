/************************************`
 * Sub1_q25_get_ascii_value.java
 * Author: Iwabuchi Ken				*
 * Date: 20120302_150232
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the Sub1_q25_get_ascii_value
 * <Source>
 * 	1.
 ************************************/

public class Sub1_q25_get_ascii_value {
	public  static void main(String[] args) {
		/* variables		*/
		char		c1		= 'A';
		
		/* show ascii code		*/
		System.out.printf("%c=%d\n", c1, (int)c1);
		c1 = 'B';
		System.out.printf("%c=%d\n", c1, (int)c1);
		
		/* show several chars	*/
		for (int i = 60; i < 120; i++) {
			System.out.printf("%c=%d ", (char)i, i);
		}
		
	}//public  static void main(String[] args)	
}//public class Sub1_q25_get_ascii_value
