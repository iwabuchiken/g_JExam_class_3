/************************************`
 * Sub3_q21_initialize_array.java
 * Author: Iwabuchi Ken				*
 * Date: 20120302_093458
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

public class Sub3_q21_initialize_array {
	public  static void main(String[] args) {
		/* variables			*/
		String		a1[]	= {"abc", "def"};		/* array of strings		*/
		String		a2[];		/* array of strings		*/
		
		/* initialize				*/
//		a2	= {"abc", "def"};
//		=> ���̊J�n���s���ł��B
//		a2		= new String[];
		//=> �z��̑傫�����w�肳��Ă��܂���B
//		a2		= new String[2];
		
		/* show values	*/
		System.out.println("<a1>" + a1.toString());
		for (int i = 0; i < a1.length; i++) {
			System.out.printf("a1[%d]=%s\n", i, a1[i]);
		}
		
		/* show: a2		*/
//		System.out.println("<a2>" + a2.toString());
		//=> �ϐ� a2 �͏���������Ă��Ȃ��\��������܂��B
		a2		= null;
//		System.out.println("<a2>" + a2.toString());
		//=> java.lang.NullPointerException
		
	}//public  static void main(String[] args)
}//public class Sub3_q21_initialize_array
