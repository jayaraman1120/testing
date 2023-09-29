package zoho.assign3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Eighth {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = scan.nextLine();
		System.out.println("Enter the delimiter");
		String delimiter = scan.nextLine();
		StringTokenizer strtokens = new StringTokenizer(str,delimiter);
		System.out.println("String tokens are");
		while (strtokens.hasMoreTokens()) {
			System.out.println(strtokens.nextToken());
		}
		scan.close();
	}
}
