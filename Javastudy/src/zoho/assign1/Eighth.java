/**
 * 
 */
package zoho.assign1;

import java.util.Scanner;

/**
 * @author jaya-8047
 *
 */
public class Eighth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int n = scan.nextInt();
		String [] strarray = new String [n];
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		// is there any method to point scanner to nextline
		System.out.println("Enter the strings");
		for (int i = 0; i < n; i++) {
			strarray[i] = scan.nextLine();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int c = strarray[i].compareTo(strarray[j]);
				if (c > 0 ) {
					String temp = strarray[i];
					strarray[i] = strarray[j];
					strarray[j] = temp;
				}
				
			}
		}
		System.out.println("Sorted String array");
		for (int i = 0; i < n; i++) {
			System.out.println(strarray[i]);
		}
		scan.close();
	}

}
