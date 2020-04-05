/**
 * 
 */
package zoho.assign3;
import java.util.*;
/**
 * @author jaya-8047
 *
 */
//regex can be used, Split, Apache commons library provide StringUtils.countMatches
public class Second {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter string");
		String str = scan.nextLine();
		System.out.println("Please enter substring to find occurrence");
		String substr = scan.nextLine();
		countOccur(str,substr);
		scan.close();
	}
	static void countOccur(String str,String substr) {
		int n = 0;
		int startindex = 0;
		while (str.indexOf(substr,startindex) != -1) {
			n++;
			startindex = str.indexOf(substr,startindex)+1;
		}
		if (n > 0) System.out.println("Number of Occurrence of Substring "+substr+" in string "+str+" is "+n);
		if (n == 0) System.out.println("Entered substring is not found in string");
	}
}
