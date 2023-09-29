package zoho.assign1;

import java.util.Scanner;

public class Tenth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to copy");
		String str = scan.nextLine();
		//String str1 = new String(str);
		char [] arr = str.toCharArray();
		String strcopy = "";
		for (char a : arr) {
			strcopy += a;
		}
		System.out.println("copied string value is " + strcopy);
		scan.close();
	}
}
