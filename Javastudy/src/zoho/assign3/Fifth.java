/**
 * 
 */
package zoho.assign3;

import java.util.Scanner;

/**
 * @author jaya-8047
 *
 */
public class Fifth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string ");
		StringBuffer str = new StringBuffer(scan.nextLine());
		System.out.println("Enter the char to be searched ");
		char sear = scan.nextLine().charAt(0);
		System.out.println("Enter the char to be replaced ");
		char replace = scan.nextLine().charAt(0);
		StringBuffer modstr = new StringBuffer();
		for (int i = 0;i < str.length();i++) {
			if (str.charAt(i) == sear) {
				modstr.append(replace);
			}else modstr.append(str.charAt(i));
		}
		System.out.println("String after the replacement " + modstr);
		//Using String method
		/*String newstr = str.toString();
		String FinalString = newstr.replace(sear, replace);
		System.out.println("String after the replacement " + FinalString);*/
		scan.close();
	}

}
