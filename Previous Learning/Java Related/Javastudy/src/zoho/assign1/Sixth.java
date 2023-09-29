/**
 * 
 */
package zoho.assign1;

import java.util.Scanner;

/**
 * @author jaya-8047
 *
 */
public class Sixth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scan.nextLine();
		char [] arr = string.toCharArray();
		char [] revarr = new char [arr.length];
		for (int i = 0; i < arr.length; i++) {
		revarr[i] = arr[arr.length -i-1];
		}
		String revstring = new String (revarr);
		if (string.equalsIgnoreCase(revstring)) {
			System.out.println("given string "+ string+ " is palindrome");
		}else {
			System.out.println("given string "+string+ " is not palindrome");
		}
		scan.close();
	}

}
