/**
 * 
 */
package zoho.assign3;
import java.util.Scanner;
/**
 * @author jaya-8047
 *
 */
// to eliminate numeric values from given string
//Array list can be created to push values from array to list and convert back to string
//has to check pattern matcher and replace
public class Third {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter string on which numeric values to be removed");
		String str = scan.nextLine();
		eliminateNumeric(str);
		scan.close();
	}
	/*static void eliminateNumeric(String str) {
		char [] chararr = str.toCharArray();
		String modifiedstr = "";
		for (char a :chararr) {
			if ((int) a <= 57 && (int) a >= 48  ) {
				System.out.println(a);	
			}else {
				modifiedstr +=a;
			}
		}
		System.out.println("Modified String " + modifiedstr);
	}*/
	
	static void eliminateNumeric(String str) {
		char [] chararr = str.toCharArray();
		StringBuffer finalstr = new StringBuffer();
		for (char a :chararr) {
			if ((int) a <= 57 && (int) a >= 48  ) {
				//Just skipped
			}else {
				finalstr.append(a);
			}
		}
		System.out.println("Modified String " + finalstr);
	}
	
	/*static void eliminateNumeric(String str) {
		StringBuffer finalstr = new StringBuffer(str);
		char [] chararr = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(chararr[i]);
			if ((int) chararr[i] <= 57 && (int) chararr[i] >= 48  ) {
				finalstr.deleteCharAt(finalstr.indexOf((String) chararr[i]));
				System.out.println(chararr[i]);
			}
		}
		System.out.println("Modified String " + finalstr);
	}*/
	
}
