/**
 * 
 */
package zoho.assign3;

import java.util.Scanner;

/**
 * @author jaya-8047
 *
 */
public class First {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two strings");
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		comparewithCase(str1,str2);
		compareignoreCase(str1,str2);
		scan.close();
	}
	static void comparewithCase(String str1, String str2) {
		if (str1.equals(str2)) {
			System.out.println("Both strings including case are equal");
		}else {
			System.out.println("Both strings including case are not equal");
		}
	}
	static void compareignoreCase(String str1, String str2) {
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Both strings are equal by ignoring care");
		}else {
			System.out.println("Both strings are not equal by ignoring case");
		}
	}

}
