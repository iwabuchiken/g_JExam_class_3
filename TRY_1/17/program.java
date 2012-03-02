/************************************`
 * program.java
 * Author: Iwabuchi Ken				*
 * Date: 20120302_150232
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

public class program {
	public  static void main(String[] args) {
		/* variables		*/
		String	names[]	= {"食パン", "ハム", "バター", "卵"};
		int		prices[]		= {150, 200, 50, 500};
		int[]		quantities	= {20, 10, 5, 40};
		boolean	sales[]	= {true, false, false, true};
		Food[]	foods		= new Food[4];
		int		sum			= 0;		/* sum of Uriage		*/
		
		/* calculate		*/
		for (int i = 0; i  < foods.length; i++) {
			/* initialize		*/
			foods[i]		= new Food();
			/* set data		*/
			foods[i].setData(names[i], prices[i], quantities[i], sales[i]);
			/* show uriage	*/
			System.out.println(foods[i].getName() + "\t" + foods[i].getUriage());
			/* add up the sum	*/
			sum += foods[i].getUriage();
			
		}//for (int i = 0; i  < foods.length; i++)
		
		/* show the entire sum		*/		
		System.out.println("Sum\t" + sum);
		
	}//public  static void main(String[] args)	
}//public class program

class Food {
	/* variables		*/
	String		name;
	int			tanka;
	int			kosu;
	boolean	flag;
	
	void setData
	(String foodName, int foodTanka, int foodKosu, boolean foodFlag) {
		/* variables		*/
		name		= foodName;
		tanka		= foodTanka;
		kosu		= foodKosu;
		flag		= foodFlag;
	}//void setData
	
	String getName() {
		if (name != null) {
			return name;
		} else {
			return "Name not set";
		}
	}//String getName()
	
	int getUriage() {
		int	waribiki		= 0;		/* discount amout: 0-100	*/
		
		/* set waribiki		*/
		if (flag == true) {
			waribiki = 10;
		}
		
		/* calc Uriage		*/
		int	uriage	= (tanka * kosu * (100 - waribiki)) / 100;
		
		/* return			*/
		return uriage;
	}
}