/**
 * 
 */
package zoho.assign2;

import java.util.Scanner;

/**
 * @author jaya-8047
 *
 */
public class Eleventh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the float value");
		Float f = scan.nextFloat();
		//double number = (double) f;
		//Double number = Double.valueOf(f);
		Integer number = f.intValue();
		Double number1 = f.doubleValue();
		System.out.println("Int value of "+f+" is "+number);
		System.out.println("Double value of "+f+" is "+number1);
		scan.close();
	}

}
