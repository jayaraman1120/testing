/**
 * 
 */
package zoho.assign3;

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
		System.out.println("Enter the string ");
		String str = scan.nextLine();
		System.out.println("Enter the string to be searched");
		String searstr = scan.nextLine();
		System.out.println("Enter the string to be replaced");
		String replstr = scan.nextLine();
		Sixth methodobj = new Sixth();
		methodobj.replaceString(str, searstr, replstr);
		scan.close();
	}
	void replaceString(String str, String searstr, String replstr) {
		StringBuffer strbuffer = new StringBuffer(str);
		int i = 0;
		while (i < strbuffer.length()) {
			int index = strbuffer.indexOf(searstr);
			if (index != -1) {
				strbuffer.replace(index,index+searstr.length(),replstr);
				i = index + searstr.length();
			}else break ;
		}
		//str = str.replaceAll(searstr, replstr);
		System.out.println("String after operation performed "+ strbuffer);
	}
}
