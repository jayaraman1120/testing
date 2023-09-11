/**
 * 
 */
package zoho.assign1;

import java.util.Scanner;

/**
 * @author jaya-8047
 *
 */
/* Assumed that given array is Positive only */
public class Second {

	/**
	 * @param args
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of Array");
		int n = scan.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter the positive values of array one by one");
		int biggest = 0;
		for (int i = 0; i< n; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] > biggest) biggest = arr[i];
		}
		/*int biggest = arr[0];
		for (int i = 0; i< n; i++) {
			if (arr[i] > biggest) biggest = arr[i];
		}*/
		System.out.println("Biggest number in given array " + biggest);
		scan.close();
	}

}
