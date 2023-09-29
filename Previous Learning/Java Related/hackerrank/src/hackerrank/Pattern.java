/**
 * 
 */
package hackerrank;

import java.util.Scanner;

/**
 * @author jaya-8047
 *
 */
public class Pattern {

	/**
	 * @param args
	 */
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scan.nextInt();
		for (int i = 0; i < n;i++) {
			//for (int j = 0;j < n-1-i ;j++) {
			String str = "Abc";
				//System.out.print(str.repeat(3));
			//}
			for (int k = 0;k <= i;k++) {
			String star = (k < i) ? "* " : "*";
			System.out.print(star);
			}
//			for (int j = 0;j < n-1-i ;j++) {
//				System.out.print(" ");
//			}
			System.out.print("\n");
			}
		}
	}
