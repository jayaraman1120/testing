/**
 * 
 */
package zoho.assign2;

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
		System.out.println("Please Enter two strings whinch to be concatenated");
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		//String str3 = str1.concat(str2);
		//String str3 = str1 +str2;
		String str3 = str1;
		char [] str2arr = str2.toCharArray();
		for (char a : str2arr) {
			str3 = str3+a;
		}
		System.out.println("Resultant String "+ str3);
		scan.close();
	}

}
