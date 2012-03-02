/************************************`
 * Q6.java
 * Author: Iwabuchi Ken				*
 * Date: 20120302_093458
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

public class Q6 {
	public  static void main(String[] args) {
		/* declare variables, and set values		*/
		if (args.length < 2) {
			System.out.println("2 arguments needed.");
		} else {
			/* declare: class object		*/
			MojiHikaku	obj	= new MojiHikaku();
			System.out.println("A class object declared.");
			
			/* compare 2 strings			*/
			obj.compare(args[0], args[1]);
		}
		
	}//public  static void main(String[] args)
}//public class Q6

class MojiHikaku {
	void compare(String s1, String s2) {
		int		count	= 0;	/* counter for the match	*/
		String	shorter, longer;		/* strings for comparison		*/
		
		/* set strings to the variables		*/
		if (s1.length() > s2.length()) {
			/* if s1 is longer than s2		*/
			longer	= s1;
			shorter	= s2;
		} else {
			/* if s2 is longer than s1	*/
			longer	= s2;
			shorter	= s1;
		}//if (longer.length() > shorter.length())
		
		/* count the number of match	*/
		for (int i = 0; i < shorter.length(); i++) {
			/* if the char at the index in shorter
			 * is equal to that in longer, increment count 
			 */
			if (shorter.charAt(i) == longer.charAt(i)) {
				count ++;
			}//if (shorter.charAt(i) == longer.charAt(i))
		}//for (int i = 0; i < shorter.length(); i++)
		
		/* calculate the percentage	*/
		int	result	= count * 100 / longer.length();
		
		/* display the result				*/
		System.out.printf("s1=%s s2=%s\n", shorter, longer);
		System.out.printf("\tresult=%d%%\n", result);
		
	}//void compare(String s1, String s2)
}//class MojiHikaku