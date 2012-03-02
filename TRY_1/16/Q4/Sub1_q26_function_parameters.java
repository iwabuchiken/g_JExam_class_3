/************************************`
 * Sub1_q26_function_parameters.java
 * Author: Iwabuchi Ken				*
 * Date: 20120302_093458
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

public class Sub1_q26_function_parameters {
	public  static void main(String[] args) {
		/* variables			*/
		
		/* show message	*/
//		show();
		//=> 適用できません
		show(100);
		
//		System.out.println("data=" + data);
		
	}//public  static void main(String[] args)
	
//	static void show(100, 200) {
	//=> 型の開始が不正です。
	static void show(int n1) {
		System.out.println("show");
		System.out.println("n1=" + n1);
//		System.out.println("n1: " + ((Integer)n1).class.getName());
		System.out.println("n1: " + (Integer.valueOf(n1)).getClass().getName());
		System.out.println("n1: " + Integer.valueOf(n1).getClass().getName());
		/*
			show
			n1=100
			n1: java.lang.Integer
			n1: java.lang.Integer
		 */
//		System.out.println(n1.getClass().getName());
		//=> int は間接参照できません。
	}
}//public class Sub1_q26_function_parameters
