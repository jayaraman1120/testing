/**
 * 
 */
package zoho.assign1;

import java.util.Scanner;

/**
 * @author jaya-8047
 *
 */
public class Seventh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scan.nextLine();
		char [] arr = string.toCharArray();
		int i = 0;
		for (char a : arr) {
			i++;
		}
		System.out.println("Length of given array is "+i);
		scan.close();
	}

}
