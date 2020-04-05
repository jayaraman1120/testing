/**
 * 
 */
package zoho.assign3;

import java.util.Scanner;

/**
 * @author jaya-8047
 *
 */
public class Fourth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string ");
		StringBuffer str = new StringBuffer(scan.nextLine());
		System.out.println("Enter the substring");
		String substr = scan.nextLine();
		int i = 0;
		while (i < str.length()) {
		int index = str.indexOf(substr,i);
		if (index != -1) {
		int end = substr.length()+index;
		System.out.println(index + "" +end);
		i += index;
		} else {
			break;
		}
		}
		System.out.println("String after elimination "+ str);
		scan.close();
	//if it is string , Str.replace function can be used
	}

}
