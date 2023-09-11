/**
 * 
 */
package zoho.assign3;

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
		System.out.println("Enter the string ");
		String str = scan.nextLine();
		System.out.println("Enter the delimiter");
		String delimiter = scan.nextLine();
		//char [] delim = new char [] {' ',','};For multiple delimiter provide them in enclosed bracket [, ]
		String splittedstr[] = str.split(delimiter);
		System.out.println("String after delimited ");
		for (String eachstr : splittedstr) {
			System.out.println(eachstr);
		}
		scan.close();
	}

}
