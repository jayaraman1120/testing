/**
 * 
 */
package zoho.assign1;

import java.util.Scanner;

/**
 * @author jaya-8047
 *
 */
public class Third {

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
		for (int i = 0; i< n; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i< n; i++) {
			for (int j = i; j < n; j++) {
				if (arr[i] > arr[j]) { 
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
				}
		}
		
		System.out.println("Array in sorting order ");
		for (int i = 0; i< n; i++) {
			System.out.println(arr[i]);
		}
		scan.close();

	}

}
