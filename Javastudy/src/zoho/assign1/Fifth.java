/**
 * 
 */
package zoho.assign1;

import java.util.Scanner;

/**
 * @author jaya-8047
 *
 */
public class Fifth {

	/**
	 * @param args
	 */
	int fact (int n) {
		if (n == 1) return 1;
		else return n * fact (n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find ");
		int n = scan.nextInt();
		Fifth factorial = new Fifth();
		System.out.println("Factorial of "+n+" is " +factorial.fact(n));
		scan.close();
	}

}
